package com.camlait.global.erp.produit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.camlait.global.erp.domain.config.GlobalAppConstants;

@SpringBootApplication
@EntityScan(GlobalAppConstants.ENTITY_BASE_PACKAGE)
@EnableJpaRepositories(GlobalAppConstants.DAO_BASE_PACKAGE)
public class GlobalErpProduitApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(GlobalErpProduitApplication.class, args);
    }
}
