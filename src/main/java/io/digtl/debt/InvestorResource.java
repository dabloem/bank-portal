package io.digtl.debt;

import io.digtl.debt.model.Investor;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import java.util.Collections;
import java.util.List;

@Path("/investor")
public class InvestorResource {


    @GET
    @Produces("text/plain")
    public List<Investor> hello() {
        return Collections.singletonList(new Investor("Jan"));
    }
}