package ru.deyev.sbb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Entity
@Table(name = "stations")
public class Station extends SimpleEntity {

    @Column(name = "name")
    private String name;
//    @Column(name = "schedule")
//    private HashMap<Train, Date> schedule;


    public Station() {
    }

//    public Station(String name, Map<Long, Date> schedule) {
//        this.name = name;
//        this.schedule = schedule;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Map<Long, Date> getSchedule() {
//        return schedule;
//    }
//
//    public void setSchedule(Map<Long, Date> schedule) {
//        this.schedule = schedule;
//    }

    @Override
    public String toString() {
        return "Station{" +
                "id=" + id +
                ", name='" + name + '\'' +
//                ", schedule=" + schedule +
                '}';
    }
}
