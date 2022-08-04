package com.reba.personascrud.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name= "birth_date")
    private LocalDate birthDate;

    @Column(name = "doc_type")
    private String docType;

    @Column(name = "doc_number")
    private String docNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", foreignKey = @ForeignKey(name = "FK_RELATION_RELATION_TYPE"))
    private Country country;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    public Person(String name, String lastName, LocalDate birthDate, String docType, String docNumber, Country country, String phoneNumber, String email) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.docType = docType;
        this.docNumber = docNumber;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Person(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + name + '\'' +
                ", apellido='" + lastName + '\'' +
                ", fechaNacimiento=" + birthDate +
                ", tipoDocumento='" + docType + '\'' +
                ", nroDocumento='" + docNumber + '\'' +
                ", pais='" + country + '\'' +
                ", telefono='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
