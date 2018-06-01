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

import br.com.FlowTime.dao.AchievementDao;
import br.com.FlowTime.domain.Achievement;


/*
 * To debug
 * localhost:8080/FlowTime/rs/achievement
 */

@Path(value="/achievement")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class AchievementFacade {
	
	/* ATTRIBUTES */
	
	@Inject
	private AchievementDao achievementDao;
	
	/* CRUD METHODS */
	
	@POST
	public void rsCreateAchievement(Achievement rs) {
		achievementDao.createAchievement(rs);
		
	}//end[rsCreateAchievement]
	
	@GET
	public List<Achievement> rsReadAchievements() {
		List<Achievement> achievements = achievementDao.readAchievements();
		for (Achievement p: achievements) {
			p.getRefPaper().setAuthors(null);
			p.getRefPaper().setContribs(null);
		}
		return achievements;
		
	}//end[rsReadAchievements]
	
	@GET
	@Path("/{codigo}")
	public Achievement rsReadAchievementById(@PathParam(value="codigo") Integer id) {
		
		Achievement r = achievementDao.readAchievementById(id);
		if (r != null) {
			r.getRefPaper().setAuthors(null);
			r.getRefPaper().setContribs(null);
		}
		return r;
		
	}//end[rsReadAchievementById]
	
	@PUT
	public void rsUpdateAchievement(Achievement rs) {
		achievementDao.updateAchievement(rs);
		
	}//end[rsUpdateAchievement]
	
	@DELETE
	@Path("/{codigo}")
	public void rsDeleteAchievement(@PathParam(value="codigo") Integer id) {
		achievementDao.deleteAchievement(id);
		
	}//end[rsDeleteAchievement]

}//end[AchievementFacade]
