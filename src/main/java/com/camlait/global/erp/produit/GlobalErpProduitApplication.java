package com.camlait.global.erp.produit;

import java.util.Collection;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.camlait.global.erp.domain.bmq.Bmq;
import com.camlait.global.erp.domain.config.GlobalAppConstants;
import com.camlait.global.erp.domain.entrepot.Entrepot;
import com.camlait.global.erp.domain.entrepot.MagasinFixe;
import com.camlait.global.erp.domain.entrepot.MagasinMobile;
import com.camlait.global.erp.domain.enumeration.Portee;
import com.camlait.global.erp.domain.organisation.Centre;
import com.camlait.global.erp.domain.organisation.Region;
import com.camlait.global.erp.domain.organisation.Secteur;
import com.camlait.global.erp.domain.organisation.Zone;
import com.camlait.global.erp.domain.partenaire.ClientAmarge;
import com.camlait.global.erp.domain.partenaire.ClientComptant;
import com.camlait.global.erp.domain.partenaire.Employe;
import com.camlait.global.erp.domain.partenaire.Vendeur;
import com.camlait.global.erp.domain.produit.CategorieProduit;
import com.camlait.global.erp.domain.produit.Produit;
import com.camlait.global.erp.service.bmq.IBmqService;
import com.camlait.global.erp.service.inventaire.IInventaireService;
import com.camlait.global.erp.service.organisation.ILocalisationService;
import com.camlait.global.erp.service.partenaire.IPartenaireService;
import com.camlait.global.erp.service.produit.IProduitService;

@SpringBootApplication
@EnableTransactionManagement
@EntityScan(GlobalAppConstants.DOMAIN_BASE_PACKAGE)
@EnableJpaRepositories(GlobalAppConstants.DAO_BASE_PACKAGE)
public class GlobalErpProduitApplication {
	@Autowired
	private IBmqService bmqService;

	@Autowired
	private IInventaireService inventaireService;

	@Autowired
	private ILocalisationService localisationService;

	@Autowired
	private IPartenaireService partenaireService;

	@Autowired
	private IProduitService produitService;
	
	public static void main(String[] args) {
		SpringApplication.run(GlobalErpProduitApplication.class, args);
	}

	@PostConstruct
    public void test() {
        
 	    produitService.listerCategorieProduit().stream().forEach(c->{
 	        System.out.println(c);
 	        Collection<Produit> p = produitService.obtenirCategorieProduit(c.getCategorieProduitId()).getProduits();
 	        if(!p.isEmpty())
 	            p.stream().forEach(r->{
 	                System.out.println("---"+r);
 	            });
 	    });
      }
}
