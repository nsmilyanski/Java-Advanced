package CarSalesman;

public class CarforSale {
    private String model;
    private String typeEngine;
    private String weight;
    private String color;
    private Engines engines;

    public CarforSale(String model, String typeEngine) {
        this.model = model;
        this.typeEngine = typeEngine;
        this.weight = "n/a";
        this.color = "n/a";
    }

    public CarforSale(String model, String typeEngine, String color) {
       this(model, typeEngine);
       this.color = color;
       this.weight = "n/a";

    }
    public CarforSale(String model, String typeEngine, int weight) {
        this(model, typeEngine);
        this.weight = weight + "";
        this.color = "n/a";
    }

  public CarforSale(String model, String typeEngine, String weight, String color) {
       this(model, typeEngine);
        this.weight = weight;
       this.color = color;
   }

    public String getTypeEngine() {
        return this.typeEngine;
    }

    public String getModel() {
        return model;
    }

    public String getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public Engines getEngines() {
        return engines;
    }
}
