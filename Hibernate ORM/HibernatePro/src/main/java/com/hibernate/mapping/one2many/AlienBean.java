package com.hibernate.mapping.one2many;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class AlienBean {

    @Id
    private int aId;
    private String aName;
    private String tech;
    @OneToMany(mappedBy = "alien")
    private List<LaptopBean> laptops;

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public List<LaptopBean> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<LaptopBean> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "AlienBean{" +
                "aId=" + aId +
                ", aName='" + aName + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptops +
                '}';
    }
}
