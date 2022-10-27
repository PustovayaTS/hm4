package transport;

public class Bus extends Transport1 implements Competing{

    private TypeByNumberOfSeats typeByNumberOfSeats;

    public Bus(String brand, String model, double enginePower, TypeByNumberOfSeats typeByNumberOfSeats) {
        super(brand, model, enginePower);
        this.typeByNumberOfSeats = typeByNumberOfSeats;
    }

    public enum TypeByNumberOfSeats{
        ESPECIALLY_SMALL ("до 10 мест"),
        SMALL ("до 20 мест"),
        AVERAGE ("40–50 мест"),
        LARGE ("60–80 мест"),
        ESPECIALLY_BIG ("100–120 мест");

        private final String numberOfSeats;

        TypeByNumberOfSeats(String numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
        }

        public String getNumberOfSeats() {
            return numberOfSeats;
        }
    }

    @Override
    public void determineTypeCar() {
        if (typeByNumberOfSeats == null) {
            System.out.println("Данных по авто недостаточно.");
        } else {
            System.out.println(getBrand() + " " + getModel() + " Тип вместимости - " + typeByNumberOfSeats);
        }
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

    public TypeByNumberOfSeats getTypeByNumberOfSeats() {
        return typeByNumberOfSeats;
    }

    public void setTypeByNumberOfSeats(TypeByNumberOfSeats typeByNumberOfSeats) {
        this.typeByNumberOfSeats = typeByNumberOfSeats;
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не нуждается.");
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