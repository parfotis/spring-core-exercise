package gr.ote.nextgentraining.spring.core.entities;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Long id;
    private String firstName;
    private String lastname;
    private String email;
    List<Vehicle> vehicles;

    public User(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
