package com.camlait.global.erp.produit.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.camlait.global.erp.dao.produit.CategorieProduitDao;
import com.camlait.global.erp.produit.service.CategorieProduitService;
import com.camlait.global.erp.produit.service.ICategorieProduitService;

@Configuration
public class ProduitConfiguration {

    @Bean
    public ICategorieProduitService categorieService(CategorieProduitDao categorieDao){
        return new CategorieProduitService(categorieDao);
    }
}
