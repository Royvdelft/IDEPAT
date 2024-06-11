package week5;

public class CarFactory extends MotorVehicleFactory{

    @Override
    protected MotorVehicle createMotorVehicle() {
        return new Car();
    }
}
