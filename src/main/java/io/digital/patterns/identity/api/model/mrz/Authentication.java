package io.digital.patterns.identity.api.model.mrz;

import javax.validation.constraints.NotNull;

public class Authentication {
    @NotNull
    private String Status;
    @NotNull
    private String Reason;
    private String Result;
}
