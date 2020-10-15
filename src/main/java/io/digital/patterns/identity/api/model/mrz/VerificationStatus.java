package io.digital.patterns.identity.api.model.mrz;

import io.digital.patterns.identity.api.model.airline.JourneyLeg;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
public class VerificationStatus {

    private Authentication chipAuthentication;
    private Authentication activeAuthentication;
    private Authentication extendedAccessControlChipAuthentication;
    private AccessControlStatus accessControlStatus;
    private VerificationStatus verificationStatus;

    private SigningCertificate documentSigning;
    private SigningCertificate countrySigning;

    @Schema(description = "Chip verification hash", required = true)
    @Min(1)
    @Max(2)
    private List<Hash> hashTable = new ArrayList<>();


    @Data
    public static class SigningCertificate {
        @Schema(description = "Base 64 encoded pem string",
                required = true)
        @NotNull
        private String certificate;
        @NotNull
        private String status;
        private String reason;
    }

    @Data
    public static class Hash {
        private String computed;
        private String stored;
    }
}


