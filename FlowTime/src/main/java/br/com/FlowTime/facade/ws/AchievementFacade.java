package br.com.FlowTime.facade.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.com.FlowTime.dao.AchievementDao;
import br.com.FlowTime.domain.Achievement;


/* To debug
 * http://localhost:8080/FlowTime/ws/achievement?wsdl
 */

@WebService(serviceName="ws/achievement")
public class AchievementFacade {
	
	/* ATTRIBUTES */
	
	@Inject
	private AchievementDao achievementDao;
	
	/* CRUD METHODS */	
	
	@WebMethod
	public void wsCreateAchievement(@WebParam(name="achievement") Achievement rs) {
		achievementDao.createAchievement(rs);
		
	}//end[wsCreateAchievement]
	
	
	@WebMethod
	public List<Achievement> wsReadAchievements() {
		List<Achievement> achievements = achievementDao.readAchievements();
		for (Achievement a: achievements) {
			
			// [error]: lazy... 
			a.getRefPaper().setAuthors(null);
			a.getRefPaper().setContribs(null);
		}
		
		return achievements;
		
	}//end[wsReadAchievement]
	
	@WebMethod
	public Achievement wsReadAchievementById(@WebParam(name="codAchievement") Integer id) {
		Achievement a = achievementDao.readAchievementById(id);
		
		if (a != null) {
			
			// [error]: lazy...
			a.getRefPaper().setAuthors(null);
			a.getRefPaper().setContribs(null);
		}
		
		return a;
		
	}//end[wsReadAchievementById]
	
	@WebMethod
	public void wsUpdateAchievement(@WebParam(name="achievement") Achievement rs) {
		achievementDao.updateAchievement(rs);
		
	}//end[wsUpdateAchievement]
	
	@WebMethod
	public void wsDeleteAchievement(@WebParam(name="codAchievement") Integer id) {
		achievementDao.deleteAchievement(id);
		
	}//end[wsDeleteAchievement]

}//end[AchievementFacade]