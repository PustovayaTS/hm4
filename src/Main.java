import transport.*;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Mechanic<Car> dmitriy = new Mechanic<Car>("Dmitriy Ivanovich", "Company1");
        Mechanic<Car> slava = new Mechanic<Car>("Slava Savelyevich", "Company2");
        Mechanic<Car> anton = new Mechanic<Car>("Anton Sergeevich", "Company3");
        Mechanic<Trucks> natalia = new Mechanic<Trucks>("Natalia Petrovna", "Company4");
        Mechanic<Trucks> svetlana = new Mechanic<Trucks>("Svetlana Alekseevna", "Company4");
        Mechanic<Bus> fedor = new Mechanic<Bus>("Fedor Ivanovich", "Company2");
        Mechanic<Bus> anastasia = new Mechanic<Bus>("Anastasia Sergeevna", "Company1");
        Sponsor petrComp = new Sponsor("PetrComp", 10_000);
        Sponsor coAndO = new Sponsor("Co and O", 150_000);
        Sponsor maksim = new Sponsor("Maksim", 170_000);
        Sponsor oneTrust = new Sponsor("One Trust", 200_000);

        Car lada = new Car("Lada", "Granta", 1.7, Car.BodyType.CROSSOVER);
        lada.addDriver(new DriverB("Ivan Ivanovich Ivanov", 10, lada));
        lada.addMechanic(dmitriy);
        lada.addSponsor(petrComp, coAndO);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, Car.BodyType.SEDAN);
        audi.addDriver(new DriverB("Semen Semenovich Semenov", 30, audi));
        audi.addMechanic(slava, anton);
        audi.addSponsor(maksim);
        //Car bmv = new Car("BMW", "Z8", 3.0,  Car.BodyType.CROSSOVER);
        //Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, Car.BodyType.CROSSOVER);

        Trucks hyundai = new Trucks("Hyundai", "HD72", 3.3, Trucks.TypeOfLoadCapacity.N_2);
        hyundai.addDriver(new DriverC("Aleksandr Aleksandrovich Aleksandrov", 11, hyundai));
        hyundai.addMechanic(natalia);
        hyundai.addSponsor(petrComp, maksim);
        Trucks volvo = new Trucks("Volvo", "FM", 12.8, Trucks.TypeOfLoadCapacity.N_3);
        volvo.addDriver(new DriverC("Sergey Sergeevich Sergeev", 8, volvo));
        volvo.addMechanic(svetlana);
        volvo.addSponsor(coAndO);
        //Trucks gaz = new Trucks("ГАЗ", "3309", 2.8, Trucks.TypeOfLoadCapacity.N_1);
        //Trucks renault = new Trucks("Renault", "Kerax", 10.8, Trucks.TypeOfLoadCapacity.N_3);

        Bus gazel = new Bus("ГАЗель", "NEXT A65R25-60", 2.7, Bus.TypeByNumberOfSeats.SMALL);
        gazel.addDriver(new DriverD("Matvey Vladimirovich Matveev", 25, gazel));
        gazel.addMechanic(fedor, anastasia);
        gazel.addSponsor(oneTrust);
        Bus mers = new Bus("Mercedes-Benz", "Sprinter Classic", 2.1, Bus.TypeByNumberOfSeats.AVERAGE);
        mers.addDriver(new DriverD("Petr Alekseevich Voronov", 14, mers));
        mers.addMechanic(fedor);
        mers.addSponsor(petrComp, maksim);
        //Bus paz = new Bus("ПАЗ", "32054", 4.7, Bus.TypeByNumberOfSeats.SMALL);
        //Bus nefaz = new Bus ("НЕФАЗ", "5299-11-42", 6.7, Bus.TypeByNumberOfSeats.AVERAGE);

        //System.out.println(driverIvan.toString());

        //gazel.determineTypeCar();
        //volvo.determineTypeCar();

        //try {
        //    lada.passDiagnostics();
        //} catch (DiagnosticsException e) {
        //    System.out.println("Транспортное средство не прошло диагностику." + e.getMessage());
        //}
        //try {
        //    gazel.passDiagnostics();
        //} catch (DiagnosticsException e) {
        //    System.out.println("Транспортное средство не прошло диагностику." + e.getMessage());
        //}

        List<Transport1> transport1s1 = List.of(
                lada,audi,
                hyundai,volvo,
                gazel,mers,lada
                );

        //LinkedList<Transport1> transport1s = new LinkedList<Transport1>();
        TransportList transportList = new TransportList();
        transportList.addListAll(transport1s1);
        ServiceStation srv = new ServiceStation();
        System.out.println(transportList);

        /*transport1s.addAll(transport1s1);
        ServiceStation srv = new ServiceStation();
        for (Transport1 transport1 : transport1s) {
            printInfo(transport1);
            srv.addToQueue(transport1);
        }
        srv.technicalInspection();*/
    }


    private static void printInfo (Transport1 transport1) {
        System.out.println("Информация об участнике заезда: " + transport1.getBrand() + " " + transport1.getModel());
        System.out.println("Водитель - " + transport1.getDrivers());
        System.out.println("Спонсоры: " + transport1.getSponsors());
        System.out.println("Механики: " + transport1.getMechanics());
    }

    ServiceStation serviceStation = new ServiceStation();
    //serviceStation.addToQueue(lada);
}