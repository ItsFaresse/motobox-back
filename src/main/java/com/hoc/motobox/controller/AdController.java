package com.hoc.motobox.controller;

import com.hoc.motobox.utils.SuperController;
import com.hoc.motobox.utils.SuperRestService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.hoc.motobox.entity.Ad;
import com.hoc.motobox.entity.subcategory.AmortisseurComplet;
import com.hoc.motobox.entity.subcategory.AraigneeAvant;
import com.hoc.motobox.entity.subcategory.BoucleArriere;
import com.hoc.motobox.entity.subcategory.Cadre;
import com.hoc.motobox.entity.subcategory.FourcheComplete;
import com.hoc.motobox.entity.subcategory.TeSuperieur;
import com.hoc.motobox.entity.subcategory.TubeDeFourcheDroit;
import com.hoc.motobox.entity.subcategory.TubeDeFourcheGauche;
import com.hoc.motobox.repository.AdRepository;

@RestController
@RequestMapping("/ads")
public class AdController extends SuperController<Ad> {
    @Autowired
    public AdController(SuperRestService<Ad> service) {
        super(service);
    }



}
