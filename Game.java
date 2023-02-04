package SnakeAndLadder;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstplayer = sc.next();
        String secondplayer = sc.next();
        int playerOnePosition = 0;
        int playerSecondPosition = 0;

        int next = 0;
        int z;
        while (playerOnePosition != 100 && playerSecondPosition != 100) {
            System.out.println();
            z = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1);
            if ((playerOnePosition + z) <= 100)
                playerOnePosition = z + playerOnePosition;

            System.out.println(firstplayer + " roll " + z);
            System.out.println(firstplayer + " reach board no " + playerOnePosition);
            switch (playerOnePosition) {
                //for firstplayer jumb to ladder
                case 28:
                    System.out.println(firstplayer + " comming near ladder ");
                    playerOnePosition = 72;
                    System.out.println(firstplayer + "climbs up 72");
                    break;
                case 10:
                    System.out.println(firstplayer + " comming near ladder ");
                    playerOnePosition = 89;
                    System.out.println(firstplayer + " climbs up 89 ");
                    break;

//firstplayer snake bite
                case 40:
                    System.out.println(firstplayer + " comming to top of snake face ");
                    playerOnePosition = 24;
                    System.out.println(firstplayer + " return board  no 24 ");
                    break;
                case 64:
                    System.out.println(firstplayer + "comming to top of snake face ");
                    playerOnePosition = 5;
                    System.out.println(firstplayer + "return board no  5");
                    break;
                // firstplayer  go clim ladder
                case 4:
                    System.out.println(secondplayer + "comming near  ladder");
                    playerSecondPosition = 22;
                    System.out.println(secondplayer + "climbs upto 22");
                    break;
                case 15:
                    System.out.println(secondplayer + "comming near  ladder");
                    playerSecondPosition = 69;
                    System.out.println(secondplayer + "climbs up 69");
                    break;
//secondplayer  snake bite
                case 87:
                    System.out.println(secondplayer + "comming to top of snake face");
                    playerSecondPosition = 56;
                    System.out.println(secondplayer + "return board no  56");
                    break;
                case 99:
                    System.out.println(secondplayer + "comming to top of snake face");
                    playerSecondPosition = 1;
                    System.out.println(secondplayer + "return board  no 1");
                    break;

            }
            next++;

        }
        System.out.println(" player  is reached 100  game is over");
    }

}
