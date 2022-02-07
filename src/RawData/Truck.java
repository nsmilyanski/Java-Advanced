package RawData;

public class Truck {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tire tire;

    public Truck(String model, Engine engine, Cargo cargo, Tire tire){
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tire = tire;
    }

    @Override
    public String toString() {
        return String.format("%s", this.model);
    }

    public String getModel() {
        return this.model;
    }

    public Tire getTire() {
        return tire;
    }

    public Engine getEngine() {
        return engine;
    }
}
