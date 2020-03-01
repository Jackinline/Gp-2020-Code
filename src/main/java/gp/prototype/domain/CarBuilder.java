package gp.prototype.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarBuilder {
    Car car = new Car();

    public CarBuilder addChair(String chair) {
        car.setChair(chair);
        return this;
    }

    public CarBuilder addSteeringWheel(String steeringWheel) {
        car.setSteeringWheel(steeringWheel);
        return this;
    }

    public CarBuilder addTyres(String... tyres) {
        car.setTyres(Arrays.asList(tyres));
        return this;
    }

    public Car build() {
        return car;
    }
}
