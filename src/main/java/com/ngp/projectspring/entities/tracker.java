package com.ngp.projectspring.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class tracker {
    @Id @GeneratedValue
    int id;
    String name;
    String batch;

}
