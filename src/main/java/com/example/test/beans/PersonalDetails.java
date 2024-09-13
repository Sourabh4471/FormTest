package com.example.test.beans;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class PersonalDetails {
    String firstName;
    String LastName;
    String mobileNumber;
    String emailId;
    Boolean isValidEmail;
}
