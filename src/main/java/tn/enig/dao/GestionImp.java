package tn.enig.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import tn.enig.model.Affectation;

//import com.mysql.jdbc.PreparedStatement;

import tn.enig.model.Enseignant;
import tn.enig.model.Matiere;

@Repository
public class GestionImp implements IGestion{
	@Autowired
	@Qualifier(value="data")
	DataSource data; //from javax.sql
	public void setData(DataSource data) {
		this.data=data;
	}
	public  List<Enseignant> Consulter(){
		List<Enseignant> listeEns=new ArrayList<Enseignant>();
		Connection conn;
		try {
			conn = data.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from enseignant");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Enseignant ens = new Enseignant(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
				listeEns.add(ens);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeEns;
	}
	public void AjouterEns(Enseignant ens) {
		Connection conn;
		try {
			conn = data.getConnection();
			String query = "insert into enseignant values(null,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1,ens.getNom());
			ps.setString(2,ens.getPrenom());
			ps.setInt(3,ens.getChargeEns());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public List<Matiere> ConsulterMatieres() {
		List<Matiere> listMat = new ArrayList<Matiere>();
		Connection cnx;
		try {
			cnx=data.getConnection();
			PreparedStatement ps = cnx.prepareStatement("select * from matiere");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Matiere mat = new Matiere(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
				listMat.add(mat);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listMat;
		
	}
	public Matiere getMatById(int id) {
		Matiere mat = new Matiere();
		Connection cnx;
		try {
			cnx=data.getConnection();
			PreparedStatement ps = cnx.prepareStatement("select * from matiere where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				mat.setId(rs.getInt(1));
				mat.setTitre(rs.getString(2));
				mat.setNiveau(rs.getInt(3));
				mat.setNbHeures(rs.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mat;
	}
	public Enseignant getEnsById(int id) {
		Enseignant ens = new Enseignant();
		Connection cnx;
		try {
			cnx=data.getConnection();
			PreparedStatement ps = cnx.prepareStatement("select * from enseignant where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				ens.setId(rs.getInt(1));
				ens.setNom(rs.getString(2));
				ens.setPrenom(rs.getString(3));
				ens.setChargeEns(rs.getInt(4));
			}
		}catch(Exception e) {
			
		}
		return ens;
	}  
	public void AjouterMatiere(Matiere matiere) {
		Connection cnx;
		try {
			cnx=data.getConnection();
			PreparedStatement ps = cnx.prepareStatement("insert into matiere values(null,?,?,?)");
			ps.setString(1,matiere.getTitre());
			ps.setInt(2,matiere.getNiveau());
			ps.setInt(3,matiere.getNbHeures());
			ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public List<Affectation> ConsulterAffectation() {
		List<Affectation> lAffect = new ArrayList<Affectation>();
		Connection cnx;
//		int idEns=0;
//		int idMat=0;
		try {
			cnx=data.getConnection();
			PreparedStatement ps = cnx.prepareStatement("select * from affectation");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Affectation aff = new Affectation(rs.getInt(1), this.getMatById(rs.getInt(2)),this.getEnsById(rs.getInt(3)) , rs.getInt(4));
				lAffect.add(aff);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lAffect;
	}
	public void AffecterMatEns(Affectation affectation) {
		Connection cnx;
		try {
			cnx=data.getConnection();
			PreparedStatement ps = cnx.prepareStatement("insert into affectation values(null,?,?,?)");
			ps.setInt(1, affectation.getMatiere().getId());
			ps.setInt(2, affectation.getEnseignant().getId());
			ps.setInt(3, affectation.getNbHeures());
		}catch(Exception e) {
			e.printStackTrace();
		}
				
	}
	public void SupprimerAffect(int idAffectation) {
		Connection cnx;
		try {
			cnx = data.getConnection();
			PreparedStatement ps = cnx.prepareStatement("delete from affectation where id=?");
			ps.setInt(1, idAffectation);
			ps.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
