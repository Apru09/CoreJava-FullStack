package com.hibernate.mapping.one2one;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LaptopBean {

    @Id
    private int lId;
    private String brand;
    private String model;
    private int ram;

    public int getlId() {
        return lId;
    }

    public void setlId(int lId) {
        this.lId = lId;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "LaptopBean{" +
                "lId=" + lId +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }
}
