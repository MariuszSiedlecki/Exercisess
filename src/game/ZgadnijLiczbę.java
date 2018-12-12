package game;

import java.util.Scanner;

public class ZgadnijLiczbę {
    public static void main(String[] args) {

        int userWinner =6;
        Scanner scanner = new Scanner(System.in);
        int userAnswer ;
        do{
            System.out.println("Podaj liczbę:");
            userAnswer= scanner.nextInt();
            if(userAnswer>6){
                System.out.println("za dużo celuj nizej...");
            }else {
                if(userAnswer<6){
                    System.out.println("celuj wyżej za mało...");
                }
            }
        }while(userAnswer!=userWinner);
        System.out.println("Graatuluję trafiłeś !!!");
    }
}
