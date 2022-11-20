package tn.enig.model;

/**
 * @author Rayen
 *
 */
public class Matiere {
	private int id;
	private String titre;
	private int niveau;
	private int nbHeures;
	
	public Matiere(int id, String titre, int niveau, int nbHeures) {
		super();
		this.id = id;
		this.titre = titre;
		this.niveau = niveau;
		this.nbHeures = nbHeures;
	}
	
	public Matiere() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	public int getNbHeures() {
		return nbHeures;
	}
	public void setNbHeures(int nbHeures) {
		this.nbHeures = nbHeures;
	}

	@Override
	public String toString() {
		return "Matiere [id=" + id + ", titre=" + titre + ", niveau=" + niveau + ", nbHeures=" + nbHeures + "]";
	}
	
}
