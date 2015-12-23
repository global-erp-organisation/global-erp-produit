package com.camlait.global.erp.produit;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

import com.camlait.global.erp.domain.produit.CategorieProduit;
import com.camlait.global.erp.produit.service.CategorieProduitService;

public class CategorieProduitServiceTest {

	@Mock
	private CategorieProduitService service;

	@Before
	public void setup() {

	}

	@Test
	public void ajouterCategorieTest() {
		CategorieProduit categorie = mock(CategorieProduit.class);
		service.ajouterCategorie(categorie);
		verify(service).ajouterCategorie(categorie);
		verify(service,times(1)).ajouterCategorie(categorie);
	}

	@Test
	public void modifierCategorieTest() {
		CategorieProduit categorie = mock(CategorieProduit.class);
		service.modifierCategorie(categorie);
		verify(service).modifierCategorie(categorie);
		verify(service,times(1)).modifierCategorie(categorie);
	}

	@Test
	public void supprimerCategorieTest() {
		CategorieProduit categorie = mock(CategorieProduit.class);
	}

	@Test
	public void trouverCategorieTest() {
		CategorieProduit categorie = mock(CategorieProduit.class);
		when(service.ajouterCategorie(categorie)).thenReturn(categorie);
		CategorieProduit c = service.trouverCategorie(categorie.getId());
		verify(service).trouverCategorie(eq(c.getId()));
	}

	@Test
	public void listerCategorieTest() {

	}
}
