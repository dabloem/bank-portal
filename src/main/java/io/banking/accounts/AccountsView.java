package io.banking.accounts;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.core.Response;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.wildfly.security.http.oidc.IDToken;

/**
 *
 * @author dabloem
 */
@Named
@RequestScoped
public class AccountsView implements Serializable {
    
    @Inject
    @RestClient
    private AccountDao accountService;
    
//    @Inject
//    private IDToken token;
    
    List<Account> meesAccounts = Arrays.asList(
        new Account("69e9fa16-9259-44e1-8fe2-39b99dd9f090", "NL23 ABNA 9486 4576 89", "IBAN", 1002.34),
        new Account("69e9fa16-9259-44e1-8fe2-39b99dd9f090", "948693 904503", "BLOCKCHAIN", 660.99),
        new Account("69e9fa16-9259-44e1-8fe2-39b99dd9f090", "NL44 RABO 0123 4567 89", "RABO", 660.99)
    );
    
    public List<Account> getAccounts() {
        try {
            Response hello = accountService.getAccounts("69e9fa16-9259-44e1-8fe2-39b99dd9f090"); //token.getSubject());
            Account[] accounts = hello.readEntity(Account[].class);
            for (int i = 0; i < accounts.length; i++) {
                Account a = accounts[i];
                meesAccounts.get(i).setName(a.getName());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return meesAccounts;
    }

    public void setAccounts(List<Account> meesAccounts) {
        this.meesAccounts = meesAccounts;
    }
    
    
}
