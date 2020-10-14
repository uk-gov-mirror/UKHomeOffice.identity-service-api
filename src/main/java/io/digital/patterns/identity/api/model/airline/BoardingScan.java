package io.digital.patterns.identity.api.model.airline;

import io.digital.patterns.identity.api.model.Scan;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;


@Data
@EqualsAndHashCode(callSuper=true)
public class BoardingScan extends Scan {

    @NotNull
    private BoardingPass boardingPass;

}
