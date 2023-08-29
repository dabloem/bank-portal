package io.digtl.debt.service;

import io.digtl.debt.model.Investor;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class InvestorService {


    public Investor getInvestor() {
        return new Investor("Jan");
    }

    public List<Investor> getInvestors(String issuer) {
        return List.of(new Investor("Kees"), new Investor("Piet"));
    }
}
