package io.digital.patterns.identity.api.model.mrz;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import javax.validation.constraints.NotNull;

@Data
public class VerificationStatus {

    private Authentication chipAuthentication;
    private Authentication activeAuthentication;
    private Authentication extendedAccessControlChipAuthentication;
    private AccessControlStatus accessControlStatus;
    private VerificationStatus verificationStatus;

    private SigningCertificate documentSigning;
    private SigningCertificate countrySigning;


    @Data
    public static class SigningCertificate {
        @Schema(description = "Base 64 encoded pem string",
                required = true)
        @NotNull
        private String certificate;
        private String status;
        private String reason;
    }

}


