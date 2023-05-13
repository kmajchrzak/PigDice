package org.example;

import java.util.*;

import static java.lang.System.exit;

public class Main {
    static Player1 player1 = new Player1();
    static Player2 player2 = new Player2();

    public static void main(String[] args) {

        System.out.println("Witaj w grze Pig Dice");

        System.out.println("Podaj nazwę gracza 1");
        Scanner scanner = new Scanner(System.in);
        player1.name = scanner.nextLine();

        System.out.println("Podaj nazwę gracza 2");
        Scanner scanner1 = new Scanner(System.in);
        player2.name = scanner1.nextLine();

        System.out.println("Zaczynamy!");

        for (int i = 0; i < 100; i++) {
            player1game();
            player2game();
        }
    }

    static void player1game() {
        System.out.println("\n>>>>>>Graj " + player1.name + "<<<<<<");
        List<Integer> roll1 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            System.out.println("\n1. Losuj karty");
            System.out.println("2. Zachowaj");
            Scanner scanner2 = new Scanner(System.in);
            int choice = scanner2.nextInt();
            if (choice == 1) {
                Random dice1 = new Random();
                int oneDice = dice1.nextInt(6) + 1;
                Random dice2 = new Random();
                int twoDice = dice2.nextInt(6) + 1;
                System.out.println("Karta 1: " + oneDice + "\nKarta 2: " + twoDice);
                if (oneDice == 1 || twoDice == 1) {
                    System.out.println("Koniec rundy");
                    roll1.clear();
                    break;
                }
                roll1.add(oneDice + twoDice);
                int roll1a = 0;
                for (int j = 0; j < roll1.size(); j++) {
                    roll1a = roll1a + roll1.get(j);
                }
                System.out.println("Punkty w rundzie: " + roll1a);
            } else if (choice == 2) {
                int roll1x = 0;
                for (int j = 0; j < roll1.size(); j++) {
                    roll1x = roll1x + roll1.get(j);
                }
                player1.addpoints(roll1x);
                break;
            } else {
                System.out.println("Podaj opcję 1 lub 2");
            }
        }
        if (player1.points >= 100) {
            System.out.println("Punkty " + player1.name + " : " + player1.points);
            System.out.println("Punkty " + player2.name + " : " + player2.points);
            System.out.println("Wygrywa " + player1.name + " !!!");
            exit(0);
        } else {
            System.out.println("Punkty " + player1.name + " : " + player1.points);
        }
    }

    static void player2game() {
        System.out.println("\n>>>>>>Graj " + player2.name + "<<<<<<");
        List<Integer> roll2 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            System.out.println("\n1. Losuj karty");
            System.out.println("2. Zachowaj");
            Scanner scanner3 = new Scanner(System.in);
            int choice = scanner3.nextInt();
            if (choice == 1) {
                Random dice1 = new Random();
                int oneDice = dice1.nextInt(6) + 1;
                Random dice2 = new Random();
                int twoDice = dice2.nextInt(6) + 1;
                System.out.println("Karta 1: " + oneDice + "\nKarta 2: " + twoDice);
                if (oneDice == 1 || twoDice == 1) {
                    System.out.println("Koniec rundy");
                    roll2.clear();
                    break;
                }
                roll2.add(oneDice + twoDice);
                int roll2a = 0;
                for (int j = 0; j < roll2.size(); j++) {
                    roll2a = roll2a + roll2.get(j);
                }
                System.out.println("Punkty w rundzie: " + roll2a);
            } else if (choice == 2) {
                int roll2x = 0;
                for (int j = 0; j < roll2.size(); j++) {
                    roll2x = roll2x + roll2.get(j);
                }
                player2.addpoints(roll2x);
                break;
            } else {
                System.out.println("Podaj opcję 1 lub 2");
            }
        }
        if (player2.points >= 100) {
            System.out.println("Punkty " + player1.name + " : " + player1.points);
            System.out.println("Punkty " + player2.name + " : " + player2.points);
            System.out.println("Wygrywa " + player2.name + " !!!");
            exit(0);
        } else {
            System.out.println("Punkty " + player2.name + " : " + player2.points);
        }
    }
}

