package seminars.second.hw;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    public void testWheelsCar(){
        Car car = new Car("Ford", "Escort", 2020);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    public void testWheelsMoto(){
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Bandit", 2022);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    public void testSpeedCar(){
        Car car = new Car("Ford", "Escort", 2020);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    public void testSpeedMoto(){
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Bandit", 2022);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    public void testParkCar(){
        Car car = new Car("Ford", "Escort", 2020);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    public void testParkMoto(){
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Bandit", 2022);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }

}