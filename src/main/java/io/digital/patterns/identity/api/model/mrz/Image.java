package io.digital.patterns.identity.api.model.mrz;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class Image {

    @Schema(description = "A list of base 64 encoded strings of face images")
    private String[] photo;

    @Schema(description = "A list of base 64 encoded strings of signature images")
    private String[] signature;

    @Schema(description = "Base 64 encoded string of chip mrz fid 257")
    private String mrz;

}

