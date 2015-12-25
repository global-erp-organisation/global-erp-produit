package com.camlait.global.erp.produit.service;

import java.util.Date;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.camlait.global.erp.dao.produit.CategorieProduitDao;
import com.camlait.global.erp.domain.produit.CategorieProduit;
import com.camlait.global.erp.produit.exception.GlobalProduitException;

@Transactional
public class CategorieProduitService implements ICategorieProduitService {

	private final CategorieProduitDao categorieDao;

	@Autowired
	public CategorieProduitService(CategorieProduitDao categorieDao) {
		this.categorieDao = categorieDao;
	}

	@Override
	public CategorieProduit ajouterCategorie(CategorieProduit categorie, Long categorieParentId) {
		CategorieProduit parent = null;
		if (categorieParentId != null) {
			parent = trouverCategorie(categorieParentId);
		}
		if (categorie != null) {
			categorie.setCategorieParent(parent);
			categorie.setDateDeCreation(new Date());
			categorie.setDerniereMiseAJour(new Date());
			categorieDao.save(categorie);
		}
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
		categorieDao.delete(trouverCategorie(categorieId));
	}

	@Override
	public CategorieProduit trouverCategorie(Long categorieId) {
		CategorieProduit c = categorieDao.findOne(categorieId);
		if (c != null) {
			Hibernate.initialize(c.getProduits());
			return c;
		} else {
			throw new GlobalProduitException(
					"La categorie de produit ayant l'identifiant " + categorieId + " n'existe pas. ");
		}
	}

	@Override
	public Page<CategorieProduit> listerCategorieProduit(Pageable p) {
		return categorieDao.findAll(p);
	}

}
