package com.hoc.motobox.controller;

import com.hoc.motobox.utils.SuperController;
import com.hoc.motobox.utils.SuperRestService;
import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@RequestMapping("/ad")
public class AdController extends SuperController<Ad> {

    @Autowired
    public AdController(SuperRestService<Ad> service) {
        super(service);
    }

//    @GetMapping("/test/test")
//    public void test() {
//        String[] test = {"Boucle arrière", "Divers cadre", "Fourche complète",
//                "Tube de fourche gauche", "Tube de fourche droit", "Té supérieur", "Té inférieur",
//                "Bras oscillant complet", "axe de bras oscillant", "Tendeur de chaîne", "Béquille latérale",
//                "Béquille centrale", "Amortisseur complet", "Biellette d'amortisseur", "Guidon", "Rétroviseur gauche",
//                "Rétroviseur droit", "Poignée de gaz", "Cocote d'embrayage", "Levier d'embrayage", "Levier de frein",
//                "Embout de guidon", "Platine avant gauche", "Platine avant droite", "Platine arrière droite",
//                "Platine arrière gauche", "Repose pied avant gauche", "Repose pied avant droit",
//                "Repose pied arrière gauche", "Repose pied arrière droit", "Pédale de frein", "Sélecteur de vitesse",
//                "Frein avant complet", "Maitre cylindre", "Disque de frein", "Durite de frein", "Frein arrière complet",
//                "Maitre cylindre", "Disque de frein", "Durite de frein", "Jante avant", "Jante arrière",
//                "Axe de roue avant", "Axe de roue arrière", "Moteur complet", "Carter gauche", "Carter droit",
//                "Pièce moteur au détail", "Carburateur", "Pipe admission", "Bride", "Injection", "Boîte à air",
//                "Filtre à air", "Démarreur", "Roue libre démarreur", "Collecteur d'échappement", "Pot d'échappement",
//                "Sonde d'échappement", "Radiateur complet", "Radiateur", "Calorstat", "Durite de refroidissement",
//                "Bouchon de radiateu", "Ventilateur", "Vase d'expansion", "Câble accélérateur", "Câble starter",
//                "Câble d'embrayage", "Faisceaux", "Capteurs divers", "Klaxon", "Boîtier CDI", "Phare avant",
//                "Phare arrière", "Eclairage de plaque", "Clignotants", "Compteur complet", "Câble compteur",
//                "Entraîneur compteur", "Pièces compteur divers", "Kit neiman complet", "Neiman", "Serrure réservoir",
//                "Serrure arrière", "Commodo gauche", "Commodo droit", "Réservoir",
//                "Robinet d'essence - Pompe à essence", "Jauge à essence", "Selle", "Capot de selle ",
//                "Mécanisme fermeture de selle", "Carénage avant gauche", "Carénage avant droit", "Bulle - Saut de vent",
//                "Tête de fourche", "Entourage compteur", "Carénage divers", "Garde boue avant", "Lèche roue arrière",
//                "Coque arrière complète", "Coque arrière gauche", "Coque arrière droite", "Divers coque arrière"};
//
//        for (int i = 0; i < test.length; i++) {
//            System.out.println("@JsonSubTypes.Type(value = .class, name = \"" + test[i] + "\"),");
//        }
//    }
//
//        public Ad seachPieceByName (String pieceSearch, @RequestBody Ad json ){
//            List<Ad> ads = service.findAll();
//            List<Ad> adList = new ArrayList<>();
//
//            for (Ad ad : ads) {
//                String pieceName = ad.getTitle();
//                if (pieceName.contains(pieceSearch)) {
//                    adList.add(ad);
//                }
//            }
//            return json;
//        }


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
//		

}
