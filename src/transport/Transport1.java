package transport;

import java.util.Objects;

public abstract class Transport1 {
    private final String brand;
    private final String model;
    private double enginePower;

    private final String def = "default";

    public Transport1(String brand, String model, double enginePower) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = def;
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = def;
        } else {
            this.model = model;
        }
        this.enginePower = enginePower;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setEnginePower(double enginePower) {
        if (enginePower > 0) {
            this.enginePower = enginePower;
        }
    }

    public double getEnginePower() {
        return enginePower;
    }

    public abstract void startMoving();
    public abstract void completeTheMovement();

    public abstract void determineTypeCar();
}
