package com.reba.personascrud.model.persona.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "lastName", "birthDate", "docType", "docNumber", "country", "phoneNumber", "email"})
public class PersonRequest {

    @JsonProperty("name")
    private String name;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("birthDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private String birthDate;
    @JsonProperty("docType")
    private String docType;
    @JsonProperty("docNumber")
    private String docNumber;
    @JsonProperty("country")
    private String country;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("email")
    private String email;

    public PersonRequest(String name, String lastName, String birthDate, String docType, String docNumber, String country, String phoneNumber, String email) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.docType = docType;
        this.docNumber = docNumber;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("birthDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    public String getBirthDate() {
        return birthDate;
    }

    @JsonProperty("birthDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @JsonProperty("docType")
    public String getDocType() {
        return docType;
    }

    @JsonProperty("docType")
    public void setDocType(String docType) {
        this.docType = docType;
    }

    @JsonProperty("docNumber")
    public String getDocNumber() {
        return docNumber;
    }

    @JsonProperty("docNumber")
    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }
}
