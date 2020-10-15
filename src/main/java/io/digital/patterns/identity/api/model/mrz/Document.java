package io.digital.patterns.identity.api.model.mrz;

import io.digital.patterns.identity.api.model.mrz.Image;
import lombok.Data;

@Data
public class Document {

    private String number;
    private String type;
    private String issuingCountry;
    private String issuingAuthority;
    private String dateOfExpiry;
    private String dateOfIssue;
    private Image image;

}
