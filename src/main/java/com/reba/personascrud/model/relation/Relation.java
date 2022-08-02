package com.reba.personascrud.model.relation;

import javax.persistence.*;

@Entity
public class Relation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "id_person1")
    private Integer idPerson1;

    @Column(name = "id_person2")
    private Integer idPerson2;

    @Column(name = "relation")
    private String relation;

    public Relation(Integer id, Integer idPerson1, Integer idPerson2, String relation) {
        this.id = id;
        this.idPerson1 = idPerson1;
        this.idPerson2 = idPerson2;
        this.relation = relation;
    }

    public Relation() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdPerson1() {
        return idPerson1;
    }

    public void setIdPerson1(Integer idPerson1) {
        this.idPerson1 = idPerson1;
    }

    public Integer getIdPerson2() {
        return idPerson2;
    }

    public void setIdPerson2(Integer idPerson2) {
        this.idPerson2 = idPerson2;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }
}
