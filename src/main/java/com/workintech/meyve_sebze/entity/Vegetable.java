package com.workintech.meyve_sebze.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(name="vegetable" , schema="public")
@Entity

public class Vegetable extends Plant{
    @Column(name="is_grown_on_tree")
    private boolean isGrownOnTree;
}
