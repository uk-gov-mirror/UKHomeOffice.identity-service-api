package io.digital.patterns.identity.api.model.airline;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data

public class JourneyLeg {

    @Schema(description = "Passenger name record, Booking reference", required = true)
    @NotNull
    private String pnrCode;

    @Schema(description = "Departure City Code", required = true)
    @NotNull
    private String departureCityCode;

    @Schema(description = "Arrival City Code", required = true)
    @NotNull
    private String arrivalCityCode;

    @Schema(description = "Operating carrier designator", required = true)
    @NotNull
    private String carrierDesignator;

    @Schema(description = "Flight Number", required = true)
    @NotNull
    private String flightNumber;

    @Schema(description = "Flight date in ISO Date format", required = true)
    @NotNull
    private Date flightDate;

    @Schema(description = "Compartment code / row letter designator", required = true)
    @NotNull
    private String compartmentCode;

    @Schema(description = "Seat number or INF for infant if no seat", required = true)
    @NotNull
    private String seatNumber;

    @Schema(description = "CheckIn Sequence number", required = true)
    @NotNull
    private Integer checkInSequenceNumber;

    @Schema(description = "Passenger status", required = true)
    @NotNull
    private String passengerStatus;

    @Schema(description = "Airline Numeric Code")
    private String airlineCode;

    @Schema(description = "Document Form / Serial Number")
    private String serialNumber;

    @Schema(description = "Selectee indicator")
    private String selecteeIndicator;

    @Schema(description = "International document verification")
    private String internationalDocumentVerification;

    @Schema(description = "Marketing carrier designator")
    private String marketingCarrierDesignator;

    @Schema(description = "Frequent flyer airline designator")
    private String frequentFlyerAirlineDesignator;

    @Schema(description = "Frequent flyer number")
    private String frequentFlyerNumber;

    @Schema(description = "ID/AD Indicator")
    private String idAdIndicator;

    @Schema(description = "Free Baggage Allowance")
    private String freeBaggageAllowance;

    @Schema(description = "Fast Track")
    private String fastTrack;
}
