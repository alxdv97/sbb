package ru.deyev.sbb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tickets")
public class Ticket extends SimpleEntity {

    @Column(name = "train_number")
    private Long trainNumber;
    @Column(name = "passenger")
    private Passenger passenger;


    public Ticket() {
    }

    public Ticket(Long trainNumber, Passenger passenger) {
        this.trainNumber = trainNumber;
        this.passenger = passenger;
    }

    public Long getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(Long trainNumber) {
        this.trainNumber = trainNumber;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", trainNumber=" + trainNumber +
                ", passenger=" + passenger +
                '}';
    }
}
