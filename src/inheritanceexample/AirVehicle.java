package inheritanceexample;

public class AirVehicle extends Vehicle {

    public void travelOnAir(){
        System.out.println("these travels on air");
        super.color ="Green";
        System.out.println("color is : "+super.color);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Air vehicle has started");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Air vehicle has stopped");
    }

    @Override
    public void fuel() {
        super.fuel();
        System.out.println("Air vehicle has fueled");
    }
}
