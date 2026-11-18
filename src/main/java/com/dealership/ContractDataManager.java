package com.dealership;

import java.io.*;
import java.math.BigDecimal;

public class ContractDataManager {
    static String fileName = "C:\\Users\\zurit\\pluralsight\\workshop\\adv-dealership-project\\src\\main\\java\\com\\dealership\\contracts.csv\\";

    public static Dealership getContracts() throws IOException {

        Dealership dealer;
        try (BufferedReader readFile = new BufferedReader(new FileReader(fileName))) {
            String line = readFile.readLine();
            String[] dealerInfo = line.split("\\|");
            dealer = new Dealership(dealerInfo[0], dealerInfo[1], dealerInfo[2]);

            while ((line = readFile.readLine()) != null) {
                String[] listing = line.split("\\|");

                Vehicle newVehicle = new Vehicle(
                        Integer.parseInt(listing[0].trim()),
                        Integer.parseInt(listing[1].trim()),
                        listing[2],
                        listing[3],
                        listing[4],
                        listing[5],
                        Integer.parseInt(listing[6].trim()),
                        new BigDecimal(listing[7].trim()));

                dealer.addVehicle(newVehicle);
            }
        }
        return dealer;
    }

    public static void saveContract(Contract contract, Dealership dealership) throws IOException {
        try (BufferedWriter writeFile = new BufferedWriter(new FileWriter(fileName))){
            for ()
        }
    }
}

