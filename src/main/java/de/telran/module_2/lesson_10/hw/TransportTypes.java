package de.telran.module_2.lesson_10.hw;

public enum TransportTypes {
    CAR ("car"),
    AMBULANCE ("ambulance"),
    BUS ("bus"),
    CITY_SERVICES_TRANSPORT ("city services transport");

    TransportTypes() {
    }
    private String transportType;

    TransportTypes(String transportTypes) {
        this.transportType = transportTypes;
    }
    @Override
    public String toString() {
        return  transportType;
    }
}