package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Flight extends Model {
    @Id
    Long id;
    // Properties
    @Constraints.Required
    private String boarding;
    @Constraints.Required
    private String arrival;
    @Constraints.Required
    private String date;
    @Constraints.Required
    private double price;

    public Flight() {
    }

    public Flight(Long id, String boarding, String arrival, String date, double price) {
        this.boarding = boarding;
        this.arrival = arrival;
        this.date = date;
        this.price = price;
        this.id = id;
    }

    public String getBoarding() {
        return boarding;
    }

    public void setBoarding(String boarding) {
        this.boarding = boarding;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static final Finder<Long, Flight> find = new Finder<>(Flight.class);

    public static final List<Flight> findAll() {
        return Flight.find.all();
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

}