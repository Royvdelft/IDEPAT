package week5;

public class Main {
    public static void main(String[] args){
       MotorVehicleFactory motor = new MotorCycleFactory();
       motor.create();
    }
}
