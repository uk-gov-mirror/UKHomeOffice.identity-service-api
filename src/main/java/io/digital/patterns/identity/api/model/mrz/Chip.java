package io.digital.patterns.identity.api.model.mrz;

import lombok.Data;

@Data
public class Chip {
    private String[] types;
    private Boolean read;
}
