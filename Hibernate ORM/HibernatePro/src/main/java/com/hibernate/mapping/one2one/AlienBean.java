package com.hibernate.mapping.one2one;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class AlienBean {

    @Id
    private int aId;
    private String aName;
    private String tech;
    @OneToOne
    private LaptopBean laptop;

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

    public LaptopBean getLaptop() {
        return laptop;
    }

    public void setLaptop(LaptopBean laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "AlienBean{" +
                "aId=" + aId +
                ", aName='" + aName + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
