package br.com.FlowTime.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.com.FlowTime.domain.Achievement;

public class AchievementDao {
	
	/* ATTRIBUTES */
	
	@PersistenceContext(name="FlowTimePU")
	private EntityManager entityManager;
	
	/* CRUD METHODS */
	
	@Transactional
	public void createAchievement(Achievement at) {
		entityManager.persist(at);
		
	}//end[createAchievement]
	
	@Transactional
	public void updateAchievement(Achievement at) {
		at = entityManager.merge(at);
		entityManager.persist(at);
		
	}//end[updateAchievement]
	
	@SuppressWarnings("unchecked")
	public List<Achievement> readAchievements() {
		Query query = entityManager.createQuery("from Achievement a");
		return query.getResultList();
		
	}//end[readAchievement]
	
	public Achievement readAchievementById(Integer id) {
		return entityManager.find(Achievement.class,id);
		
	}//end[readArticleById]
	
	@Transactional
	public void deleteAchievement(Integer id) {
		Achievement rs = readAchievementById(id);
		entityManager.remove(rs);
		
	}//end[deleteAchievement]

}//end[AchievementsDao]
