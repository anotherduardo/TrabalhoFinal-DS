package br.com.FlowTime.facade.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.com.FlowTime.dao.ResearcherDao;
import br.com.FlowTime.domain.Researcher;

/* To debug
 * http://localhost:8080/FlowTime/ws/researcher?wsdl
 */

@WebService(serviceName="ws/researcher")
public class ResearcherFacade {
	
	/* ATTRIBUTES */
	
	@Inject
	private ResearcherDao researcherDao;
	
	/* CRUD METHODS */
	
	@WebMethod
	public void wsCreateResearcher(@WebParam(name="researcher") Researcher rs) {
		researcherDao.createResearcher(rs);
		
	}//end[wsCreateResearcher]
	
	@WebMethod
	public List<Researcher> wsReadResearchers() {
		List<Researcher> researches = researcherDao.readResearchers();
		for (Researcher p: researches) {
			p.setPapers(null);
		}
		return researches;
		
	}//end[wsReadResearchers]
	
	@WebMethod
	public Researcher wsReadResearcherById(@WebParam(name="codResearcher") Integer id) {
		Researcher r = researcherDao.readResearcherById(id);
		if (r != null) {
			r.setPapers(null);
		}
		return r;
		
	}//end[wsReadResearcherById]
	
	@WebMethod
	public void wsUpdateResearcher(@WebParam(name="researcher") Researcher rs) {
		researcherDao.updateResearcher(rs);
		
	}//end[wsUpdateResearcher]
	
	@WebMethod
	public void wsDeleteResearcher(@WebParam(name="codResearcher") Integer id) {
		researcherDao.deleteResearcher(id);
		
	}//end[wsDeleteResearcher]

}//end[ResearcherFacade]
