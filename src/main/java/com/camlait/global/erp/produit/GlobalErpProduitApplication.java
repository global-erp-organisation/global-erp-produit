package com.camlait.global.erp.produit;

import java.util.Collection;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.camlait.global.erp.domain.config.GlobalAppConstants;
import com.camlait.global.erp.domain.produit.CategorieProduit;
import com.camlait.global.erp.domain.produit.Produit;
import com.camlait.global.erp.service.produit.IProduitService;

@SpringBootApplication
@EnableTransactionManagement
@EntityScan(GlobalAppConstants.DOMAIN_BASE_PACKAGE)
@EnableJpaRepositories(GlobalAppConstants.DAO_BASE_PACKAGE)
public class GlobalErpProduitApplication {
    
    @Autowired
    IProduitService produitService;
    
    public static void main(String[] args) {
        SpringApplication.run(GlobalErpProduitApplication.class, args);
    }
    
    @PostConstruct
    public void test() {
        System.out.println("------------------------------------------");
        try {
            CategorieProduit c = produitService.obtenirCategorieProduit(3L);           
            Collection<Produit> produits = produitService.listerProduit(c);
            produits.stream().forEach(pr -> {
                System.out.println(pr);
            });
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-------------------------------------------");
    }
}
