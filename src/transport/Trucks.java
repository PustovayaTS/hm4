package transport;

public class Trucks extends Transport1 implements Competing {
    public Trucks(String brand, String model, double enginePower) {
        super(brand, model, enginePower);
    }

    @Override
    public void startMoving() {
        System.out.println("начать движение на грузовике");
    }

    @Override
    public void completeTheMovement() {
        System.out.println("закончить движение на грузовике");
    }

    @Override
    public void doPitStop() {
        System.out.println("Водитель грузовика " + getBrand() + getModel() + " заехал на пит-стоп");
    }

    @Override
    public int getBestLapTime() {
        return 15;
    }

    @Override
    public int getMaxSpeed() {
        return 90;
    }
}
