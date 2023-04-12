package handle;

import entity.Hero;
import entity.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class TeamHandle {
    public Team inputTeam(Scanner sc) {

        System.out.println("Mời bạn nhập tên đội:  ");
        String name = sc.nextLine();
        ArrayList<Hero> heroes = new ArrayList<>();
        HeroHandle heroHandle = new HeroHandle();
        for (int i = 0; i < 5; i++) {
            Hero hero = heroHandle.inputHero(sc, i);
            heroes.add(hero);

        }
        return new Team(name, heroes);
    }
}

