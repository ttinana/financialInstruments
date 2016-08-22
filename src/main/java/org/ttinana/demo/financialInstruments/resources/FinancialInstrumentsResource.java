/**
 * 
 */
package org.ttinana.demo.financialInstruments.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ttinana.demo.financialInstruments.model.FinancialInstrument;
import org.ttinana.demo.financialInstruments.service.FinancialInstrumentService;

/**
 * @author ttinana
 *
 */
@Path("/fi")
public class FinancialInstrumentsResource {

	FinancialInstrumentService financialInstrumentService = new FinancialInstrumentService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<FinancialInstrument> getFI() {
		return financialInstrumentService.getAllFI();
	}
	
	@GET
	@Path("/{fiID}")
	@Produces(MediaType.APPLICATION_JSON)
	public FinancialInstrument getFIforID(@PathParam("fiID") long id) {
		return financialInstrumentService.getFI(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public FinancialInstrument postFI(FinancialInstrument fi) {
		
		return financialInstrumentService.postFI(fi);
		
	}


}
