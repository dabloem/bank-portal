package io.banking.app;

import org.wildfly.security.http.oidc.AccessToken;
import org.wildfly.security.http.oidc.IDToken;
import org.wildfly.security.http.oidc.OidcPrincipal;
import org.wildfly.security.http.oidc.OidcSecurityContext;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.servlet.http.HttpServletRequest;
import java.security.Principal;

@RequestScoped
public class KeycloakProducer {

    @Inject
    HttpServletRequest request;

    @Produces
    OidcSecurityContext securityContext() {
        Principal userPrincipal = request.getUserPrincipal();

        OidcSecurityContext keycloakSecurityContext = ((OidcPrincipal) userPrincipal)
                .getOidcSecurityContext();
        return keycloakSecurityContext;
    }

    @Named
    @Produces
    IDToken getIdToken() {
        Principal userPrincipal = request.getUserPrincipal();

        OidcSecurityContext sc = ((OidcPrincipal) userPrincipal)
                .getOidcSecurityContext();

        return sc.getIDToken();
    }

    @Produces
    public AccessToken getAccessToken() {
        AccessToken token = ((OidcPrincipal) request.getUserPrincipal())
                .getOidcSecurityContext().getToken();
        return token;
    }
}

