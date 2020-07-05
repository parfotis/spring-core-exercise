package gr.ote.nextgentraining.spring.core.entities;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class MotorBike implements Vehicle{
    private Long id;
    private String brand;
    private String color;
    private String model;
    private String plateNumber;
}
