package br.com.FlowTime.facade.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.com.FlowTime.dao.ArticleDao;
import br.com.FlowTime.domain.Article;


/* To debug
 * http://localhost:8080/FlowTime/ws/article?wsdl
 */

@WebService(serviceName="ws/article")
public class ArticleFacade {
	
	/* ATTRIBUTES */
	
	@Inject
	private ArticleDao articleDao;
	
	/* CRUD METHODS */
	
	@WebMethod
	public void wsCreateArticle(@WebParam(name="article") Article rs) {
		articleDao.createArticle(rs);
		
	}//end[wsCreateArticle]
	
	@WebMethod
	public List<Article> wsReadArticles() {
		List<Article> articles = articleDao.readArticles();
		for (Article a: articles) {
			a.setContribs(null);
			a.setAuthors(null);
		}
		return articles;
		
	}//end[wsReadArticles]
	
	
	@WebMethod
	public Article wsReadArticleById(@WebParam(name="codArticle") Integer id) {
		Article a = articleDao.readArticleById(id);
		if (a != null) {
			a.setContribs(null);
			a.setAuthors(null);
		}
		return a;
		
	}//end[wsReadArticleById]
	
	@WebMethod
	public void wsUpdateArticle(@WebParam(name="article") Article rs) {
		articleDao.updateArticle(rs);
		
	}//end[wsUpdateArticle]
	
	@WebMethod
	public void wsDeleteArticle(@WebParam(name="codArticle") Integer id) {
		articleDao.deleteArticle(id);
		
	}//end[wsDeleteArticle]

}//end[ArticleFacade]
