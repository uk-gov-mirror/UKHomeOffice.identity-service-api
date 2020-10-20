package io.digital.patterns.identity.api.model.mrz;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class OcrData {
    private Person person;
    private Document document;
    @Schema(description = "Images; base64 encoded as taken from Visible area - not preOCR")
    private Image image;
}
