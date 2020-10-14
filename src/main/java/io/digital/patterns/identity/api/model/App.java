package io.digital.patterns.identity.api.model;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class App {
    @NotNull
    private String name;
    @NotNull
    private String version;
}
