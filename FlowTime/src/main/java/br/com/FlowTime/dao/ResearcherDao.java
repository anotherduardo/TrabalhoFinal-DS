package br.com.FlowTime.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.com.FlowTime.domain.Researcher;

public class ResearcherDao {
	
	/* ATTRIBUTES */
	
	@PersistenceContext(name="FlowTimePU")
	private EntityManager entityManager;
	
	/* CRUD METHODS */
	
	@Transactional
	public void createResearcher(Researcher rs) {
		entityManager.persist(rs);
		
	}//end[createResearcher]
	
	@Transactional
	public void updateResearcher(Researcher rs) {
		rs = entityManager.merge(rs);
		entityManager.persist(rs);
		
	}//end[updateResearcher]
	
	@SuppressWarnings("unchecked")
	public List<Researcher> readResearchers() {
		Query query = entityManager.createQuery("from Researcher r");
		return query.getResultList();
		
	}//end[readResearchers]
	
	public Researcher readResearcherById(Integer id) {
		return entityManager.find(Researcher.class,id);
		
	}//end[readResearcherById]
	
	@Transactional
	public void deleteResearcher(Integer id) {
		Researcher rs = readResearcherById(id);
		entityManager.remove(rs);
		
	}//end[deleteResearcher]
	
}//end[ResearcherDao]
