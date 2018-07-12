package main.vehicles;

public abstract class SeaVehicle implements Vehicle {
    private int year;
    private String targa, typeOfFuel, model, brand;
    private double maxSpeed, kms;

    public SeaVehicle(String model, String brand, String targa, String typeOfFuel, int year, double maxSpeed, double kms) {
        this.model = model;
        this.brand = brand;
        this.targa = targa;
        this.typeOfFuel = typeOfFuel;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.kms = kms;
    }

    
    public int getYear() {
        return year;
    }

    
    public String getTarga() {
        return targa;
    }

    
    public double maxSpeed() {
        return maxSpeed;
    }

    
    public double getKilometers() {
        return kms;
    }

    
    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    
    public String getModel() {
        return model;
    }

    
    public String getBrand() {
        return brand;
    }

    public String toString() {
        return  "Ambiente: Mare\t| " +
                "Targa: " + targa + "\t| " +
                "Modello: " + model + "\t| " +
                "Marca: " + brand + "\t| " +
                "Tipo di carburante: " + typeOfFuel + "\t| " +
                "Anno: " + year + "\t| " +
                "Velocità massima: " + maxSpeed + " nodi\t| " +
                "Km percorsi: " + kms + "\t| ";
    }
}
