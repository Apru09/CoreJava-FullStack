package com.hibernate.mapping.one2many;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class LaptopBean {

    @Id
    private int lId;
    private String brand;
    private String model;
    private int ram;
    @ManyToOne
    private AlienBean alien;

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

    public AlienBean getAlien() {
        return alien;
    }

    public void setAlien(AlienBean alien) {
        this.alien = alien;
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
