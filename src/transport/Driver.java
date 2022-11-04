package transport;

import transport.Bus;
import transport.Transport1;

public abstract class Driver <transport extends Transport1>{
    private final String fullName;
    private final String driverLicense;
    private int experience;
    private final transport car;

    public Driver(String fullName, String driverLicense, int experience, transport car) {

        this.fullName = fullName;
        this.driverLicense = driverLicense;
        this.experience = experience;
        this.car = car;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void startMoving() {
        System.out.println("Водитель " + this.fullName + " начал движение.");
        this.car.startMoving();
    }

    public void stopMoving() {
        System.out.println("Водитель " + this.fullName + " остановился.");
        this.car.completeTheMovement();
    }

    public void refuel() {
        System.out.println("Водитель " + this.fullName + " заправляет " + this.car.getBrand());
    }

    @Override
    public String toString() {
        return fullName + ", права категории " + driverLicense + ", водительский стаж " + experience + " лет.";
    }
}
