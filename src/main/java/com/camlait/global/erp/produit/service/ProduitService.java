package com.camlait.global.erp.produit.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.camlait.global.erp.dao.produit.ProduitDao;
import com.camlait.global.erp.domain.produit.CategorieProduit;
import com.camlait.global.erp.domain.produit.Produit;
import com.camlait.global.erp.produit.exception.GlobalProduitException;

public class ProduitService implements IProduitService {

	private final ProduitDao produitDao;
	private final ICategorieProduitService categorieProduitService;

	@Autowired
	public ProduitService(ProduitDao produitDao, ICategorieProduitService categorieProduitService) {
		this.produitDao = produitDao;
		this.categorieProduitService = categorieProduitService;
	}

	@Override
	public Produit ajouterProduit(Produit produit, Long categorieId) {
		CategorieProduit cp = categorieProduitService.trouverCategorie(categorieId);
		if (produit != null && cp != null) {
			produit.setDateDeCreation(new Date());
			produit.setDerniereMiseAJour(new Date());
			produit.setCategorie(cp);
			produitDao.save(produit);
		}
		return produit;
	}

	@Override
	public Produit modifierProduit(Produit produit) {
		if (produit != null) {
			produit.setDerniereMiseAJour(new Date());
			produitDao.saveAndFlush(produit);
		}
		return produit;
	}

	@Override
	public void supprimerProduit(Long produitId) {
		produitDao.delete(trouverProduit(produitId));
	}

	@Override
	public Produit trouverProduit(Long produitId) {
		Produit p = produitDao.findOne(produitId);
		if (p != null) {
			return p;
		} else {
			throw new GlobalProduitException("Le produit ayant l'identifiant " + produitId + " n'existe pas. ");
		}
	}

	@Override
	public Page<Produit> listerProduit(Pageable p) {
		return produitDao.findAll(p);
	}

}
