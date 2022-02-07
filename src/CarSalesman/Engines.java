package CarSalesman;

public class Engines {
    private String model;
    private int power;
    private String displacement;
    private String efficiency;

    public Engines(String model, int power) {
        this.model = model;
        this.power = power;
        this.displacement = "n/a";
        this.efficiency = "n/a";
    }

    public Engines(String model, int power, String efficiency) {
        this(model, power);
        this.efficiency = efficiency;
        this.displacement = "n/a";
    }

    public Engines(String model, int power, int displacement) {
        this(model, power);
        this.displacement =  displacement + "";
        this.efficiency = "n/a";
    }

    public Engines(String model, int power, String displacement, String efficiency) {
        this(model, power);
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public String getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    @Override
    public String toString() {
        return String.format("%s:\n" +
                "Power: %d\n" +
                "Displacement: %s\n" +
                "Efficiency: %s", this.model, this.power, this.displacement, this.efficiency);
    }
}
