package Google;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;

public class PersonData {


    private Car carModel;
    private Company companyName;

    private List<Parents> parentsList;
    private List<Pokemon> pokemonList;
    private List<Children> childrenList;

    public PersonData(){
        this.childrenList = new ArrayList<>();
        this.pokemonList = new ArrayList<>();
        this.parentsList = new ArrayList<>();
    }


    public void setCarModel(Car carModel) {
        this.carModel = carModel;
    }

    public void setCompanyName(Company companyName) {
        this.companyName = companyName;
    }

    public List<Parents> getParentsList() {
        return parentsList;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public List<Children> getChildrenList() {
        return childrenList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Company:").append("\n");
        if (companyName!= null) {
            sb.append(companyName.toString()).append("\n");
        }
        sb.append("Car:").append("\n");
        if (carModel != null) {
            sb.append(carModel.toString()).append("\n");
        }
        sb.append("Pokemon:").append("\n");
        for (Pokemon pokemon: pokemonList) {
            sb.append(pokemon).append("\n");
        }
        sb.append("Parents:").append("\n");
        for (Parents parents: parentsList) {
            sb.append(parents).append("\n");
        }
        sb.append("Children:").append("\n");
        for (Children child: childrenList) {
            sb.append(child).append("\n");
        }
        return sb.toString();
    }
}
