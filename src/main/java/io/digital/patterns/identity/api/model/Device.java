package io.digital.patterns.identity.api.model;

import lombok.Data;

@Data
public class Device {
    private String brand;
    private String version;
    private String manufacturer;
    private String model;
    private String platform;
}
