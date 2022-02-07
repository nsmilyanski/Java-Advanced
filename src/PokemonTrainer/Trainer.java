package PokemonTrainer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Trainer {
    private final String name;
    private int badgestNum;
    private List<Pokemon> pokemonCollection;

    public Trainer(String name) {
        this.name = name;
        this.pokemonCollection = new ArrayList<>();
        this.badgestNum = 0;
    }

    public void inceaseBagdest (){
        this.badgestNum += 1;
    }

    public int getBadgestNum() {
        return badgestNum;
    }

    public List<Pokemon> getPokemonCollection() {
        return pokemonCollection;
    }

    public void removeCollectionFromList(int index){
        this.pokemonCollection.remove(index);
    }


    @Override
    public String toString() {
        return String.format("%s %d %d", this.name, this.badgestNum, this.pokemonCollection.size());
    }
}
