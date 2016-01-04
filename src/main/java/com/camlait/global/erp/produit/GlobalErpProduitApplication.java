package com.camlait.global.erp.produit;

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
import com.camlait.global.erp.domain.organisation.Centre;
import com.camlait.global.erp.domain.organisation.Region;
import com.camlait.global.erp.domain.organisation.Secteur;
import com.camlait.global.erp.domain.organisation.Zone;
import com.camlait.global.erp.domain.partenaire.ClientAmarge;
import com.camlait.global.erp.domain.partenaire.ClientComptant;
import com.camlait.global.erp.domain.partenaire.Employe;
import com.camlait.global.erp.domain.partenaire.Vendeur;
import com.camlait.global.erp.service.bmq.IBmqService;
import com.camlait.global.erp.service.inventaire.IInventaireService;
import com.camlait.global.erp.service.organisation.ILocalisationService;
import com.camlait.global.erp.service.partenaire.IPartenaireService;

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

	public static void main(String[] args) {
		SpringApplication.run(GlobalErpProduitApplication.class, args);
	}

	@PostConstruct
    public void test() {
        
       /*Centre c = new Centre();
        c.setDescriptionLocal("Centre de bassa");
        localisationService.ajouterLocalisation(c);
        Region r = new Region();
        r.setCentre(c);
        r.setDescriptionLocal("Region du littoral");
        localisationService.ajouterLocalisation(r);
        Secteur s = new Secteur();
        s.setDescriptionLocal("Secteur village");
        s.setRegion(r);
        localisationService.ajouterLocalisation(s);
        Zone z = new Zone();
        z.setSecteur(s);
        z.setDescriptionLocal("Zone PL");
        localisationService.ajouterLocalisation(z);
        
        Employe em = new Employe();
        em.setCentre(c);
        em.setMatricule("EMP2350");
        em.setNom("Signe");
        em.setPrenom("Martin Blaise");
        em.setTelephone("438-879-2001");
        partenaireService.ajouterPartenaire(em);
        
        Vendeur v = new Vendeur();
        v.setCentre(c);
        v.setMatricule("EMP2300");
        v.setNom("Fosto");
        v.setPrenom("Jean Bonbon");
        v.setTelephone("514-354-0791");
        v.setZoneDeVente(z);
        partenaireService.ajouterPartenaire(v);
        
        ClientComptant cc = new ClientComptant();
        cc.setCentre(c);
        cc.setZone(z);
        cc.setDescription("Client comptant");
        partenaireService.ajouterPartenaire(cc);
        
        ClientAmarge cm = new ClientAmarge();
        cm.setCentre(c);
        cm.setZone(z);
        cm.setDescription("Boulangerie patisserie Zepol");
        partenaireService.ajouterPartenaire(cm);

        Entrepot e = new Entrepot();
        e.setCentre(c);
        e.setDescriptionEntrepot("Entrepot de douala");
        e.setResponsable(em);
        inventaireService.ajouterEntrepot(e);
        
        MagasinFixe mf = new MagasinFixe();
        mf.setAdresse("4587 rue dogbong");
        mf.setDescriptionMagasin("Magasin principal de dogbong");
        mf.setEntrepot(e);
        inventaireService.ajouterMagasin(mf);
        
        MagasinMobile mm = new MagasinMobile();
        mm.setDescriptionMagasin("Magasin mobile de Kaptue");
        mm.setEntrepot(e);
        inventaireService.ajouterMagasin(mm);
        
        Bmq b = new Bmq();
        b.setDateBmq(new Date());
        b.setMagasin(mm);
        b.setResponsable(em);
        b.setVendeur(v);
        bmqService.ajouterBmq(b);*/
        
      }
}
