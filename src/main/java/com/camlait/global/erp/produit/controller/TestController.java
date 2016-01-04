package com.camlait.global.erp.produit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping(value="/html/index.html#/calendar")
	public String calendar(){
		return "test";
	}

}
