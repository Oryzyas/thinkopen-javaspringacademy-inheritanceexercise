package main.vehicles;

public abstract class GroundVehicle implements Vehicle {
    private int numOfWheels, year;
    private String targa, typeOfFuel, model, brand;
    private double maxSpeed, kms;

    public GroundVehicle(int numOfWheels, String model, String brand, String targa, String typeOfFuel, int year, double maxSpeed, double kms) {
        if(numOfWheels < 1)
            throw new IllegalArgumentException("Numero di ruote non valido");

        this.numOfWheels = numOfWheels;
        this.model = model;
        this.brand = brand;
        this.targa = targa;
        this.typeOfFuel = typeOfFuel;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.kms = kms;
    }

    public final int getNumberOfWheels() {
        return numOfWheels;
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
        return  "Ambiente: Terra\t| " +
                "Targa: " + targa + "\t| " +
                "Modello: " + model + "\t| " +
                "Marca: " + brand + "\t| " +
                "Tipo di carburante: " + typeOfFuel + "\t| " +
                "Numero di ruote: " + numOfWheels + "\t| " +
                "Anno: " + year + "\t| " +
                "Velocità massima: " + maxSpeed + " km/h\t| " +
                "Km percorsi: " + kms + "\t| ";
    }
}
