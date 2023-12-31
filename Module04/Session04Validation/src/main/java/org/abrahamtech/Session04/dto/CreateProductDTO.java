package org.abrahamtech.Session04.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class CreateProductDTO {
    
    @NotBlank(message = "El nombre del proyecto es obligatorio")
    private String name;

    // @Min(1)
    @Min(value = 1, message = "La cantidad debe ser mayor a cero")
    private int quantity;

    // @DecimalMin("0.0")
    @DecimalMin(value = "0.0", message = "El precio debe ser mayor o igual a cero")
    private double price;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
