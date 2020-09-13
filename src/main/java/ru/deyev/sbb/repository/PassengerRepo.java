package ru.deyev.sbb.repository;

import org.hibernate.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.deyev.sbb.entity.Passenger;


import java.util.Calendar;
import java.util.List;

@Repository
public class PassengerRepo extends BasicRepository<Passenger> {

    protected PassengerRepo() {
        super(Passenger.class);
    }

    public List<Passenger> findByNameAndBirthDate(String name, String surname, Calendar birthDate){
        String queryString = "select p from Passenger p where lower(p.name) = :name and " +
                "lower(p.surname) = :surname and year(p.birthDate) = year(:birthDate) " +
                "and month(p.birthDate) = month(:birthDate) and day(p.birthDate) = day(:birthDate)";
        Query query = getSession().createQuery(queryString)
                .setParameter("name", name.toLowerCase())
                .setParameter("surname", surname.toLowerCase())
                .setParameter("birthDate", birthDate);

        return query.getResultList();
    }

    //todo implement all methods
}
