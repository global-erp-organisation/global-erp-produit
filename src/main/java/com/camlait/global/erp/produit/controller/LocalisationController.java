package com.camlait.global.erp.produit.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.camlait.global.erp.domain.organisation.Centre;
import com.camlait.global.erp.service.organisation.ILocalisationService;

@RequestMapping(value="/organisation")
@RestController
public class LocalisationController {
    
    @Autowired
    private ILocalisationService localisationService;
    
    @RequestMapping(value="/lister/centre",method=RequestMethod.GET)
    public Collection<Centre> listerCentre() {
        return localisationService.listerCentre();
    }
}
