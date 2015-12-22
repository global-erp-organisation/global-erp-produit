package com.camlait.global.erp.produit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.camlait.global.erp.dao.produit.ProduitDao;
import com.camlait.global.erp.domain.produit.Produit;

@RestController
@RequestMapping(value = "/produit")
public class ProduitController {
    
    @Autowired
    ProduitDao produitDao;
    
    @RequestMapping(value="/add",method=RequestMethod.POST)
    public Produit ajouterProduit(Produit p) {
        produitDao.save(p);
        return p;
    }
}
