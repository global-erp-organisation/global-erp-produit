package com.camlait.global.erp.produit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.camlait.global.erp.domain.produit.CategorieProduit;
import com.camlait.global.erp.produit.service.CategorieProduitService;

@RestController
@RequestMapping(value = "/categorie")
public class CategorieProduitController {

	@Autowired
	private CategorieProduitService service;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public CategorieProduit ajouterCategorie(CategorieProduit categorie) {
		service.ajouterCategorie(categorie);
		return categorie;
	}

	@RequestMapping(value = "/supprimer/{categorieId}", method = RequestMethod.GET)
	public void supprimerCategorie(@PathVariable Long categorieId) {
		service.supprimerCategorie(categorieId);
	}

	@RequestMapping(value = "/trouver/{categorieId}", method = RequestMethod.GET)
	public CategorieProduit trouverCategorie(@PathVariable Long categorieId) {
		return service.trouverCategorie(categorieId);
	}

	@RequestMapping(value="/lister/{page}/{limit}")
	public Page<CategorieProduit> listerCategorie(@PathVariable int page,@PathVariable int limit) {
		return service.listerCategorieProduit(new PageRequest(page, limit));
	}
}
