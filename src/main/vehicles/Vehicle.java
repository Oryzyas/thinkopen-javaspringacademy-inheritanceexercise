package main.vehicles;

public interface Vehicle {
    int getYear();
    String getTarga();

    double maxSpeed();
    double getKilometers();

    String getTypeOfFuel();
    String getModel();
    String getBrand();
}
