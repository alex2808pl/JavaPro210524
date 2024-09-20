package de.telran.module_2.lesson_10.hw;

public class Transport  implements Comparable<Transport> {

    private TransportTypes transportTypes;
    private int priorityLevel;

    public Transport(TransportTypes transportTypes) {
        this.transportTypes = transportTypes;
        this.priorityLevel = 4;
    }

    public TransportTypes getTransportTypes() {
        return transportTypes;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "transportTypes=" + transportTypes +
                ", priorityLevel=" + priorityLevel +
                "}";
    }


    @Override
    public int compareTo(Transport other) {
        if (this.getTransportTypes().equals(TransportTypes.AMBULANCE)){
            this.setPriorityLevel(1);
        } else if (other.getTransportTypes().equals(TransportTypes.AMBULANCE)){
            other.setPriorityLevel(1);
        }
        if (this.getPriorityLevel() == other.getPriorityLevel()) {
            return 0;
        } else if (this.getPriorityLevel() < other.getPriorityLevel()) {
            return -1;
        } else {
            return 1;
        }
    }
}
