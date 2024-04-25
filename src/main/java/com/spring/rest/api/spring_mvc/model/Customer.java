package com.spring.rest.api.spring_mvc.model;

import com.spring.rest.api.spring_mvc.validation.CourseCode;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {
    private String firstName;

    @NotNull(message = "Is Required")
    @Size(min = 1, message = "Is Required")
    private String lastName;

    @NotNull(message = "Is Required")
    @Min(message = "Must be Greater than or equal to 0", value = 0)
    @Max(value = 10, message = "Must be less than or equal to 10")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 Chars/Digits Allowed!")
    private String postalCode;

    @NotNull(message = "Is Required")
    @CourseCode(value = "TOPS",message = "Must Start with TOPS")
    private String courseCode;
}
