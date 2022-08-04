package com.reba.personascrud.model;

import javax.persistence.*;

@Entity
public class RelationType {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "relation_type")
    private String relType;

    public RelationType(Integer id, String relType) {
        this.id = id;
        this.relType = relType;
    }

    public RelationType() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRelType() {
        return relType;
    }

    public void setRelType(String relType) {
        this.relType = relType;
    }
}
