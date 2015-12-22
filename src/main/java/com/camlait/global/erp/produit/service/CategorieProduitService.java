package com.camlait.global.erp.produit.service;

import org.springframework.beans.factory.annotation.Autowired;

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
        categorieDao.save(categorie);
        return categorie;
    }
    
    @Override
    public CategorieProduit modifierCategorie(CategorieProduit categorie) {
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
    
}
