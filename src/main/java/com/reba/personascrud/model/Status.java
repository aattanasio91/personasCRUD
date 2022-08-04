package com.reba.personascrud.model;

import javax.persistence.Id;

public class Status {

    private String name;
    private String percentage;

    public Status(String name, String percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }
}
