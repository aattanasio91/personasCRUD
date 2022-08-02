package com.reba.personascrud.model.relation.request;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "idPerson1", "idPerson2", "relation"})
public class RelationRequest {

    @JsonProperty("idPerson1")
    private Integer idPerson1;

    @JsonProperty("idPerson2")
    private Integer idPerson2;

    @JsonProperty("relation")
    private String relation;

    public RelationRequest(Integer idPerson1, Integer idPerson2, String relation) {
        this.idPerson1 = idPerson1;
        this.idPerson2 = idPerson2;
        this.relation = relation;
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
