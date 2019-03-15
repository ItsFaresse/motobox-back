package com.hoc.motobox.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.hoc.motobox.entity.category.Alternateur;
import com.hoc.motobox.entity.category.BobineAllumage;
import com.hoc.motobox.entity.category.BoiteAAir;
import com.hoc.motobox.entity.category.CarenageDivers;
import com.hoc.motobox.entity.category.Demarreur;
import com.hoc.motobox.entity.category.Radiateur;
import com.hoc.motobox.entity.category.RegulateurDeTension;
import com.hoc.motobox.entity.category.RelaisDeDemarreur;
import com.hoc.motobox.entity.category.Reservoir;
import com.hoc.motobox.entity.category.Selle;
import com.hoc.motobox.entity.subcategory.*;
import com.hoc.motobox.utils.SuperEntity;

/**
 * @Author Clément
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
	    name="category",
	    discriminatorType=DiscriminatorType.STRING
	    )
@JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "category")
@JsonSubTypes({
	@JsonSubTypes.Type(value = Cadre.class, name = "Cadre"),
	@JsonSubTypes.Type(value = AraigneeAvant.class, name = "Boucle arrière"),
	@JsonSubTypes.Type(value = DiversCadre.class, name = "Divers cadre"),
	@JsonSubTypes.Type(value = FourcheComplete.class, name = "Fourche complète"),
	@JsonSubTypes.Type(value = TubeDeFourcheGauche.class, name = "Tube de fourche gauche"),
	@JsonSubTypes.Type(value = TubeDeFourcheDroit.class, name = "Tube de fourche droit"),
	@JsonSubTypes.Type(value = TeSuperieur.class, name = "Té supérieur"),
	@JsonSubTypes.Type(value = TeInferieur.class, name = "Té inférieur"),
	@JsonSubTypes.Type(value = BrasOscillantComplet.class, name = "Bras oscillant complet"),
	@JsonSubTypes.Type(value = AxeDeBrasOscillant.class, name = "axe de bras oscillant"),
	@JsonSubTypes.Type(value = TendeurDeChaine.class, name = "Tendeur de chaîne"),
	@JsonSubTypes.Type(value = BequilleLaterale.class, name = "Béquille latérale"),
	@JsonSubTypes.Type(value = BequilleCentrale.class, name = "Béquille centrale"),
	@JsonSubTypes.Type(value = AmortisseurComplet.class, name = "Amortisseur complet"),
	@JsonSubTypes.Type(value = BielletteAmortisseur.class, name = "Biellette d'amortisseur"),
	@JsonSubTypes.Type(value = Guidon.class, name = "Guidon"),
	@JsonSubTypes.Type(value = RetroviseurGauche.class, name = "Rétroviseur gauche"),
	@JsonSubTypes.Type(value = RetroviseurDroit.class, name = "Rétroviseur droit"),
	@JsonSubTypes.Type(value = PoigneeDeGaz.class, name = "Poignée de gaz"),
	@JsonSubTypes.Type(value = CocoteEmbrayage.class, name = "Cocote d'embrayage"),
	@JsonSubTypes.Type(value = LevierEmbrayage.class, name = "Levier d'embrayage"),
	@JsonSubTypes.Type(value = LevierDeFrein.class, name = "Levier de frein"),
	@JsonSubTypes.Type(value = EmboutDeGuidon.class, name = "Embout de guidon"),
	@JsonSubTypes.Type(value = PlatineAvantGauche.class, name = "Platine avant gauche"),
	@JsonSubTypes.Type(value = PlatineAvantDroite.class, name = "Platine avant droite"),
	@JsonSubTypes.Type(value = PlatineArriereDroite.class, name = "Platine arrière droite"),
	@JsonSubTypes.Type(value = PlatineArriereGauche.class, name = "Platine arrière gauche"),
	@JsonSubTypes.Type(value = ReposePiedArriereGauche.class, name = "Repose pied avant gauche"),
	@JsonSubTypes.Type(value = ReposePiedArriereDroit.class, name = "Repose pied avant droit"),
	@JsonSubTypes.Type(value = ReposePiedArriereGauche.class, name = "Repose pied arrière gauche"),
	@JsonSubTypes.Type(value = ReposePiedArriereDroit.class, name = "Repose pied arrière droit"),
	@JsonSubTypes.Type(value = PedaleDeFrein.class, name = "Pédale de frein"),
	@JsonSubTypes.Type(value = SelecteurDeVitesse.class, name = "Sélecteur de vitesse"),
	@JsonSubTypes.Type(value = FreinAvantComplet.class, name = "Frein avant complet"),
	@JsonSubTypes.Type(value = MaitreCylindreAvant.class, name = "Maitre cylindre"),
	@JsonSubTypes.Type(value = DisqueDeFreinAvant.class, name = "Disque de frein"),
	@JsonSubTypes.Type(value = DuriteDeFreinAvant.class, name = "Durite de frein"),
	@JsonSubTypes.Type(value = FreinArriereComplet.class, name = "Frein arrière complet"),
	@JsonSubTypes.Type(value = MaitreCylindreArriere.class, name = "Maitre cylindre"),
	@JsonSubTypes.Type(value = DisqueDeFreinArriere.class, name = "Disque de frein"),
	@JsonSubTypes.Type(value = DuriteDeFreinArriere.class, name = "Durite de frein"),
	@JsonSubTypes.Type(value = JanteAvant.class, name = "Jante avant"),
	@JsonSubTypes.Type(value = JanteArriere.class, name = "Jante arrière"),
	@JsonSubTypes.Type(value = AxeDeRoueAvant.class, name = "Axe de roue avant"),
	@JsonSubTypes.Type(value = AxeDeRoueArriere.class, name = "Axe de roue arrière"),
	@JsonSubTypes.Type(value = MoteurComplet.class, name = "Moteur complet"),
	@JsonSubTypes.Type(value = CarterGauche.class, name = "Carter gauche"),
	@JsonSubTypes.Type(value = CarterDroit.class, name = "Carter droit"),
	@JsonSubTypes.Type(value = PieceMoteurAuDetail.class, name = "Pièce moteur au détail"),
	@JsonSubTypes.Type(value = Carburateur.class, name = "Carburateur"),
	@JsonSubTypes.Type(value = PipeAdmission.class, name = "Pipe admission"),
	@JsonSubTypes.Type(value = Bride.class, name = "Bride"),
	@JsonSubTypes.Type(value = Injection.class, name = "Injection"),
	@JsonSubTypes.Type(value = BoiteAAir.class, name = "Boîte à air"),
	@JsonSubTypes.Type(value = FiltreAAir.class, name = "Filtre à air"),
	@JsonSubTypes.Type(value = Demarreur.class, name = "Démarreur"),
	@JsonSubTypes.Type(value = RoueLibreDemarreur.class, name = "Roue libre démarreur"),
	@JsonSubTypes.Type(value = CollecteurEchappement.class, name = "Collecteur d'échappement"),
	@JsonSubTypes.Type(value = PotEchappement.class, name = "Pot d'échappement"),
	@JsonSubTypes.Type(value = SondeEchappement.class, name = "Sonde d'échappement"),
	@JsonSubTypes.Type(value = RadiateurComplet.class, name = "Radiateur complet"),
	@JsonSubTypes.Type(value = Radiateur.class, name = "Radiateur"),
	@JsonSubTypes.Type(value = Calorstat.class, name = "Calorstat"),
	@JsonSubTypes.Type(value = DuriteDeRefroidissement.class, name = "Durite de refroidissement"),
	@JsonSubTypes.Type(value = BouchonDeRadiateur.class, name = "Bouchon de radiateu"),
	@JsonSubTypes.Type(value = Ventilateur.class, name = "Ventilateur"),
	@JsonSubTypes.Type(value = VaseExpansion.class, name = "Vase d'expansion"),
	@JsonSubTypes.Type(value = CableAccelerateur.class, name = "Câble accélérateur"),
	@JsonSubTypes.Type(value = CableStarter.class, name = "Câble starter"),
	@JsonSubTypes.Type(value = CableEmbrayage.class, name = "Câble d'embrayage"),
	@JsonSubTypes.Type(value = Faisceaux.class, name = "Faisceaux"),
	@JsonSubTypes.Type(value = CapteursDivers.class, name = "Capteurs divers"),
	@JsonSubTypes.Type(value = Klaxon.class, name = "Klaxon"),
	@JsonSubTypes.Type(value = BoitierCdi.class, name = "Boîtier CDI"),
	@JsonSubTypes.Type(value = PhareAvant.class, name = "Phare avant"),
	@JsonSubTypes.Type(value = PhareArriere.class, name = "Phare arrière"),
	@JsonSubTypes.Type(value = EclairageDePlaque.class, name = "Eclairage de plaque"),
	@JsonSubTypes.Type(value = Clignotants.class, name = "Clignotants"),
	@JsonSubTypes.Type(value = CompteurComplet.class, name = "Compteur complet"),
	@JsonSubTypes.Type(value = CableCompteur.class, name = "Câble compteur"),
	@JsonSubTypes.Type(value = EntraineurCompteur.class, name = "Entraîneur compteur"),
	@JsonSubTypes.Type(value = PiecesCompteurDivers.class, name = "Pièces compteur divers"),
	@JsonSubTypes.Type(value = KitNeimanComplet.class, name = "Kit neiman complet"),
	@JsonSubTypes.Type(value = Neiman.class, name = "Neiman"),
	@JsonSubTypes.Type(value = KitNeimanComplet.class, name = "Serrure réservoir"),
	@JsonSubTypes.Type(value = SerrureArriere.class, name = "Serrure arrière"),
	@JsonSubTypes.Type(value = CommodoGauche.class, name = "Commodo gauche"),
	@JsonSubTypes.Type(value = CommodoDroit.class, name = "Commodo droit"),
	@JsonSubTypes.Type(value = Reservoir.class, name = "Réservoir"),
	@JsonSubTypes.Type(value = RobinetEssencePompeAEssence.class, name = "Robinet d'essence - Pompe à essence"),
	@JsonSubTypes.Type(value = JaugeAEssence.class, name = "Jauge à essence"),
	@JsonSubTypes.Type(value = Selle.class, name = "Selle"),
	@JsonSubTypes.Type(value = CapotDeSelle.class, name = "Capot de selle "),
	@JsonSubTypes.Type(value = MecanismeFermetureDeSelle.class, name = "Mécanisme fermeture de selle"),
	@JsonSubTypes.Type(value = CarenageAvantGauche.class, name = "Carénage avant gauche"),
	@JsonSubTypes.Type(value = CarenageAvantDroit.class, name = "Carénage avant droit"),
	@JsonSubTypes.Type(value = BulleSautDeVent.class, name = "Bulle - Saut de vent"),
	@JsonSubTypes.Type(value = TeteDeFourche.class, name = "Tête de fourche"),
	@JsonSubTypes.Type(value = EntourageCompteur.class, name = "Entourage compteur"),
	@JsonSubTypes.Type(value = CarenageDivers.class, name = "Carénage divers"),
	@JsonSubTypes.Type(value = GardeBoueAvant.class, name = "Garde boue avant"),
	@JsonSubTypes.Type(value = LecheRoueArriere.class, name = "Lèche roue arrière"),
	@JsonSubTypes.Type(value = CoqueArriereComplete.class, name = "Coque arrière complète"),
	@JsonSubTypes.Type(value = CoqueArriereGauche.class, name = "Coque arrière gauche"),
	@JsonSubTypes.Type(value = CoqueArriereDroite.class, name = "Coque arrière droite"),
	@JsonSubTypes.Type(value = DiversCoqueArriere.class, name = "Divers coque arrière"),
	@JsonSubTypes.Type(value = RegulateurDeTension.class, name = "Régulateur de tension"),
	@JsonSubTypes.Type(value = BobineAllumage.class, name = "Bobine d'allumage"),
	@JsonSubTypes.Type(value = RelaisDeDemarreur.class, name = "Relais de démarreur"),
	@JsonSubTypes.Type(value = Alternateur.class, name = "Alternateur"),
	})

public abstract class Ad extends SuperEntity {

	@Column
	private String title;

	@Column
	private String description;

	@Column
	private String model;

	@Column
	private String brand;

	@Column
	private String year;

	@Column
	private String price;

	@Column
	private String location;

	@Column
	private String imageUrl;

	@Column
	private Boolean is_active;

	public Ad() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Boolean getIs_active() {
		return is_active;
	}

	public void setIs_active(Boolean is_active) {
		this.is_active = is_active;
	}

}
