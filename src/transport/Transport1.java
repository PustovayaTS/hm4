package transport;

import java.util.*;

public abstract class Transport1 {
    private final String brand;
    private final String model;
    private double enginePower;
    private final String def = "default";
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();

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

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public abstract void startMoving();
    public abstract void completeTheMovement();
    public abstract void determineTypeCar();
    public abstract boolean passDiagnostics() throws DiagException;

    public void addDriver(Driver<?>... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }

    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    private LinkedList<Transport1> participants;

    public LinkedList<Transport1> getParticipants() {
        return participants;
    }

    public abstract void repair();
}
