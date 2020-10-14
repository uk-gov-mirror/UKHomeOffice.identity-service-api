package io.digital.patterns.identity.api.model.airline;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class BoardingPass {

    @Schema(description = "Multi leg designator", required = true)
    @NotNull
    private String multiLegDesignator;

    @Schema(description = "Number of legs encoded", required = true)
    @NotNull
    private String numOfLegs;

    @Schema(description = "Passenger surname", required = true)
    @NotNull
    private String surname;

    private String[] givenNames;

    @Schema(description = "List of journey legs", required = true)
    @Min(1)
    @NotNull
    @Max(4)
    private List<JourneyLeg> journeyLegs = new ArrayList<>();

    @Schema(description = "Version number")
    private Integer versionNumber;

    @Schema(description = "Passenger description")
    private String passengerDescription;

    @Schema(description = "Source of check in")
    private String checkInSource;

    @Schema(description = "Source of boarding pass issuance")
    private String boardingPassIssueSource;

    @Schema(description = "Date boarding pass issued")
    private Date boardingPassIssueDate;

    @Schema(description = "Document type")
    private String documentType;

    @Schema(description = "airline designator of boarding pass issuer")
    private String boardingPassIssuer;

    @Schema(description = "Baggage tag license plate number (s)")
    @Max(3)
    private List<String> baggageTagLicenseNumbers = new ArrayList<>();

    @Schema(description = "Security Data")
    private String securityData;
}
