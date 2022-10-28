package transport;

import java.util.Objects;

public class Mechanic <T extends Transport1>{

    private final String name;
    private String jobPlace;

    public Mechanic(String name, String jobPlace) throws Exception  {
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new MechanicNameException();
        }
        this.name = name;
        this.jobPlace = jobPlace;
    }

    public boolean performMaintenance(T t) throws DiagException {
        return t.passDiagnostics();
    }

    public void repair(T t) {
        t.repair();
    }

    public String getName() {
        return name;
    }

    public String getJobPlace() {
        return jobPlace;
    }

    public void setJobPlace(String jobPlace) {
        this.jobPlace = jobPlace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(jobPlace, mechanic.jobPlace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, jobPlace);
    }

    @Override
    public String toString() {
        return name + " из компании " + jobPlace;
    }
}
