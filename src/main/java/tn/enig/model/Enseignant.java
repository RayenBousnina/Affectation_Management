package tn.enig.model;

/**
 * @author Rayen
 *
 */
public class Enseignant {
	private int id;
	private String nom;
	private String prenom;
	private int chargeEns;
	public Enseignant() {
		super();
	}
	public Enseignant(int id, String nom, String prenom, int chargeEns) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.chargeEns = chargeEns;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getChargeEns() {
		return chargeEns;
	}
	public void setChargeEns(int chargeEns) {
		this.chargeEns = chargeEns;
	}
	@Override
	public String toString() {
		return "Enseignant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", chargeEns=" + chargeEns + "]";
	}
	
}
