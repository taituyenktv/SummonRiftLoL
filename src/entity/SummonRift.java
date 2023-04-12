package entity;

import java.time.LocalTime;
import java.util.ArrayList;

public class SummonRift {
    private ArrayList<Team> teams ;
    private LocalTime time;

    public SummonRift(ArrayList<Team> teams, LocalTime time) {
        this.teams = teams;
        this.time = time;
    }

    @Override
    public String toString() {
        return "SummonRift{" +
                "Đội " + teams +
                ", Thời gian bắt đầu trận đấu : " + time +
                '}';
    }
}
