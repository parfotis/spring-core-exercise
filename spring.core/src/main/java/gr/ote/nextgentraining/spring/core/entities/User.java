package gr.ote.nextgentraining.spring.core.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class User {
    private Long id;
    private String firstName;
    private String lastname;
    private String email;
    List<Vehicle> vehicles;

    public User() {
    }

    @Autowired
    public User(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
