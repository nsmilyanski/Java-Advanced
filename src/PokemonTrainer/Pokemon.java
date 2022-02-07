package PokemonTrainer;

public class Pokemon {
    private String name;
    private String element;
    private int helath;

    public Pokemon(String name, String element, int helath) {
        this.name = name;
        this.element = element;
        this.helath = helath;
    }

    public boolean decreaseHealth(){
        if (helath  > 0){
        this.helath -= 10;
        if (helath <= 0){
            return false;
        }else {
            return true;
        }
        }
        return false;
    }
}
