package SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;

public class CarsRacing {
    private String model;
    private double fuel;
    private double fuelCost;
    private int treaveledKm;



    public CarsRacing(String model, double fuel, double fuelCost){
        this.model = model;
        this.fuel = fuel;
        this.fuelCost = fuelCost;
        this.treaveledKm = 0;

    }

    public boolean drive ( int distanceTraveled){
        double requiredFuel = (distanceTraveled * 1.00) * this.fuelCost;

        if (requiredFuel > this.fuel){
            return false;
        }
        this.fuel -= requiredFuel;
        this.treaveledKm += distanceTraveled;
        return true;

    }

    public String getModel() {
        return this.model;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s", this.model, this.fuel, this.treaveledKm);
    }
}
