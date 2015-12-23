package com.camlait.global.erp.produit.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.camlait.global.erp.domain.produit.CategorieProduit;
/**
 * Fournit tous les services necessaires à la gestion des catégories de produit.
 * @author mbsig
 *
 */
public interface ICategorieProduitService {

	/**
	 * Ajouter une categorie de produit.
	 * 
	 * @param categorie    Catégorie de produit à ajouter.
	 * @return Retourne la catégorie de produit ajoutée.
	 */
	public CategorieProduit ajouterCategorie(CategorieProduit categorie);

	/**
	 * Modifier une catégorie de produit.
	 * 
	 * @param categorie   Catégorie de produit à modifier.
	 * @return Retourne la catégorie de produit mdifiée.
	 */
	public CategorieProduit modifierCategorie(CategorieProduit categorie);

	/**
	 * Supprime une catégorie de produit.
	 * 
	 * @param categorieId Identifiant de la catégorie de produit à supprimer.
	 */
	public void supprimerCategorie(Long categorieId);

	/**
	 * Rechercher une catégorie de produit.
	 * 
	 * @param categorieId  Identifiant de la catégorie à trouver.
	 * @return Retorune la catégorie de produit trouvée.
	 */
	public CategorieProduit trouverCategorie(Long categorieId);

	/**
	 * Lister les catégories de produit de manière paginée.
	 * 
	 * @param p Page de données à retourner.
	 * @return Retourne une page de catégorie de produit.
	 */
	public Page<CategorieProduit> listerCategorieProduit(Pageable p);
}
