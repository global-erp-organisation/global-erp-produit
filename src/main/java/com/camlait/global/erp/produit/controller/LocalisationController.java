package com.camlait.global.erp.produit.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.camlait.global.erp.domain.model.json.organisation.CentreModel;
import com.camlait.global.erp.domain.model.json.organisation.LocalisationModel;
import com.camlait.global.erp.domain.model.json.organisation.RegionModel;
import com.camlait.global.erp.domain.model.json.organisation.SecteurModel;
import com.camlait.global.erp.domain.model.json.organisation.ZoneModel;
import com.camlait.global.erp.domain.organisation.Centre;
import com.camlait.global.erp.domain.organisation.Localisation;
import com.camlait.global.erp.domain.organisation.Region;
import com.camlait.global.erp.domain.organisation.Secteur;
import com.camlait.global.erp.service.organisation.LocalisationServiceDelegate;

@RequestMapping(value = "/organisation")
@RestController
public class LocalisationController {

	@Autowired
	private LocalisationServiceDelegate service;

	public LocalisationModel ajouterLocalisation(Localisation local) {
		return service.ajouterLocalisation(local);
	}

	public LocalisationModel modifierLocalisation(Localisation local) {
		return service.modifierLocalisation(local);
	}

	public LocalisationModel obtenirLocalisation(Long localId) {
		return service.obtenirLocalisation(localId);
	}

	public LocalisationModel obtenirLocalisation(String codeLocalisation) {
		return service.obtenirLocalisation(codeLocalisation);
	}

	public CentreModel obtenirCentre(Long localId) {
		return service.obtenirCentre(localId);
	}

	public CentreModel obtenirCentre(String codeLocalisation) {
		return service.obtenirCentre(codeLocalisation);
	}

	public RegionModel obtenirRegion(Long localId) {
		return service.obtenirRegion(localId);
	}

	public RegionModel obtenirRegion(String codeLocalisation) {
		return service.obtenirRegion(codeLocalisation);
	}

	public SecteurModel obtenirSecteur(Long localId) {
		return service.obtenirSecteur(localId);
	}

	public SecteurModel obtenirSecteur(String codeLocalisation) {
		return service.obtenirSecteur(codeLocalisation);
	}

	public ZoneModel obtenirZone(Long localId) {
		return service.obtenirZone(localId);
	}

	public ZoneModel obtenirZone(String codeLocalisation) {
		return service.obtenirZone(codeLocalisation);
	}

	public Collection<RegionModel> listerRegion(Centre centre) {
		return service.listerRegion(centre);
	}

	public Collection<SecteurModel> listerSecteur(Region region) {
		return service.listerSecteur(region);
	}

	public Collection<ZoneModel> listerZone(Secteur secteur) {
		return service.listerZone(secteur);
	}


	@RequestMapping(value = "/centre/lister", method = RequestMethod.GET)
	public Collection<CentreModel> listerCentre() {
		return service.listerCentre();
	}
}
