package transport;

public class Car extends Transport1 implements Competing{

    private BodyType bodyType;

    public Car(String brand, String model, double enginePower, BodyType bodyType) {
        super(brand, model, enginePower);
        this.bodyType = bodyType;
    }

    public enum BodyType {
        SEDAN,
        HATCHBACK,
        COUPE,
        STATIONWAGON,
        SUV,
        CROSSOVER,
        PICKUPTRUCK,
        VAN,
        MINIVAN;
    }

    @Override
    public void determineTypeCar() {
        if (bodyType == null) {
            System.out.println("Данных по авто недостаточно.");
        } else {
            System.out.println(getBrand() + getModel() + " Тип кузова - " + bodyType);
        }
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
        System.out.println("Водитель автомобиля " + getBrand() + " " + getModel() + " заехал на пит-стоп");
    }

    @Override
    public int getBestLapTime() {
        return 10;
    }

    @Override
    public int getMaxSpeed() {
        return 100;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
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