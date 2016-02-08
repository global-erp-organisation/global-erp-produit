package com.camlait.global.erp.produit.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.camlait.global.erp.service.auth.AuthentificationService;
import com.camlait.global.erp.service.auth.AuthentificationServiceDelegate;
import com.camlait.global.erp.service.auth.IAuthentificationService;
import com.camlait.global.erp.service.bmq.BmqService;
import com.camlait.global.erp.service.bmq.BmqServiceDelegate;
import com.camlait.global.erp.service.bmq.IBmqService;
import com.camlait.global.erp.service.caisse.CaisseService;
import com.camlait.global.erp.service.caisse.ICaisseService;
import com.camlait.global.erp.service.document.DocumentService;
import com.camlait.global.erp.service.document.IDocumentService;
import com.camlait.global.erp.service.inventaire.IInventaireService;
import com.camlait.global.erp.service.inventaire.InventaireService;
import com.camlait.global.erp.service.organisation.ILocalisationService;
import com.camlait.global.erp.service.organisation.LocalisationService;
import com.camlait.global.erp.service.organisation.LocalisationServiceDelegate;
import com.camlait.global.erp.service.partenaire.IPartenaireService;
import com.camlait.global.erp.service.partenaire.PartenaireService;
import com.camlait.global.erp.service.produit.IProduitService;
import com.camlait.global.erp.service.produit.ProduitService;
import com.camlait.global.erp.service.produit.ProduitServiceDelegate;
import com.camlait.global.erp.service.util.IUtilService;
import com.camlait.global.erp.service.util.UtilService;

@Configuration
public class ProduitConfiguration {

	@Bean
	public AuthentificationServiceDelegate authentificationService() {
		return new AuthentificationServiceDelegate();
	}

	@Bean
	public IBmqService bmqService() {
		return new BmqService();
	}

	@Bean
	public IProduitService produitService() {
		return new ProduitService();
	}

	@Bean
	public IPartenaireService partenaireService() {
		return new PartenaireService();
	}

	@Bean
	public IInventaireService inventaireService() {
		return new InventaireService();
	}

	@Bean
	public IDocumentService documentService() {
		return new DocumentService();
	}

	@Bean
	public IUtilService utilService() {
		return new UtilService();
	}

	@Bean
	public ICaisseService caisseService() {
		return new CaisseService();
	}

	@Bean
	public ILocalisationService localService() {
		return new LocalisationService();
	}

	@Bean
	public LocalisationServiceDelegate localServiceDelegate() {
		return new LocalisationServiceDelegate();
	}

	@Bean
	public ProduitServiceDelegate produitServiceDelegate() {
		return new ProduitServiceDelegate();
	}

	@Bean
	public BmqServiceDelegate bmqServiceDelegate() {
		return new BmqServiceDelegate();
	}

	@Bean
	public IAuthentificationService authentificationServie() {
		return new AuthentificationService();
	}
}
