package com.reba.personascrud.model.request;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.reba.personascrud.model.Person;
import com.reba.personascrud.model.RelationType;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "idPerson1", "idPerson2", "relation"})
public class RelationRequest {

    @JsonProperty("idPerson1")
    private int idPerson1;

    @JsonProperty("idPerson2")
    private int idPerson2;

    @JsonProperty("relation")
    private RelationType relation;

    public RelationRequest(int idPerson1, int idPerson2, RelationType relation) {
        this.idPerson1 = idPerson1;
        this.idPerson2 = idPerson2;
        this.relation = relation;
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
