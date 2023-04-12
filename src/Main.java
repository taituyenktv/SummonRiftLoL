import entity.Hero;
import entity.SummonRift;
import handle.HeroHandle;
import handle.SummonRiftHandle;
import handle.TeamHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SummonRiftHandle summonRiftHandle = new SummonRiftHandle();
        SummonRift summonRift = summonRiftHandle.inputSummonRift(sc);
        System.out.println(summonRift);
        System.out.println("Mời qúy vị đón xem  ");

    }
}
