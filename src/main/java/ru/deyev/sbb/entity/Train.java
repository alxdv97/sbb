package ru.deyev.sbb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Deque;

@Entity
@Table(name = "trains")
public class Train extends SimpleEntity {

    @Column(name = "number")
    private Long number;
    @Column(name = "following_stations")
    private Deque<Station> followingStations;
    @Column(name = "places")
    private int places;



    public Train() {
    }

    public Train(Long number, Deque<Station> followingStations, int places) {
        this.number = number;
        this.followingStations = followingStations;
        this.places = places;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Deque<Station> getFollowingStations() {
        return followingStations;
    }

    public void setFollowingStations(Deque<Station> followingStations) {
        this.followingStations = followingStations;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", number=" + number +
                ", followingStations=" + followingStations +
                ", places=" + places +
                '}';
    }
}
