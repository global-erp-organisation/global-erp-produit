package com.camlait.global.erp.produit.controller;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.camlait.global.erp.domain.auth.Langue;
import com.camlait.global.erp.domain.auth.Terme;
import com.camlait.global.erp.domain.auth.TermeLangue;
import com.camlait.global.erp.domain.model.json.auth.LangueModel;
import com.camlait.global.erp.domain.util.Compute;
import com.camlait.global.erp.service.auth.IAuthentificationService;

@RestController
@RequestMapping(value = "/langue")
public class LanguageController {

	@Autowired
	private IAuthentificationService service;

	private Compute c = new Compute();

	@RequestMapping(value = "/lister", method = RequestMethod.GET)
	public Collection<LangueModel> getLangues() {
		return service.listerLangue();
	}

	@RequestMapping(value = "/terme/{codeLangue}", method = RequestMethod.GET)
	public Map<String, String> listerTerme(@PathVariable String codeLangue) {
		return service.listerTerme(codeLangue);
	}

	@RequestMapping(value = "/load/{key}", method = RequestMethod.POST)
	public void getTerme(@RequestBody Map<String, String> termes, @PathVariable String key) {
		Langue l = service.obtenirLangue(key);
		termes.entrySet().stream().forEach(o -> {
			Terme t = service.obtenirTerme(o.getKey());
			if (t == null) {
				t = new Terme(o.getKey());
				service.ajouterTerme(t);
			}
			service.ajouterTermeLangue(new TermeLangue(t, l, o.getValue()));
		});
	}

}
