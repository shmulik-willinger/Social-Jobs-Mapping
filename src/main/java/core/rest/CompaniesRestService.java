package core.rest;

import core.model.Company;
import core.services.CompanyBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;

@Service
@Path("/companies")
@Produces("application/json")
public class CompaniesRestService {

    @Autowired
    private CompanyBusinessService companiesBusinessService;

    @POST
    public boolean addCompany(Company company) throws Exception {

        companiesBusinessService.saveCompany(company);

        return true;
    }

    @GET
    @Path("/{id}")
    public Company GetById(@PathParam("id") Integer id) {

        return companiesBusinessService.getById(id);
    }

    @PUT
    public Company updateEntity(Company entity) {

        companiesBusinessService.update(entity);

        return companiesBusinessService.getById(entity.getCompany_id());
    }
}
