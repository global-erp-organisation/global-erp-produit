package com.camlait.global.erp.produit;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

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

		/*
		 * int i = 0; Ressource root = new Ressource(); root.setIcon("root");
		 * root.setTitle("root"); root.setSref("root"); root.setOrdre(i);
		 * service.ajouterRessource(root);
		 * 
		 * Ressource tb = new Ressource(); tb.setIcon("home");
		 * tb.setTitle("Dashboard"); tb.setSref("app.dashboard");
		 * tb.setRessourceParent(root); tb.setOrdre(++i);
		 * service.ajouterRessource(tb);
		 * 
		 * Ressource gp = new Ressource(); gp.setIcon("inbox");
		 * gp.setRessourceParent(root); gp.setSref("app.inbox.folder");
		 * gp.setTitle("Inbox"); gp.setOrdre(++i); service.ajouterRessource(gp);
		 * 
		 * Ressource p = new Ressource(); p.setRessourceParent(root);
		 * p.setIcon("bar-chart-o"); p.setTitle("Graphs"); p.setOrdre(++i);
		 * service.ajouterRessource(p);
		 * 
		 * Ressource pa = new Ressource(); pa.setRessourceParent(p);
		 * pa.setSref("app.graphs.flot"); pa.setTitle("Flot Chart");
		 * pa.setOrdre(++i); service.ajouterRessource(pa);
		 * 
		 * Ressource pm = new Ressource(); pm.setRessourceParent(p);
		 * pm.setSref("app.graphs.inline"); pm.setTitle("Inline Charts");
		 * pm.setOrdre(++i); service.ajouterRessource(pm);
		 * 
		 * p = new Ressource(); p.setIcon("table"); p.setRessourceParent(root);
		 * p.setSref("app.tables.datatables"); p.setTitle("Tables");
		 * p.setOrdre(++i); service.ajouterRessource(p);
		 * 
		 * pa = new Ressource(); pa.setRessourceParent(p);
		 * pa.setSref("app.tables.normal"); pa.setTitle("Normal Tables");
		 * pa.setOrdre(++i); service.ajouterRessource(pa);
		 * 
		 * pm = new Ressource(); pm.setRessourceParent(p);
		 * pm.setSref("app.tables.datatables"); pm.setTitle("Data Tables");
		 * pm.setOrdre(++i); service.ajouterRessource(pm);
		 * 
		 * pm = new Ressource(); pm.setRessourceParent(p);
		 * pm.setSref("app.tables.jqgrid"); pm.setTitle("Jquery Grid");
		 * pm.setOrdre(++i); service.ajouterRessource(pm);
		 * 
		 * pm = new Ressource(); pm.setRessourceParent(p);
		 * pm.setSref("app.form.plugins"); pm.setTitle("Form Plugins");
		 * pm.setOrdre(++i); service.ajouterRessource(pm);
		 * 
		 * pm = new Ressource(); pm.setRessourceParent(p);
		 * pm.setSref("app.form.wizards"); pm.setTitle("Wizards");
		 * pm.setOrdre(++i); service.ajouterRessource(pm);
		 * 
		 * pm = new Ressource(); pm.setRessourceParent(p);
		 * pm.setSref("app.form.imageEditor"); pm.setTitle("Image Cropping");
		 * pm.setOrdre(++i); service.ajouterRessource(pm);
		 */

		/*
		 * service.listerRessource().stream().forEach(r->{
		 * System.out.println(r.getTitle()); });
		 */

		// service.menuItem();

	}
}
