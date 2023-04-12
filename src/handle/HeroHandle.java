package handle;

import entity.Hero;

import java.util.Scanner;

public class HeroHandle {
    public Hero inputHero(Scanner sc, int i){
        System.out.println("Mời bạn nhập tên tướng thứ "+(i+1)+" :");
        String name = sc.nextLine();

        System.out.println("Mời bạn nhập vị trí  : ");
        String position = sc.nextLine();
        return new Hero(name,position);
    }
}
