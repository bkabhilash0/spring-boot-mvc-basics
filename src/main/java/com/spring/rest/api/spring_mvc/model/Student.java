package com.spring.rest.api.spring_mvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String favLanguage;
    private List<String> favOs;
}
