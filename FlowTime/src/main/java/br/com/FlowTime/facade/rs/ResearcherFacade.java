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

import br.com.FlowTime.dao.ResearcherDao;
import br.com.FlowTime.domain.Researcher;

/*
 * To debug
 * localhost:8080/FlowTime/rs/researcher
 */

@Path(value="/researcher")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class ResearcherFacade {

	/* ATTRIBUTES */
	
	@Inject
	private ResearcherDao researcherDao;
	
	/* CRUD METHODS */
	
	@POST
	public void rsCreateResearcher(Researcher rs) {
		researcherDao.createResearcher(rs);
		
	}//end[rsCreateResearcher]
	
	@GET
	public List<Researcher> rsReadResearchers() {
		List<Researcher> researchers = researcherDao.readResearchers();
		for (Researcher p: researchers) {
			p.setPapers(null);
		}
		return researchers;
		
	}//end[rsReadResearchers]
	
	@GET
	@Path("/{codigo}")
	public Researcher rsReadResearcherById(@PathParam(value="codigo") Integer id) {
		
		Researcher r = researcherDao.readResearcherById(id);
		if (r != null) {
			r.setPapers(null);
		}
		return r;
		
	}//end[rsReadResearcherById]
	
	@PUT
	public void rsUpdateResearcher(Researcher rs) {
		researcherDao.updateResearcher(rs);
		
	}//end[rsUpdateResearcher]
	
	@DELETE
	@Path("/{codigo}")
	public void rsDeleteResearcher(@PathParam(value="codigo") Integer id) {
		researcherDao.deleteResearcher(id);
		
	}//end[rsDeleteResearcher]

}//end[ResearcherFacade]
