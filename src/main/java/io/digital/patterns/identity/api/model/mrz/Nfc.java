package io.digital.patterns.identity.api.model.mrz;

import lombok.Data;

@Data
public class Nfc {
    private Person person;
    private Document document;
    private Image image;
    private String documentType;
    private Chip chip;
    private VerificationStatus verificationStatus;
    private AccessControlStatus accessControlStatus;
}
