package tn.enig.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import tn.enig.dao.GestionImp;
import tn.enig.dao.IGestion;
import tn.enig.model.Affectation;
import tn.enig.model.Enseignant;
import tn.enig.model.Matiere;

@Controller
public class Application {
	
	@Autowired  //injectio of the interface
	
	IGestion gest;
	
	
	@GetMapping("/matieres")
	public String fnGetMatieres(Model m) {
		List<Matiere> lmat = gest.ConsulterMatieres();
		//System.out.println(lmat.size());//used for resolving some problems
		m.addAttribute("matieres", lmat);
		return "listeMatieres";
	}
	@GetMapping("/ajoutMat")
	public String fnAddMatiere(Model m) {
		Matiere mat =new Matiere();
		m.addAttribute("matr",mat);
		return "ajouterMatiere";
	}
	@PostMapping("/saveMatiere")
	public String saveMatiere(@ModelAttribute ("matr") Matiere matiere) {
		gest.AjouterMatiere(matiere);
		return "redirect:/matieres";
	}
	
	@GetMapping("/addEnseignant")
	public String fnaddEnseignant(Model m) {
		Enseignant ens = new Enseignant();
		m.addAttribute("ens",ens);
		return "ajouterEns";
	}
	@PostMapping("/saveEnseignant")
	public String saveEns(@ModelAttribute ("ens") Enseignant enseignant) {
		gest.AjouterEns(enseignant);
		return "redirect:/enseignants";
	}
	@GetMapping("/affectations")
	public String fnGetAffect(Model m) {
		List<Affectation> laffect = new ArrayList<Affectation>();
		laffect = gest.ConsulterAffectation();
		m.addAttribute("lisAff", laffect);
		return "listeAffec";
	}
	@GetMapping("/addAffectations")
	public String fnAddAffec(Model m) {
		Affectation aff = new Affectation();
		m.addAttribute("aff", aff);
		return "affecterMat";
	}
	@PostMapping("/saveAffectation")
	public String saveAff(@ModelAttribute("aff") Affectation affectation) {
		gest.AffecterMatEns(affectation);
		return "redirect:/affectations";
	}
	@GetMapping("/enseignants")
	public String fnGetEns(Model m) {
		List<Enseignant> lens=new ArrayList<Enseignant>();
		lens = gest.Consulter();
		m.addAttribute("enseg",lens);
		return "listeEnseig";
	}
	@GetMapping("/deleteAff/{id_aff}")
	public String deleteAff(@PathVariable Integer id_aff) {
		gest.SupprimerAffect(id_aff);
		return "redirect:/affectations";
	}
	
	
	
}