package com.camlait.global.erp.produit.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
    
    @RequestMapping(value = "/supprimer", method = RequestMethod.GET)
    public void supprimerCategorie(Long categorieId) {
        service.supprimerCategorie(categorieId);
    }
    
    @RequestMapping(value = "/trouver", method = RequestMethod.GET)
    public CategorieProduit trouverCategorie(Long categorieId) {
        return service.trouverCategorie(categorieId);
    }
}
