package org.abraham.java.backend.Session08.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "PRODUCTS")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private float price;

    @Column(name = "num_register", length = 20)
    private String numRegister;

    @Column(name = "date_creation")
    private LocalDate creationDate;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getNumRegister() {
        return numRegister;
    }

    public void setNumRegister(String numRegister) {
        this.numRegister = numRegister;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}
