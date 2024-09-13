package com.example.test.service;


import com.example.test.beans.PersonalDetails;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
@RequiredArgsConstructor
@Slf4j
public class PersonalDetailsService implements IPersonalDetailsServiceInterface {

    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public PersonalDetails checkPersonalDetails(PersonalDetails personalDetails){
        if(personalDetails.getEmailId() != null){
            Matcher matcher = EMAIL_PATTERN.matcher(personalDetails.getEmailId());
            personalDetails.setIsValidEmail(matcher.matches());
            return personalDetails;
        }
        personalDetails.setIsValidEmail(false);
        return personalDetails;
    }
}
