package io.digital.patterns.identity.api.model.mrz;

import lombok.Data;

@Data
public class AccessControlStatus {
    private Authentication basicAccessControl;
    private Authentication passwordAuthenticatedConnectionEstablishment;
    private Authentication extendedAccessControlTerminalAuthentication;
    private String[] credentialTypesUsed;
}

