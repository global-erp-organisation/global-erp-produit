package com.camlait.global.erp.produit.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.camlait.global.erp.domain.enumeration.Portee;
import com.camlait.global.erp.domain.model.json.produit.CategorieProduitModel;
import com.camlait.global.erp.domain.produit.CategorieProduit;
import com.camlait.global.erp.service.produit.IProduitService;
import com.camlait.global.erp.service.produit.ProduitServiceDelegate;

@RestController
@RequestMapping(value = "/categorie")
public class CategorieProduitController {

	@Autowired
	private IProduitService service;

	@Autowired
	private ProduitServiceDelegate delegate;

	@RequestMapping(value = "/add/{categorieParentId}", method = RequestMethod.POST)
	public CategorieProduit ajouterCategorie(@RequestBody CategorieProduit categorie,
			@PathVariable Long categorieParentId) {
		if (categorieParentId != null) {
			categorie.setCategorieParent(service.obtenirCategorieProduit(categorieParentId));
		}
		service.ajouterCategorieProduit(categorie);
		return categorie;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public CategorieProduit ajouterCategorie(@RequestBody CategorieProduit categorie) {
		service.ajouterCategorieProduit(categorie);
		return categorie;
	}

	@RequestMapping(value = "/supprimer/{categorieId}", method = RequestMethod.GET)
	public void supprimerCategorie(@PathVariable Long categorieId) {
		service.supprimerCategorieProduit(categorieId);
	}

	@RequestMapping(value = "/trouver/{categorieId}", method = RequestMethod.GET)
	public CategorieProduit trouverCategorie(@PathVariable Long categorieId) {
		return service.obtenirCategorieProduit(categorieId);
	}

	@RequestMapping(value = "/lister", method = RequestMethod.GET)
	public Collection<CategorieProduit> listerCategorie() {
		return service.listerCategorieProduit();
	}

	@RequestMapping(value = "/{motCle}", method = RequestMethod.GET)
	public Collection<CategorieProduit> listerCategorie(@PathVariable String motCle) {
		return service.listerCategorieProduit(motCle);
	}

	@RequestMapping(value = "/lister/{portee}", method = RequestMethod.GET)
	public Collection<CategorieProduitModel> listerCategoriePorte(@PathVariable String portee) {
		return delegate.listerCategorie(Portee.retrouverPortee(portee));
	}

}
