package org.kevin.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.kevin.dao.Dao;
import org.kevin.domaine.Annonce;
import org.kevin.domaine.Personne;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class TestService {

	@Mock
	private Dao daoMock ;
	
	@InjectMocks
	private Service service;
	
	@Before
	public void setUp() throws Exception
	{
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void TestCrerPersonne () {
		
		Personne personne = new Personne(1, "jacky", "michel", "123", "123", "0102/18");
		Mockito.when(daoMock.creerPersonne(personne)).thenReturn(0);
		
		assertEquals(0, daoMock.creerPersonne(personne));
	}
	
	@Test
	public void TestCrerAnnonce () {
		
		Personne personne = new Personne(1, "jacky", "michel", "123", "123", "0102/18");
		Annonce annonce = new Annonce(1, "intituke", "detail", 12);
		Mockito.when(daoMock.creerAnnonce(personne, annonce)).thenReturn(0);
		
		assertEquals(0, daoMock.creerAnnonce(personne, annonce));
	}
	
	@Test
	public void TestGetAnnonce () {
		
		Personne personne = new Personne(1, "jacky", "michel", "123", "123", "0102/18");
		Annonce annonce = new Annonce(1, "intituke", "detail", 12);
		Mockito.when(daoMock.getAnnonce(1)).thenReturn(annonce);
		
		assertEquals(annonce, daoMock.getAnnonce(1));
	}
	
	@Test
	public void TestGetPersonne () {
		
		Personne personne = new Personne(1, "jacky", "michel", "123", "123", "0102/18");
		Annonce annonce = new Annonce(1, "intituke", "detail", 12);
		Mockito.when(daoMock.getPersonne(1)).thenReturn(personne);
		
		assertEquals(personne, daoMock.getPersonne(1));
	}

}
