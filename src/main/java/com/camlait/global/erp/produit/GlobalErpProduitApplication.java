package com.camlait.global.erp.produit;

import java.util.Collection;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.camlait.global.erp.domain.auth.Ressource;
import com.camlait.global.erp.domain.config.GlobalAppConstants;
import com.camlait.global.erp.service.auth.IAuthentificationService;
import com.camlait.global.erp.service.produit.IProduitService;

@SpringBootApplication
@EnableTransactionManagement
@EntityScan(GlobalAppConstants.DOMAIN_BASE_PACKAGE)
@EnableJpaRepositories(GlobalAppConstants.DAO_BASE_PACKAGE)
public class GlobalErpProduitApplication {

	@Autowired
	private IAuthentificationService service;

	@Autowired
	private IProduitService sp;

	public static void main(String[] args) {
		SpringApplication.run(GlobalErpProduitApplication.class, args);
	}

	@PostConstruct
	public void test() {
		/*
		 * service.ajouterLangue(new Langue("fr", "Francais", "France"));
		 * service.ajouterLangue(new Langue("us", "English (US)", "United state"
		 * )); service.ajouterLangue(new Langue("de", "German", "Germany"));
		 * service.ajouterLangue(new Langue("es", "Spanish", "Español"));
		 * service.ajouterLangue(new Langue("jp", "Japan", "日本語"));
		 * service.ajouterLangue(new Langue("zh", "China", "中文"));
		 * service.ajouterLangue(new Langue("pt", "Portugal", "Portugal"));
		 * service.ajouterLangue(new Langue("ru", "Russia", "Русский язык"));
		 * service.ajouterLangue(new Langue("kr", "Korea", "한국어"));
		 */

		/*Ressource tb = new Ressource();
		tb.setClasseIcon("fa fa-lg fa-fw fa-home ");
		tb.setDescriptionRessource("Dashboard");
		tb.setAppLocalisation("app.dashboard");
		service.ajouterRessource(tb);

		Ressource gp = new Ressource();
		gp.setClasseIcon("fa fa-lg fa-fw fa-inbox");
		gp.setAppLocalisation("app.inbox.folder");
		gp.setDescriptionRessource("Inbox");
		service.ajouterRessource(gp);
		
		Ressource p = new Ressource();
		p.setClasseIcon("fa fa-lg fa-fw fa-bar-chart-o");
		p.setDescriptionRessource("Graphs");
		service.ajouterRessource(p);
		
		Ressource pa = new Ressource();
		pa.setRessourceParent(p);
		pa.setAppLocalisation("app.graphs.flot");
		pa.setDescriptionRessource("Flot Chart");
		service.ajouterRessource(pa);
		
		Ressource pm = new Ressource();
		pm.setRessourceParent(p);
		pm.setAppLocalisation("app.graphs.inline");
		pm.setDescriptionRessource("Inline Charts");
		service.ajouterRessource(pm);

		pm = new Ressource();
		pm.setRessourceParent(p);
		pm.setAppLocalisation("app.graphs.morris");
		pm.setDescriptionRessource("Morris Charts");
		service.ajouterRessource(pm);
		
		pm = new Ressource();
		pm.setRessourceParent(p);
		pm.setAppLocalisation("app.graphs.dygraphs");
		pm.setDescriptionRessource("Dygraphs");
		service.ajouterRessource(pm);

		p = new Ressource();
		p.setClasseIcon("fa fa-lg fa-fw fa-table");
		p.setDescriptionRessource("Tables");
		service.ajouterRessource(p);
		
		pa = new Ressource();
		pa.setRessourceParent(p);
		pa.setAppLocalisation("app.tables.normal");
		pa.setDescriptionRessource("Normal Tables");
		service.ajouterRessource(pa);
		
		pm = new Ressource();
		pm.setRessourceParent(p);
		pm.setAppLocalisation("app.tables.datatables");
		pm.setDescriptionRessource("Data Tables");
		service.ajouterRessource(pm);

		pm = new Ressource();
		pm.setRessourceParent(p);
		pm.setAppLocalisation("app.tables.jqgrid");
		pm.setDescriptionRessource("Jquery Grid");
		service.ajouterRessource(pm);
		
		
		p = new Ressource();
		p.setClasseIcon("fa fa-lg fa-fw fa-pencil-square-o");
		p.setDescriptionRessource("Forms");
		service.ajouterRessource(p);
		
		pa = new Ressource();
		pa.setRessourceParent(p);
		pa.setAppLocalisation("app.form.elements");
		pa.setDescriptionRessource("Smart Form Elements");
		service.ajouterRessource(pa);
		
		pm = new Ressource();
		pm.setRessourceParent(p);
		pm.setAppLocalisation("app.form.layouts");
		pm.setDescriptionRessource("Smart Form Layouts");
		service.ajouterRessource(pm);

		pm = new Ressource();
		pm.setRessourceParent(p);
		pm.setAppLocalisation("app.form.validation");
		pm.setDescriptionRessource("Smart Form Validation");
		service.ajouterRessource(pm);

		pa = new Ressource();
		pa.setRessourceParent(p);
		pa.setAppLocalisation("app.form.bootstrapForms");
		pa.setDescriptionRessource("Bootstrap Form Elements");
		service.ajouterRessource(pa);
		
		pm = new Ressource();
		pm.setRessourceParent(p);
		pm.setAppLocalisation("app.form.bootstrapValidation");
		pm.setDescriptionRessource("Bootstrap Form Validation");
		service.ajouterRessource(pm);

		pm = new Ressource();
		pm.setRessourceParent(p);
		pm.setAppLocalisation("app.form.plugins");
		pm.setDescriptionRessource("Form Plugins");
		service.ajouterRessource(pm);

	
		pm = new Ressource();
		pm.setRessourceParent(p);
		pm.setAppLocalisation("app.form.wizards");
		pm.setDescriptionRessource("Wizards");
		service.ajouterRessource(pm);

		pa = new Ressource();
		pa.setRessourceParent(p);
		pa.setAppLocalisation("app.form.editors");
		pa.setDescriptionRessource("Bootstrap Editors");
		service.ajouterRessource(pa);
		
		pm = new Ressource();
		pm.setRessourceParent(p);
		pm.setAppLocalisation("app.form.dropzone");
		pm.setDescriptionRessource("Dropzone");
		service.ajouterRessource(pm);

		pm = new Ressource();
		pm.setRessourceParent(p);
		pm.setAppLocalisation("app.form.imageEditor");
		pm.setDescriptionRessource("Image Cropping");
		service.ajouterRessource(pm);*/

		
		Collection<Ressource> rs = service.listerRessource();
		System.out.println(service.genererMenu(rs));
	}
}
