package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation <T extends Transport1>{

    private Queue<T> queue = new LinkedList<>();

    public void addToQueue(T transport) {
        if (transport.getClass() != Bus.class){
            queue.offer(transport);
        }
    }

    public void technicalInspection() {
        T transport1 = queue.poll();
        if (transport1 != null) {
            System.out.println("Машина " + transport1.getBrand() + " " + transport1.getModel() + " прошла техобслуживание.");
            technicalInspection();
        } else {
            System.out.println("Все машины прошли техобслуживание.");
        }
    }
}
