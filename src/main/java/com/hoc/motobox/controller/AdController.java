package com.hoc.motobox.controller;

import com.hoc.motobox.utils.SuperController;
import com.hoc.motobox.utils.SuperRestService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hoc.motobox.entity.Ad;
import com.hoc.motobox.entity.subcategory.AmortisseurComplet;
import com.hoc.motobox.entity.subcategory.AraigneeAvant;
import com.hoc.motobox.entity.subcategory.BoucleArriere;
import com.hoc.motobox.entity.subcategory.Cadre;
import com.hoc.motobox.entity.subcategory.FourcheComplete;
import com.hoc.motobox.entity.subcategory.TeSuperieur;
import com.hoc.motobox.entity.subcategory.TubeDeFourcheDroit;
import com.hoc.motobox.entity.subcategory.TubeDeFourcheGauche;

@RestController
@RequestMapping("/ad")
public class AdController extends SuperController<Ad> {

	private Ad a = null;

	@Autowired
	public AdController(SuperRestService<Ad> service) {
		super(service);
	}

	@Override
	public Ad save(@RequestBody Ad json) {

		Category[] subCategories = { 
				
					new Category("Cadre", "Cadre"),
					new Category("Araignée avant", "AraigneeAvant"), 
				
//				
//				"Boucle arrière", "Divers cadre", "Fourche complète",
//				"Tube de fourche gauche", "Tube de fourche droit", "Té supérieur", "Té inférieur",
//				"Bras oscillant complet", "axe de bras oscillant", "Tendeur de chaîne", "Béquille latérale",
//				"Béquille centrale", "Amortisseur complet", "Biellette d'amortisseur", "Guidon", "Rétroviseur gauche",
//				"Rétroviseur droit", "Poignée de gaz", "Cocote d'embrayage", "Levier d'embrayage", "Levier de frein",
//				"Embout de guidon", "Platine avant gauche", "Platine avant droite", "Platine arrière droite",
//				"Platine arrière gauche", "Repose pied avant gauche", "Repose pied avant droit",
//				"Repose pied arrière gauche", "Repose pied arrière droit", "Pédale de frein", "Sélecteur de vitesse",
//				"Frein avant complet", "Maitre cylindre", "Disque de frein", "Durite de frein", "Frein arrière complet",
//				"Maitre cylindre", "Disque de frein", "Durite de frein", "Jante avant", "Jante arrière",
//				"Axe de roue avant", "Axe de roue arrière", "Moteur complet", "Carter gauche", "Carter droit",
//				"Pièce moteur au détail", "Carburateur", "Pipe admission", "Bride", "Injection", "Boîte à air",
//				"Filtre à air", "Démarreur", "Roue libre démarreur", "Collecteur d'échappement", "Pot d'échappement",
//				"Sonde d'échappement", "Radiateur complet", "Radiateur", "Calorstat", "Durite de refroidissement",
//				"Bouchon de radiateu", "Ventilateur", "Vase d'expansion", "Câble accélérateur", "Câble starter",
//				"Câble d'embrayage", "Faisceaux", "Capteurs divers", "Klaxon", "Boîtier CDI", "Phare avant",
//				"Phare arrière", "Eclairage de plaque", "Clignotants", "Compteur complet", "Câble compteur",
//				"Entraîneur compteur", "Pièces compteur divers", "Kit neiman complet", "Neiman", "Serrure réservoir",
//				"Serrure arrière", "Commodo gauche", "Commodo droit", "Réservoir",
//				"Robinet d'essence - Pompe à essence", "Jauge à essence", "Selle", "Capot de selle ",
//				"Mécanisme fermeture de selle" , "Carénage avant gauche", "Carénage avant droit", "Bulle - Saut de vent",
//				"Tête de fourche", "Entourage compteur", "Carénage divers", "Garde boue avant", "Lèche roue arrière",
//				"Coque arrière complète", "Coque arrière gauche", "Coque arrière droite", "Divers coque arrière"

		};
		

		
		String title = json.getTitle();
		String description = json.getDescription();
		String model = json.getModel();
		String brand = json.getBrand();
		String year = json.getYear();
		String price = json.getPrice();
		String location = json.getLocation();
		String imageUrl = json.getImageUrl();
		String category = json.getCategory();
		Boolean isActive = json.getIs_active();

		for( Category sub : subCategories)
		{
			
			
			
			if(sub.getLibelle().equals(category)) {
			
				String classname = "com.hoc.motobox.entity.subcategory." + sub.getClassName();
				Ad a = null;
				try {
					Class  maPiece = Class.forName(classname);
					a = (Ad) maPiece.newInstance();
				} catch (Exception e) {
					e.printStackTrace();
				}
				// Manipuler a
			}
		}
		
//		a.setTitle(title);
//		a.setDescription(description);
//		a.setModel(model);
//		a.setBrand(brand);
//		a.setYear(year);
//		a.setPrice(price);
//		a.setLocation(location);
//		a.setImageUrl(imageUrl);
//		a.setCategory(cartegory);
//		a.setIs_active(isActive);

		service.save(a);

		return json;
	}


	public Ad seachPieceByName(String pieceSearch, @RequestBody Ad json ){

	    List<Ad> ads = service.findAll();
        List<Ad> adList = new ArrayList<>();

        for( Ad ad : ads) {
            String pieceName = ad.getTitle();
            if (pieceName.contains(pieceSearch)) {
                adList.add(ad);
            }
        }
	    return json;
    }

}
