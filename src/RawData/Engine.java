package RawData;

public class Engine {
    private int engineSpeed;
    private int enginePower;

    public Engine(int engineSpeed, int enginePower){
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
    }

    public  boolean isEngineOver250Hp(){
        return enginePower > 250;
    }
}
