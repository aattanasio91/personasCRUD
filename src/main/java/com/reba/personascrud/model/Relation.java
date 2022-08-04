package com.reba.personascrud.model;

import javax.persistence.*;

@Entity
public class Relation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "id_person1")
    private int idPerson1;

   @Column(name = "id_person2")
    private int idPerson2;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "relation_type_id", foreignKey = @ForeignKey(name = "FK_RELATION_RELATION_TYPE"))
    private RelationType relation;

    public Relation(Integer id, int idPerson1, int idPerson2, RelationType relation) {
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

    public int getIdPerson1() {
        return idPerson1;
    }

    public void setIdPerson1(int idPerson1) {
        this.idPerson1 = idPerson1;
    }

    public int getIdPerson2() {
        return idPerson2;
    }

    public void setIdPerson2(int idPerson2) {
        this.idPerson2 = idPerson2;
    }

    public RelationType getRelation() {
        return relation;
    }

    public void setRelation(RelationType relation) {
        this.relation = relation;
    }
}
