package io.digital.patterns.identity.api.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Device {
    @Schema(description = "Device brand", required = true)
    @NotNull
    private String brand;

    @Schema(description = "Device OS version", required = true)
    @NotNull
    private String version;

    @Schema(description = "Device manufactuer", required = true)
    @NotNull
    private String manufacturer;

    @Schema(description = "Device model", required = true)
    @NotNull
    private String model;

    @Schema(description = "Device platform", required = true)
    @NotNull
    private String platform;
}
