package com.camlait.global.erp.produit.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.camlait.global.erp.service.auth.IAuthentificationService;

@RestController
public class HomeController {

	@Autowired
	private IAuthentificationService service;

	@RequestMapping(value = "/menu/{codeUtilisateur}", method = RequestMethod.GET)
	public String genererMenu(@PathVariable String codeUtilisateur) {
		return service.genererMenu(codeUtilisateur);
	}

	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public Map<String, String> genererMenu() {
		Map<String, String> m = new HashMap<String, String>();
		m.put("data", service.genererMenu());
		return m;
	}
}
