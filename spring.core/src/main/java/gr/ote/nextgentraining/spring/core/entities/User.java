package gr.ote.nextgentraining.spring.core.entities;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class User {
    private Long id;
    private String firstName;
    private String lastname;
    private String email;
    @Autowired
    List<Vehicle> vehicles;

    public User() {
    }

    public User(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
