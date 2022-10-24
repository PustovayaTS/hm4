package transport;

public class Bus extends Transport1 implements Competing{
    public Bus(String brand, String model, double enginePower) {
        super(brand, model, enginePower);
    }

    @Override
    public void startMoving() {
        System.out.println("начать движение на автобусе");
    }

    @Override
    public void completeTheMovement() {
        System.out.println("закончить движение на автобусе");
    }

    @Override
    public void doPitStop() {
        System.out.println("Водитель автобуса " + getBrand() + getModel() + " заехал на пит-стоп");
    }

    @Override
    public int getBestLapTime() {
        return 13;
    }

    @Override
    public int getMaxSpeed() {
        return 70;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}