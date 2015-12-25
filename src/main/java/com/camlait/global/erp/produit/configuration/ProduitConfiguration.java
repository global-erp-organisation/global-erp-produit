package com.camlait.global.erp.produit.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.camlait.global.erp.dao.produit.CategorieProduitDao;
import com.camlait.global.erp.dao.produit.ProduitDao;
import com.camlait.global.erp.produit.service.CategorieProduitService;
import com.camlait.global.erp.produit.service.ICategorieProduitService;
import com.camlait.global.erp.produit.service.IProduitService;
import com.camlait.global.erp.produit.service.ProduitService;

@Configuration
public class ProduitConfiguration {

	@Bean
	public ICategorieProduitService categorieService(CategorieProduitDao categorieDao) {
		return new CategorieProduitService(categorieDao);
	}

	@Bean
	public IProduitService produitService(ProduitDao produitDao, ICategorieProduitService categorieProduitService) {
		return new ProduitService(produitDao, categorieProduitService);
	}
}
