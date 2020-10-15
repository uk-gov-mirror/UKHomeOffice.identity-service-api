package io.digital.patterns.identity.api.model.mrz;

import lombok.Data;

@Data
public class Person {

    private String surname;
    private String[] givenNames;
    private String nationality;
    private String dateOfBirth;
    private String placeOfBirth;
    private String sex;
}
