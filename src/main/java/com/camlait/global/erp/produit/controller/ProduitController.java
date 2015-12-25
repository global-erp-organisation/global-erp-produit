package com.camlait.global.erp.produit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.camlait.global.erp.domain.produit.Produit;
import com.camlait.global.erp.produit.service.IProduitService;

@RestController
@RequestMapping(value = "/produit")
public class ProduitController {

	@Autowired
	private IProduitService service;

	@RequestMapping(value = "/add/{categorieId}", method = RequestMethod.POST)
	public Produit ajouterProduit(@RequestBody Produit produit,@PathVariable Long categorieId) {
		service.ajouterProduit(produit,categorieId);
		return produit;
	}

	@RequestMapping(value = "/supprimer/{produitId}", method = RequestMethod.GET)
	public void supprimerCategorie(@PathVariable Long produitId) {
		service.supprimerProduit(produitId);
	}

	@RequestMapping(value = "/trouver/{produitId}", method = RequestMethod.GET)
	public Produit trouverCategorie(@PathVariable Long produitId) {
		return service.trouverProduit(produitId);
	}

	@RequestMapping(value = "/lister/{page}/{limit}")
	public Page<Produit> listerProduit(@PathVariable int page, @PathVariable int limit) {
		return service.listerProduit(new PageRequest(page, limit));
	}
}
