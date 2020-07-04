package gr.ote.nextgentraining.spring.core.entities;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Long id;
    private String firstName;
    private String lastname;
    private String email;
    Vehicle vehicle;

    public User() {
    }

    public User(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
