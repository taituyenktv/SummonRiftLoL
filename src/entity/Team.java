package entity;

import java.util.ArrayList;

public class Team {
    private String name;
    private  ArrayList<Hero> heroes;

    public Team(String name, ArrayList<Hero> heroes) {
        this.name = name;
        this.heroes = heroes;
    }

    public ArrayList<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(ArrayList<Hero> heroes) {
        this.heroes = heroes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "Tên đội : " + name +
                ", Gồm các tướng : " + heroes +
                "\n " ;
    }
}
