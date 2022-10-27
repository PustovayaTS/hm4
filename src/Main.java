import transport.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Car lada = new Car("Lada", "Granta", 1.7, Car.BodyType.CROSSOVER);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, Car.BodyType.SEDAN);
        Car bmv = new Car("BMW", "Z8", 3.0,  Car.BodyType.CROSSOVER);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, Car.BodyType.CROSSOVER);

        Trucks hyundai = new Trucks("Hyundai", "HD72", 3.3, Trucks.TypeOfLoadCapacity.N_2);
        Trucks volvo = new Trucks("Volvo", "FM", 12.8, Trucks.TypeOfLoadCapacity.N_3);
        Trucks gaz = new Trucks("ГАЗ", "3309", 2.8, Trucks.TypeOfLoadCapacity.N_1);
        Trucks renault = new Trucks("Renault", "Kerax", 10.8, Trucks.TypeOfLoadCapacity.N_3);

        Bus gazel = new Bus("ГАЗель", "NEXT A65R25-60", 2.7, Bus.TypeByNumberOfSeats.SMALL);
        Bus mers = new Bus("Mercedes-Benz", "Sprinter Classic", 2.1, Bus.TypeByNumberOfSeats.AVERAGE);
        Bus paz = new Bus("ПАЗ", "32054", 4.7, Bus.TypeByNumberOfSeats.SMALL);
        Bus nefaz = new Bus ("НЕФАЗ", "5299-11-42", 6.7, Bus.TypeByNumberOfSeats.AVERAGE);

        DriverB driverIvan = new DriverB("Ivan Ivanovich Ivanov", 10, lada);
        System.out.println(driverIvan.toString());

        gazel.determineTypeCar();
        volvo.determineTypeCar();

        try {
            lada.passDiagnostics();
        } catch (DiagnosticsException e) {
            System.out.println("Транспортное средство не прошло диагностику." + e.getMessage());
        }
        try {
            gazel.passDiagnostics();
        } catch (DiagnosticsException e) {
            System.out.println("Транспортное средство не прошло диагностику." + e.getMessage());
        }

    }
}