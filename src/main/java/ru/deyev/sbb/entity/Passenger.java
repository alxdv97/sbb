package ru.deyev.sbb.entity;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "passengers")
public class Passenger extends SimpleEntity{

    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "dateOfBirth")
    private Calendar dateOfBirth;

    public Passenger() {
    }

    public Passenger(String name, String surname, Calendar dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
