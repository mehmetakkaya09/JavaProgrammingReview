package day04_10_01_2022;
import java.util.Scanner;
public class BlackJack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int house = s.nextInt();
        int player = s.nextInt();

        if (player == 21){
            System.out.println("player win");
        }
        if (player == house){
            System.out.println("its a tie");
        }
        if (player > 21) {
            System.out.println("player bust");
        }
        if (house > player){
            System.out.println("player lose");
        }
        if (player > house){
            System.out.println("player win");
        }
    }
}
