package com.dany.joboffers.offer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class JobOffer {
    private @Id @GeneratedValue Long id;
    private String name;
    private String description;
    private String city;
    private String companyName;

    public JobOffer() {
    }

    public JobOffer(String name, String description, String city, String companyName) {
        this.name = name;
        this.description = description;
        this.city = city;
        this.companyName = companyName;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobOffer jobOffer = (JobOffer) o;
        return Objects.equals(id, jobOffer.id) &&
                Objects.equals(name, jobOffer.name) &&
                Objects.equals(description, jobOffer.description) &&
                Objects.equals(city, jobOffer.city) &&
                Objects.equals(companyName, jobOffer.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, city, companyName);
    }

    @Override
    public String toString() {
        return "JobOffer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", city='" + city + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
