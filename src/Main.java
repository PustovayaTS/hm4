import transport.*;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Granta", 1.7);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0);
        Car bmv = new Car("BMW", "Z8", 3.0);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4);

        Trucks hyundai = new Trucks("Hyundai", "HD72", 3.3);
        Trucks volvo = new Trucks("Volvo", "FM", 12.8);
        Trucks gaz = new Trucks("ГАЗ", "3309", 2.8);
        Trucks renault = new Trucks("Renault", "Kerax", 10.8);

        Bus gazel = new Bus("ГАЗель", "NEXT A65R25-60", 2.7);
        Bus mers = new Bus("Mercedes-Benz", "Sprinter Classic", 2.1);
        Bus paz = new Bus("ПАЗ", "32054", 4.7);
        Bus nefaz = new Bus ("НЕФАЗ", "5299-11-42", 6.7);

        DriverB driverIvan = new DriverB("Ivan Ivanovich Ivanov", 10, lada);
        System.out.println(driverIvan.toString());

    }
}