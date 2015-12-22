package com.camlait.global.erp.produit.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.camlait.global.erp.dao.produit.CategorieProduitDao;
import com.camlait.global.erp.produit.service.CategorieProduitService;

@Configuration
public class ProduitConfiguration {

    @Bean
    public CategorieProduitService categorieService(CategorieProduitDao categorieDao){
        return new CategorieProduitService(categorieDao);
    }
}
