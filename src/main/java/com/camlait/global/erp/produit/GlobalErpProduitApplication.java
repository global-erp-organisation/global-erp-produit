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
import com.camlait.global.erp.domain.util.conversion.ChiffreEnLettre;
import com.camlait.global.erp.domain.util.conversion.ChiffreEnLettreFrancais;
import com.camlait.global.erp.service.auth.AuthentificationServiceDelegate;
import com.camlait.global.erp.service.auth.IAuthentificationService;

@SpringBootApplication
@EnableTransactionManagement
@EntityScan(GlobalAppConstants.DOMAIN_BASE_PACKAGE)
@EnableJpaRepositories(GlobalAppConstants.DAO_BASE_PACKAGE)
public class GlobalErpProduitApplication {

	@Autowired
	private AuthentificationServiceDelegate service;


	public static void main(String[] args) {
		SpringApplication.run(GlobalErpProduitApplication.class, args);
	}

	@PostConstruct
	public void test() throws Exception {
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
		tb.setIcon("home");
		tb.setTitle("Dashboard");
		tb.setSref("app.dashboard");
		service.ajouterRessource(tb);

		Ressource gp = new Ressource();
		gp.setIcon("inbox");
		gp.setSref("app.inbox.folder");
		gp.setTitle("Inbox");
		service.ajouterRessource(gp);
		
		Ressource p = new Ressource();
		p.setIcon("bar-chart-o");
		p.setTitle("Graphs");
		service.ajouterRessource(p);
		
		Ressource pa = new Ressource();
		pa.setRessourceParent(p);
		pa.setSref("app.graphs.flot");
		pa.setTitle("Flot Chart");
		service.ajouterRessource(pa);
		
		Ressource pm = new Ressource();
		pm.setRessourceParent(p);
		pm.setSref("app.graphs.inline");
		pm.setTitle("Inline Charts");
		service.ajouterRessource(pm);

		pm = new Ressource();
		pm.setRessourceParent(p);
		pm.setSref("app.graphs.morris");
		pm.setTitle("Morris Charts");
		service.ajouterRessource(pm);
		
		pm = new Ressource();
		pm.setRessourceParent(p);
		pm.setSref("app.graphs.dygraphs");
		pm.setTitle("Dygraphs");
		service.ajouterRessource(pm);

		p = new Ressource();
		p.setIcon("table");
		p.setSref("app.tables.datatables");
		p.setTitle("Normal Tables");
		service.ajouterRessource(p);
		
		pa = new Ressource();
		pa.setRessourceParent(p);
		pa.setSref("app.tables.normal");
		pa.setTitle("Normal Tables");
		service.ajouterRessource(pa);
		
		pm = new Ressource();
		pm.setRessourceParent(p);
		pm.setSref("app.tables.datatables");
		pm.setTitle("Data Tables");
		service.ajouterRessource(pm);

		pm = new Ressource();
		pm.setRessourceParent(p);
		pm.setSref("app.tables.jqgrid");
		pm.setTitle("Jquery Grid");
		service.ajouterRessource(pm);
		
		
		p = new Ressource();
		p.setIcon("pencil-square-o");
		p.setSref("app.form.elements");
		p.setTitle("Form Elements");
		service.ajouterRessource(p);
		
		pa = new Ressource();
		pa.setRessourceParent(p);
		pa.setSref("app.form.elements");
		pa.setTitle("Smart Form Elements");
		service.ajouterRessource(pa);
		
		pm = new Ressource();
		pm.setRessourceParent(p);
		pm.setSref("app.form.layouts");
		pm.setTitle("Smart Form Layouts");
		service.ajouterRessource(pm);

		pm = new Ressource();
		pm.setRessourceParent(p);
		pm.setSref("app.form.validation");
		pm.setTitle("Smart Form Validation");
		service.ajouterRessource(pm);

		pa = new Ressource();
		pa.setRessourceParent(p);
		pa.setSref("app.form.bootstrapForms");
		pa.setTitle("Bootstrap Form Elements");
		service.ajouterRessource(pa);
		
		pm = new Ressource();
		pm.setRessourceParent(p);
		pm.setSref("app.form.bootstrapValidation");
		pm.setTitle("Bootstrap Form Validation");
		service.ajouterRessource(pm);

		pm = new Ressource();
		pm.setRessourceParent(p);
		pm.setSref("app.form.plugins");
		pm.setTitle("Form Plugins");
		service.ajouterRessource(pm);

	
		pm = new Ressource();
		pm.setRessourceParent(p);
		pm.setSref("app.form.wizards");
		pm.setTitle("Wizards");
		service.ajouterRessource(pm);

		pa = new Ressource();
		pa.setRessourceParent(p);
		pa.setSref("app.form.editors");
		pa.setTitle("Bootstrap Editors");
		service.ajouterRessource(pa);
		
		pm = new Ressource();
		pm.setRessourceParent(p);
		pm.setSref("app.form.dropzone");
		pm.setTitle("Dropzone");
		service.ajouterRessource(pm);

		pm = new Ressource();
		pm.setRessourceParent(p);
		pm.setSref("app.form.imageEditor");
		pm.setTitle("Image Cropping");
		service.ajouterRessource(pm);*/

		/*service.listerRessource().stream().forEach(r->{
			System.out.println(r.getTitle());
		});*/
		
		service.menuItem().entrySet().stream().forEach(e->{
			System.out.println(e.getValue()+":"+e.getValue());
		});
	}
}
