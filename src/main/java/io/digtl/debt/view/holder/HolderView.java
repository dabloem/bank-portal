package io.digtl.debt.view.holder;

import io.digtl.debt.model.Investor;
import io.digtl.debt.service.InvestorService;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class HolderView implements Serializable {

    @Inject
    InvestorService investorService;

    public List<Investor> getInvestors() {
        return investorService.getInvestors("");
    }
}
