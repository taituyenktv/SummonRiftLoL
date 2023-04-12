package handle;

import entity.Hero;
import entity.SummonRift;
import entity.Team;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Scanner;

public class SummonRiftHandle {
    public SummonRift inputSummonRift(Scanner sc) {

        System.out.println("Mời bạn nhập thời gian của trận đấu: (HH:mm)");
        String time = sc.nextLine();
        LocalTime time1 = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm"));
        TeamHandle teamHandle = new TeamHandle();
        ArrayList<Team> teams = new ArrayList<>();
        for (int i = 0; i < 2; i++) {

            Team team = teamHandle.inputTeam(sc);
            teams.add(team);
        }
        return new SummonRift(teams, time1);


//        System.out.println("Mời bạn nhập các tướng của Team SKT");
//        TeamHandle teamHandle = new TeamHandle();
//        ArrayList<Hero> teamSKT = teamHandle.inputTeam(sc);
//        System.out.println("Mời bạn nhập các tướng của Team G2");
//        ArrayList<Hero> teamG2 = teamHandle.inputTeam(sc);
//        ArrayList<ArrayList<Hero>> summonRifts = new ArrayList<>();
//        summonRifts.add(teamSKT);
//        summonRifts.add(teamG2);
//        return new SummonRift(summonRifts,time1);
    }
}
