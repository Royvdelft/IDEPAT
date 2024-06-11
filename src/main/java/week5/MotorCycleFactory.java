package week5;

public class MotorCycleFactory extends MotorVehicleFactory{

    @Override
    protected MotorVehicle createMotorVehicle() {
        return new MotorCycle();
    }
}
