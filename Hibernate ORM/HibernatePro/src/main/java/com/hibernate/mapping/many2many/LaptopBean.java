package com.hibernate.mapping.many2many;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class LaptopBean {

    @Id
    private int lId;
    private String brand;
    private String model;
    private int ram;
    @ManyToMany(mappedBy = "laptops")
    private List<AlienBean> aliens;

    public int getlId() {
        return lId;
    }

    public void setlId(int lId) {
        this.lId = lId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public List<AlienBean> getAliens() {
        return aliens;
    }

    public void setAliens(List<AlienBean> aliens) {
        this.aliens = aliens;
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
