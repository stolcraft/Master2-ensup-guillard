package org.kevin.domaine;

public class Annonce {

	protected int idAnnonce;
	protected String intitule;
	protected String detail;
	protected float prix;
	public Annonce(int idAnnonce, String intitule, String detail, float prix) {
		super();
		this.idAnnonce = idAnnonce;
		this.intitule = intitule;
		this.detail = detail;
		this.prix = prix;
	}
	public int getIdAnnonce() {
		return idAnnonce;
	}
	public void setIdAnnonce(int idAnnonce) {
		this.idAnnonce = idAnnonce;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Annonce [idAnnonce=" + idAnnonce + ", intitule=" + intitule + ", detail=" + detail + ", prix=" + prix
				+ "]";
	}
	
	
}
