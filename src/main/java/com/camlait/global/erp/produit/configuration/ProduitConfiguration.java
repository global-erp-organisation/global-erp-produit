package com.camlait.global.erp.produit.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.camlait.global.erp.service.produit.IProduitService;
import com.camlait.global.erp.service.produit.ProduitService;

@Configuration
public class ProduitConfiguration {

	@Bean
	public IProduitService produitService() {
		return new ProduitService();
	}
}
