package transport;

public class Car extends Transport1 implements Competing{
    public Car(String brand, String model, double enginePower) {
        super(brand, model, enginePower);
    }

    @Override
    public void startMoving() {
        System.out.println("начать движение на автомобиле");
    }

    @Override
    public void completeTheMovement() {
        System.out.println("закончить движение на автомобиле");
    }


    @Override
    public void doPitStop() {
        System.out.println("Водитель автомобиля " + getBrand() + getModel() + " заехал на пит-стоп");
    }

    @Override
    public int getBestLapTime() {
        return 10;
    }

    @Override
    public int getMaxSpeed() {
        return 100;
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