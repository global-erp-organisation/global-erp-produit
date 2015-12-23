package com.camlait.global.erp.produit.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.camlait.global.erp.dao.produit.CategorieProduitDao;
import com.camlait.global.erp.domain.produit.CategorieProduit;

public class CategorieProduitService implements ICategorieProduitService {
    
    private final CategorieProduitDao categorieDao;
    
    @Autowired
    public CategorieProduitService(CategorieProduitDao categorieDao) {
        this.categorieDao = categorieDao;
    }
    
    @Override
    public CategorieProduit ajouterCategorie(CategorieProduit categorie) {
        categorie.setDateDeCreation(new Date());
        categorie.setDerniereMiseAJour(new Date());
        categorieDao.save(categorie);
        return categorie;
    }
    
    @Override
    public CategorieProduit modifierCategorie(CategorieProduit categorie) {
        categorie.setDerniereMiseAJour(new Date());
        categorieDao.saveAndFlush(categorie);
        return categorie;
    }
    
    @Override
    public void supprimerCategorie(Long categorieId) {
        CategorieProduit c = trouverCategorie(categorieId);
        if (c != null) {
            categorieDao.delete(c);
        }
    }
    
    @Override
    public CategorieProduit trouverCategorie(Long categorieId) {
        return categorieDao.findOne(categorieId);
    }
    
    @Override
    public Page<CategorieProduit> listerCategorieProduit(Pageable p) {
        return categorieDao.findAll(p);
    }
    
}
