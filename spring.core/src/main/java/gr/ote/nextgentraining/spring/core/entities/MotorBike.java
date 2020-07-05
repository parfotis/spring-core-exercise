package gr.ote.nextgentraining.spring.core.entities;

import org.springframework.stereotype.Component;

@Component
public class MotorBike implements Vehicle{
    private Long id;
    private String brand;
    private String color;
    private String model;
    private String plateNumber;
}
