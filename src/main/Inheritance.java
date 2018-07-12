package main;

import main.vehicles.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Inheritance {

    public static void main(String[] args) {
        List<Vehicle> vehicles = new LinkedList<>();

        try (Scanner scanner = new Scanner(Inheritance.class.getResourceAsStream("/parcoveicoli.csv"))) {
            String line;

            scanner.nextLine();   // Salto l'intestazione

            while(scanner.hasNext()) {
                line = scanner.nextLine();
                String[] params = line.split(";");
                params[0] = params[0].toLowerCase();

                switch (params[0]) {
                    case "auto":
                        vehicles.add(new Auto(params[2], params[3], params[1], params[4], Integer.parseInt(params[6]), Double.parseDouble(params[5]), Double.parseDouble(params[7])));
                        break;
                    case "moto":
                        vehicles.add(new Moto(params[2], params[3], params[1], params[4], Integer.parseInt(params[6]), Double.parseDouble(params[5]), Double.parseDouble(params[7])));
                        break;
                    case "nave":
                        vehicles.add(new Nave(params[2], params[3], params[1], params[4], Integer.parseInt(params[6]), Double.parseDouble(params[5]), Double.parseDouble(params[7])));
                        break;
                    case "traghetto":
                        vehicles.add(new Traghetto(params[2], params[3], params[1], params[4], Integer.parseInt(params[6]), Double.parseDouble(params[5]), Double.parseDouble(params[7])));
                        break;
                }
            }

            double avgYear = 0;
            double sumKms = 0;

            for(Vehicle v : vehicles) {
                System.out.println(v);
                avgYear += v.getYear();
                sumKms += v.getKilometers();
            }

            avgYear /= vehicles.size();

            System.out.println();
            System.out.println("Numero di veicoli: " + vehicles.size());
            System.out.println("Anno medio: " + avgYear);
            System.out.println("Km Totali: " + sumKms);

        }
    }

}
