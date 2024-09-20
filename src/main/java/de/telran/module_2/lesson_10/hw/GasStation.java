package de.telran.module_2.lesson_10.hw;

import java.util.PriorityQueue;

public class GasStation {
    public static void main(String[] args) {
        PriorityQueue<Transport> transportPriorityQueue1 = new PriorityQueue<>();

        transportPriorityQueue1.add(new Transport(TransportTypes.CAR));
        transportPriorityQueue1.add(new Transport(TransportTypes.AMBULANCE));
        transportPriorityQueue1.add(new Transport(TransportTypes.BUS));
        transportPriorityQueue1.add(new Transport(TransportTypes.CITY_SERVICES_TRANSPORT));

        System.out.println("По умолчанию: скорая помощь - вне очереди, все остальные - в порядке очереди.");
        System.out.println(transportPriorityQueue1 + "\n");


        System.out.print("Первым будет обслужен: ");
        System.out.print(transportPriorityQueue1.peek() + "\n");

        System.out.print("Уже обслужен: ");
        System.out.print(transportPriorityQueue1.poll() + "\n");
        System.out.println();


        System.out.println("Оставшийся транспорт в очереди");
        System.out.println(transportPriorityQueue1 + "\n");

        //      2. очередь в час пик: автомобили - стандартно, автобусы - приоритет, скорая помощь - вне очереди. (реализуется через Comparator)

        PriorityQueue transportPriorityQueue2 = new PriorityQueue<>(new RushHourComparator());
        transportPriorityQueue2.add(new Transport(TransportTypes.CAR));
        transportPriorityQueue2.add(new Transport(TransportTypes.AMBULANCE));
        transportPriorityQueue2.add(new Transport(TransportTypes.BUS));
        transportPriorityQueue2.add(new Transport(TransportTypes.CITY_SERVICES_TRANSPORT));

        System.out.println("В час пик: скорая помощь - вне очереди, автобусы - приоритет, все остальные - в порядке очереди.");
        System.out.println(transportPriorityQueue2 + "\n");


        System.out.print("Первым будет обслужен: ");
        System.out.print(transportPriorityQueue2.peek() + "\n");

        System.out.print("Уже обслужен: ");
        System.out.print(transportPriorityQueue2.poll() + "\n");
        System.out.println();

        System.out.print("Вторым будет обслужен: ");
        System.out.print(transportPriorityQueue2.peek() + "\n");

        System.out.print("Уже обслужен: ");
        System.out.print(transportPriorityQueue2.poll() + "\n");
        System.out.println();

        System.out.print(transportPriorityQueue2.poll() + "\n");
        System.out.println();

        System.out.println("Оставшийся транспорт в очереди");
        System.out.println(transportPriorityQueue2 + "\n");

//      3. очередь во время стихийных бедствий: автомобили - стандартно, технологический транспорт - вне очереди, скорая помощь - приоритет. (реализуется через Comparator)

        PriorityQueue transportPriorityQueue3 = new PriorityQueue<>(new NaturalDisasterComparator());
        transportPriorityQueue3.add(new Transport(TransportTypes.CAR));
        transportPriorityQueue3.add(new Transport(TransportTypes.AMBULANCE));
        transportPriorityQueue3.add(new Transport(TransportTypes.BUS));
        transportPriorityQueue3.add(new Transport(TransportTypes.CITY_SERVICES_TRANSPORT));

        System.out.println("Во время стихийных бедствий: скорая помощь - приоритет, технологический транспорт - вне очереди, все остальные - в порядке очереди.");
        System.out.println(transportPriorityQueue3 + "\n");


        System.out.print("Первым будет обслужен: ");
        System.out.print(transportPriorityQueue3.peek() + "\n");

        System.out.print("Уже обслужен: ");
        System.out.print(transportPriorityQueue3.poll() + "\n");
        System.out.println();

        System.out.print("Вторым будет обслужен: ");
        System.out.print(transportPriorityQueue3.peek() + "\n");

        System.out.print("Уже обслужен: ");
        System.out.print(transportPriorityQueue3.poll() + "\n");
        System.out.println();

        System.out.println("Оставшийся транспорт в очереди");
        System.out.println(transportPriorityQueue3 + "\n");

        System.out.print("Третьим будет обслужен: ");
        System.out.print(transportPriorityQueue3.peek() + "\n");

        System.out.print("Уже обслужен: ");
        System.out.print(transportPriorityQueue3.poll() + "\n");
        System.out.println();
    }
}
