package com.camlait.global.erp.produit.controller;

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
	public String genererMenu() {
		return service.genererMenu();
	}

}
