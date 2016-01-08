package com.camlait.global.erp.produit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.camlait.global.erp.domain.model.json.produit.ProduitModel;
import com.camlait.global.erp.domain.produit.Produit;
import com.camlait.global.erp.service.produit.ProduitServiceDelegate;

@RestController
@RequestMapping(value = "/produit")
public class ProduitController {
    
    @Autowired
    private com.camlait.global.erp.service.produit.IProduitService service;
    
    @Autowired
    private ProduitServiceDelegate produitServiceDelagate;
    
    @RequestMapping(value = "/add/{categorieId}", method = RequestMethod.POST)
    public Produit ajouterProduit(@RequestBody Produit produit, @PathVariable Long categorieId) {
        produit.setCategorie(service.obtenirCategorieProduit(categorieId));
        service.ajouterProduit(produit);
        return produit;
    }
    
    @RequestMapping(value = "/supprimer/{produitId}", method = RequestMethod.GET)
    public void supprimerCategorie(@PathVariable Long produitId) {
        service.supprimerProduit(produitId);
    }
    
    @RequestMapping(value = "/trouver/{produitId}", method = RequestMethod.GET)
    public ProduitModel trouverCategorie(@PathVariable Long produitId) {
        return produitServiceDelagate.obtenirProduit(produitId);
    }
    
    @RequestMapping(value = "/lister/{page}/{limit}")
    public Page<ProduitModel> listerProduit(@PathVariable int page, @PathVariable int limit) {
        return produitServiceDelagate.listerProduit(new PageRequest(page, limit));
    }
}
