package io.digital.patterns.identity.api.model.csca;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CscaMasterListUploadRequest {

    @NotNull
    private String bucketName;
    @NotNull
    private String fileName;
}
