package io.digital.patterns.identity.api.model.mrz;

import lombok.Data;

@Data
public class OcrData {
    private Person person;
    private Document document;
    private Image image;
}
