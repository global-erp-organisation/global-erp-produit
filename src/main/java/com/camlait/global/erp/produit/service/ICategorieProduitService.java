package com.camlait.global.erp.produit.service;

import com.camlait.global.erp.domain.produit.CategorieProduit;

public interface ICategorieProduitService {
    
    public CategorieProduit ajouterCategorie(CategorieProduit categorie);
    
    public CategorieProduit modifierCategorie(CategorieProduit categorie);
    
    public void supprimerCategorie(Long categorieId);
    
    public CategorieProduit trouverCategorie(Long categorieId);
}
