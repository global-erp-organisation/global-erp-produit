package com.camlait.global.erp.produit.service;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Date;

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
		categorie.setCategorieProduitId(1L);
		categorie.setCodeCategorieProduit("PL");
		categorie.setCategorieTaxable(true);
		categorie.setDateDeCreation(new Date());
		categorie.setDerniereMiseAJour(new Date());
		categorie.setDescriptionCategorie("Produits laitiers");
		categorie.setPortee(Portee.DETAIL);
	}

	@Test
	public void ajouterCategorieTest() {
		service.ajouterCategorie(categorie, null);
		verify(service).ajouterCategorie(categorie, null);
		verify(service, times(1)).ajouterCategorie(categorie, null);
	}

	@Test
	public void modifierCategorieTest() {
		service.modifierCategorie(categorie);
		verify(service).modifierCategorie(categorie);
		verify(service, times(1)).modifierCategorie(categorie);
	}

	@Test
	public void supprimerCategorieTest() {
		when(service.ajouterCategorie(categorie, null)).thenReturn(categorie);
		service.supprimerCategorie(categorie.getCategorieProduitId());
		verify(service, times(1)).supprimerCategorie(eq(categorie.getCategorieProduitId()));
	}

	@Test
	public void trouverCategorieTest() {
		when(service.ajouterCategorie(any(CategorieProduit.class), null)).thenReturn(categorie);
		service.trouverCategorie(categorie.getCategorieProduitId());
		verify(service, times(1)).trouverCategorie(eq(categorie.getCategorieProduitId()));
	}

	@Test
	public void listerCategorieTest() {

		Pageable p = mock(Pageable.class);
		service.ajouterCategorie(mock(CategorieProduit.class), null);
		service.ajouterCategorie(mock(CategorieProduit.class), null);
		service.ajouterCategorie(mock(CategorieProduit.class), null);
		service.ajouterCategorie(mock(CategorieProduit.class), null);
		service.listerCategorieProduit(p);

		verify(service, times(4)).ajouterCategorie(any(CategorieProduit.class), null);
		verify(service).listerCategorieProduit(p);
	}
}
