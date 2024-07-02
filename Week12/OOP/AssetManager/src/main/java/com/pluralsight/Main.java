package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(new House("Primary", "2022-01-01", 200000.0, "123 Main St", 2, 2000, 5000));
        assets.add(new Vehicle("Town Whip", "2022-01-01", 7500.0, "Toyota Camry", 4, 150000));
        assets.add(new House("Vacation", "2022-01-01", 400000.0, "456 Vacay Ln", 1, 1200, 2000));
        assets.add(new Vehicle("Rally Whip", "2022-01-01", 50000.0, "Ram Promaster", 9, 50000));

        for (Asset asset : assets) {
            System.out.println(asset.getDescription());
            System.out.println(asset.getDateAcquired());
            System.out.printf("Original Price: %.2f\n", asset.getOriginalCost());
            System.out.printf("Value: %.2f\n", asset.getValue());

            if (asset instanceof House) {
                System.out.println("Address: " + ((House) asset).getAddress());
            }
            if (asset instanceof Vehicle) {
                System.out.println("Vehicle Make: " + ((Vehicle) asset).getMakeModel());
            }
            System.out.println();
        }
    }
}
