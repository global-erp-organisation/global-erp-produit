package com.camlait.global.erp.produit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.camlait.global.erp.service.auth.AuthentificationServiceDelegate;

@RestController
public class MenuController {

	@Autowired
	private AuthentificationServiceDelegate service;

	@RequestMapping(value = "/menuItem", method = RequestMethod.GET)
	public Map<String, Object> getMenu() {
		return service.menuItem();
	}
}