package gr.ote.nextgentraining.spring.core.entities;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class User {
    private Long id;
    private String firstName;
    private String lastname;
    private String email;
    @Autowired
    Vehicle vehicle;

    public User() {
    }

    public User(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
