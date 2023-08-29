package io.banking.accounts;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 *
 * @author dabloem
 */
@RegisterRestClient(baseUri = "http://localhost:8181")
public interface AccountDao {
    
    @GET
    @Path("/account")
    public Response getAccounts(@QueryParam("owner") String owner);
    
}
