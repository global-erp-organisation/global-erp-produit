package com.camlait.global.erp.produit.service;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.data.domain.Pageable;

import com.camlait.global.erp.domain.enumeration.Portee;
import com.camlait.global.erp.domain.produit.CategorieProduit;

@RunWith(MockitoJUnitRunner.class)
public class CategorieProduitServiceTest {
    
    @Mock
    private CategorieProduitService service;
    private CategorieProduit categorie;
    
    @Before
    public void setup() {
        categorie = new CategorieProduit();
        categorie.setId(1L);
        categorie.setCodeCategorieProduit("PL");
        categorie.setCategorieTaxable(true);
        categorie.setDateDeCreation(new DateTime());
        categorie.setDerniereMiseAJour(new DateTime());
        categorie.setDescriptionCategorie("Produits laitiers");
        categorie.setPortee(Portee.DETAIL);
    }
    
    @Test
    public void ajouterCategorieTest() {
        service.ajouterCategorie(categorie);
        verify(service).ajouterCategorie(categorie);
        verify(service, times(1)).ajouterCategorie(categorie);
    }
    
    @Test
    public void modifierCategorieTest() {
        service.modifierCategorie(categorie);
        verify(service).modifierCategorie(categorie);
        verify(service, times(1)).modifierCategorie(categorie);
    }
    
    @Test
    public void supprimerCategorieTest() {
        when(service.ajouterCategorie(categorie)).thenReturn(categorie);
        service.supprimerCategorie(categorie.getId());
        verify(service, times(1)).supprimerCategorie(eq(categorie.getId()));
    }
    
    @Test
    public void trouverCategorieTest() {
        when(service.ajouterCategorie(any(CategorieProduit.class))).thenReturn(categorie);
        service.trouverCategorie(categorie.getId());
        verify(service, times(1)).trouverCategorie(eq(categorie.getId()));
    }
    
    @Test
    public void listerCategorieTest() {
        
        Pageable p = mock(Pageable.class);
        service.ajouterCategorie(mock(CategorieProduit.class));
        service.ajouterCategorie(mock(CategorieProduit.class));
        service.ajouterCategorie(mock(CategorieProduit.class));
        service.ajouterCategorie(mock(CategorieProduit.class));
        service.listerCategorieProduit(p);
        
        verify(service, times(4)).ajouterCategorie(any(CategorieProduit.class));
        verify(service).listerCategorieProduit(p);
    }
}
