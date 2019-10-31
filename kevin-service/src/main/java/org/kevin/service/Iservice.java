package org.kevin.service;

import java.util.List;

import org.kevin.domaine.Annonce;
import org.kevin.domaine.Personne;

public interface Iservice {
	// Crud Personne
	public int creerPersonne(Personne personne);

	public Personne getPersonne(int idPersonne);

	public void deletePersonne(int idPersonne);

	public void updatePersonne(Personne p);

	public List<Personne> findAllPersonnes();

	public int getPersonneId(Personne p);

	// Crud Annonce
	public int creerAnnonce(Personne personne, Annonce a);

	public Annonce getAnnonce(int idAnnonce);

	public void deleteAnnonce(int idAnnonce);

	public void updateAnnonce(Annonce a);

	public List<Annonce> findAllAnnonce();

	public int getAnnonceId(Annonce a);
}
