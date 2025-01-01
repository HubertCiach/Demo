package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name="todo_items")
public class ToDoItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private Boolean isComplete;
    private Instant createdAt;
    private Instant uptadetAt;

    @Override
    public String toString() {
        return String.format("ToDoItem{id=%d, description='%s', isComplete='%s', createdAt='%s', uptadetAt='%s'}", id, description, isComplete, createdAt, uptadetAt);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getComplete() {
        return isComplete;
    }

    public void setComplete(Boolean complete) {
        isComplete = complete;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUptadetAt() {
        return uptadetAt;
    }

    public void setUptadetAt(Instant uptadetAt) {
        this.uptadetAt = uptadetAt;
    }
}
