package br.com.FlowTime.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.com.FlowTime.domain.Article;

public class ArticleDao {
	
	/* ATTRIBUTES */
	
	@PersistenceContext(name="FlowTimePU")
	private EntityManager entityManager;
	
	/* CRUD METHODS */
	
	@Transactional
	public void createArticle(Article at) {
		entityManager.persist(at);
		
	}//end[createArticle]
	
	@Transactional
	public void updateArticle(Article at) {
		at = entityManager.merge(at);
		entityManager.persist(at);
		
	}//end[updateArticle]
	
	@SuppressWarnings("unchecked")
	public List<Article> readArticles() {
		Query query = entityManager.createQuery("from Article a");
		return query.getResultList();
		
	}//end[readArticles]
	
	public Article readArticleById(Integer id) {
		return entityManager.find(Article.class,id);
		
	}//end[readArticleById]
	
	@Transactional
	public void deleteArticle(Integer id) {
		Article rs = readArticleById(id);
		entityManager.remove(rs);
		
	}//end[deleteArticle]

}//end[ArticleDao]
