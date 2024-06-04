package week4;

public class OrderedState implements PackageState{


    @Override
    public void next(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void prev(Package pkg) {
        System.out.print("The package is in it's root state");
    }

    @Override
    public void checkStatus() {
        System.out.println("Package ordered, but not delivered yet");
    }
}
