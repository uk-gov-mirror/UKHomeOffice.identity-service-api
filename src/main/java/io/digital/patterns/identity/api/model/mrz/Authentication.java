package io.digital.patterns.identity.api.model.mrz;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Authentication {
    @NotNull
    private String Status;
    @NotNull
    private String Reason;
    private String Result;
}
