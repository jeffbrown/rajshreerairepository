package com.myproject.project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BufferConditionEntity {

    @Id
    @GeneratedValue
    Long id;

    String name;

    public BufferConditionEntity(String name) {
        this.name = name;
    }

    public BufferConditionEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
