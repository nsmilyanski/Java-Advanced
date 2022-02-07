package DefiningClasses;

public class Cars {
    private String brand;
    private String model;
    private int horsePower;


    public int getHorsePower() {
        return this.horsePower;
    }

    public String getModel() {
        return this.model;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
