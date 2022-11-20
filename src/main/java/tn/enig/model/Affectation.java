package tn.enig.model;

public class Affectation {
	private int id;
	private Matiere matiere;
	private Enseignant enseignant;
	private int nbHeures;
	public Affectation(int id, Matiere matiere, Enseignant enseignant, int nbHeures) {
		super();
		this.id = id;
		this.matiere = matiere;
		this.enseignant = enseignant;
		this.nbHeures = nbHeures;
	}
	public Affectation() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Matiere getMatiere() {
		return matiere;
	}
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	public Enseignant getEnseignant() {
		return enseignant;
	}
	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}
	public int getNbHeures() {
		return nbHeures;
	}
	public void setNbHeures(int nbHeures) {
		this.nbHeures = nbHeures;
	}
	@Override
	public String toString() {
		return "Affectation [id=" + id + ", matiere=" + matiere + ", enseignant=" + enseignant + ", nbHeures="
				+ nbHeures + "]";
	}
	
	
}
