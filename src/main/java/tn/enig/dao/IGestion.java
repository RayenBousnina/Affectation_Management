package tn.enig.dao;

import java.util.List;

import tn.enig.model.Affectation;
import tn.enig.model.Enseignant;
import tn.enig.model.Matiere;

public interface IGestion {
	public  List<Enseignant> Consulter();
	public void AjouterEns(Enseignant ens);
	public List<Matiere> ConsulterMatieres();
	public void AjouterMatiere(Matiere matiere);
	public List<Affectation> ConsulterAffectation();
	public void AffecterMatEns(Affectation affectation);
	public void SupprimerAffect(int idAffectation);
	public Matiere getMatById(int id);
	public Enseignant getEnsById(int id);
}
