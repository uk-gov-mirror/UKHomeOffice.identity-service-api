package io.digital.patterns.identity.api.model.mrz;

import io.digital.patterns.identity.api.model.Scan;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;


@Data
@EqualsAndHashCode(callSuper=true)
public class MrzScan extends Scan {


    @NotNull
    private Mrz mrz;

    @Schema(description = "OCR data, this is optional and not required")
    private OcrData ocrData;

    @Schema(description = "NFC data, this is optional and not required")
    private Nfc nfc;

    @Schema(description = "Master list version", required = true)
    @NotNull
    private String mlVersion;
}
