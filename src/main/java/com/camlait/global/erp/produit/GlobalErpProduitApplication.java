package com.camlait.global.erp.produit;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.camlait.global.erp.domain.config.GlobalAppConstants;
import com.camlait.global.erp.domain.enumeration.Portee;
import com.camlait.global.erp.domain.produit.CategorieProduit;
import com.camlait.global.erp.domain.produit.Produit;
import com.camlait.global.erp.produit.service.ICategorieProduitService;
import com.camlait.global.erp.produit.service.IProduitService;

@SpringBootApplication
@EntityScan(GlobalAppConstants.ENTITY_BASE_PACKAGE)
@EnableJpaRepositories(GlobalAppConstants.DAO_BASE_PACKAGE)
public class GlobalErpProduitApplication {

	@Autowired
	ICategorieProduitService categorieProduitService;

	@Autowired
	IProduitService produitService;

	public static void main(String[] args) {
		SpringApplication.run(GlobalErpProduitApplication.class, args);
	}

	@PostConstruct
	public void test() {
		CategorieProduit c = new CategorieProduit();
		c.setCategorieTaxable(true);
		c.setCodeCategorieProduit("PB");
		c.setPortee(Portee.TOTAL);
		c.setDescriptionCategorie("Produits Boissons");
		c = categorieProduitService.ajouterCategorie(c, null);
		CategorieProduit c1 = new CategorieProduit();
		c1.setCategorieTaxable(true);
		c1.setCodeCategorieProduit("River");
		c1.setPortee(Portee.DETAIL);
		c1.setDescriptionCategorie("Rivers");
		c1 = categorieProduitService.ajouterCategorie(c1, c.getCategorieProduitId());

		Produit p = new Produit();
		p.setCodeProduit("RVS");
		p.setDescriptionProduit("River Soya");
		p.setPrixUnitaireProduit(175.0);
		p.setProduitTaxable(true);
		produitService.ajouterProduit(p, c1.getCategorieProduitId());
	}
}
