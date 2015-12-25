package com.camlait.global.erp.produit.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.camlait.global.erp.domain.produit.Produit;

public interface IProduitService {

	/**
	 * Ajouter un produit.
	 * 
	 * @param produit
	 *            produit à ajouter.
	 * @return Retourne le produit ajouté.
	 */
	public Produit ajouterProduit(Produit produit,Long categorieId);

	/**
	 * Modifier un produit.
	 * 
	 * @param produit
	 *            produit à modifier.
	 * @return Retourne le produit mdifié.
	 */
	public Produit modifierProduit(Produit produit);

	/**
	 * Supprime un produit.
	 * 
	 * @param produitId
	 *            Identifiant de le produit à supprimer.
	 */
	public void supprimerProduit(Long produitId);

	/**
	 * Rechercher un produit.
	 * 
	 * @param produitId
	 *            Identifiant de la catégorie à trouver.
	 * @return Retorune le produit trouvé.
	 */
	public Produit trouverProduit(Long produitId);

	/**
	 * Lister les produits de manière paginée.
	 * 
	 * @param p
	 *            Page de données à retourner.
	 * @return Retourne une page de catégorie de produit.
	 */
	public Page<Produit> listerProduit(Pageable p);
}
