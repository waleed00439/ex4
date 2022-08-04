import java.util.Scanner;

public class ex2 {

    public class game {
        public static void main(String[] args) {
            double random = Math.random();
            Scanner sc = new Scanner(System.in);
            String rock = "rock";
            String paper = "paper";
            String scissors = "scissors";
            System.out.println("you play First :)");
            System.out.println("Chose rock or paper or scissors");
            String user1 = sc.next();
            int random1 = (int) (random * 3);
            System.out.println(random1);
            if (random1 == 0) {
                if (user1 == rock) {
                    System.out.println("Draw");
                } else if (user1 == paper) {
                    System.out.println("Play again :{");
                } else
                    System.out.println("ha ha loser");
            } else if (random1 == 1) {
                if (user1 == rock) {
                    System.out.println("ha ha loser");
                } else if (user1 == paper) {
                    System.out.println("draw");
                } else
                    System.out.println("Play again :{");
            } else if (random1 == 2) {

            }
            if (user1 == rock) {
                System.out.println("Play again :{");
            } else if (user1 == paper) {
                System.out.println("ha ha loser");
            } else
                System.out.println("draw");


        }
    }
}