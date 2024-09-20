package de.telran.module_2.lesson_10.hw;

import java.util.Comparator;

// стихийное бедствие
public class NaturalDisasterComparator implements Comparator<Transport> {

    @Override
    public int compare(Transport transport1, Transport transport2) {
        if (transport1.getTransportTypes().equals(TransportTypes.AMBULANCE)){
            transport1.setPriorityLevel(2);
        } else if (transport2.getTransportTypes().equals(TransportTypes.AMBULANCE)){
            transport2.setPriorityLevel(2);
        }
        if (transport1.getTransportTypes().equals(TransportTypes.CITY_SERVICES_TRANSPORT)){
            transport1.setPriorityLevel(1);
        } else if (transport2.getTransportTypes().equals(TransportTypes.CITY_SERVICES_TRANSPORT)){
            transport2.setPriorityLevel(1);
        }

        if (transport1.getPriorityLevel() == transport2.getPriorityLevel()) {
            return 0;
        } else if (transport1.getPriorityLevel() < transport2.getPriorityLevel()) {
            return -1;
        } else {
            return 1;
        }
    }
}