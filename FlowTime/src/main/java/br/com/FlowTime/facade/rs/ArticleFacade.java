package br.com.FlowTime.facade.rs;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.FlowTime.dao.ArticleDao;
import br.com.FlowTime.domain.Article;


/*
 * To debug
 * localhost:8080/FlowTime/rs/article
 */

@Path(value="/article")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class ArticleFacade {
	
	/* ATTRIBUTES */
	
	@Inject
	private ArticleDao articleDao;
	
	/* CRUD METHODS */
	
	@POST
	public void rsCreateArticle(Article rs) {
		articleDao.createArticle(rs);
		
	}//end[rsCreateArticle]
	
	@GET
	public List<Article> rsReadArticles() {
		List<Article> articles = articleDao.readArticles();
		for (Article p: articles) {
			p.setAuthors(null);
			p.setContribs(null);
		}
		return articles;
		
	}//end[rsReadArticles]
	
	@GET
	@Path("/{codigo}")
	public Article rsReadArticleById(@PathParam(value="codigo") Integer id) {
		
		Article r = articleDao.readArticleById(id);
		if (r != null) {
			r.setAuthors(null);
			r.setContribs(null);
		}
		return r;
		
	}//end[rsReadArticleById]
	
	@PUT
	public void rsUpdateArticle(Article rs) {
		articleDao.updateArticle(rs);
		
	}//end[rsUpdateArticle]
	
	@DELETE
	@Path("/{codigo}")
	public void rsDeleteArticle(@PathParam(value="codigo") Integer id) {
		articleDao.deleteArticle(id);
		
	}//end[rsDeleteArticle]

}//end[ArticleFacade]
