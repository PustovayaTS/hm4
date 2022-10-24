package transport;

public class Trucks extends Transport1 implements Competing {

    private TypeOfLoadCapacity typeOfLoadCapacity;

    public Trucks(String brand, String model, double enginePower, TypeOfLoadCapacity typeOfLoadCapacity) {
        super(brand, model, enginePower);
        this.typeOfLoadCapacity = typeOfLoadCapacity;
    }

    public enum TypeOfLoadCapacity {
        N_1 ("до 3,5 тонн"),
        N_2 ("свыше 3,5 до 12 тонн"),
        N_3 ("свыше 12 тонн");

        private final String totalMass;

        TypeOfLoadCapacity(String totalMass) {
            this.totalMass = totalMass;
        }

        public String getTotalMass() {
            return totalMass;
        }
    }

    @Override
    public void determineTypeCar() {
        if (typeOfLoadCapacity == null) {
            System.out.println("Данных по авто недостаточно.");
        } else {
            System.out.println(getBrand() + " " + getModel() + " Тип грузоподъемности - " + typeOfLoadCapacity);
        }
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

    public TypeOfLoadCapacity getTypeOfLoadCapacity() {
        return typeOfLoadCapacity;
    }

    public void setTypeOfLoadCapacity(TypeOfLoadCapacity typeOfLoadCapacity) {
        this.typeOfLoadCapacity = typeOfLoadCapacity;
    }

    @Override
    public int getBestLapTime() {
        return 15;
    }

    @Override
    public int getMaxSpeed() {
        return 90;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
