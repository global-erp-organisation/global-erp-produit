package com.camlait.global.erp.produit;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.camlait.global.erp.domain.auth.Langue;
import com.camlait.global.erp.domain.config.GlobalAppConstants;
import com.camlait.global.erp.service.auth.IAuthentificationService;

@SpringBootApplication
@EnableTransactionManagement
@EntityScan(GlobalAppConstants.DOMAIN_BASE_PACKAGE)
@EnableJpaRepositories(GlobalAppConstants.DAO_BASE_PACKAGE)
public class GlobalErpProduitApplication {
    
    @Autowired
    private IAuthentificationService service;
    
    public static void main(String[] args) {
        SpringApplication.run(GlobalErpProduitApplication.class, args);
    }
    
    @PostConstruct
    public void test() {
        /*service.ajouterLangue(new Langue("fr", "Francais", "France"));
        service.ajouterLangue(new Langue("us", "English (US)", "United state"));
        service.ajouterLangue(new Langue("de", "German", "Germany"));
        service.ajouterLangue(new Langue("es", "Spanish", "Español"));
        service.ajouterLangue(new Langue("jp", "Japan", "日本語"));
        service.ajouterLangue(new Langue("zh", "China", "中文"));
        service.ajouterLangue(new Langue("pt", "Portugal", "Portugal"));
        service.ajouterLangue(new Langue("ru", "Russia", "Русский язык"));
        service.ajouterLangue(new Langue("kr", "Korea", "한국어"));*/
    }
}
