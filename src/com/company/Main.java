package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int month;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter month");
        month = scan.nextInt();
        switch (month) {
            case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("mar");
                break;
            case 4:
                System.out.println("apr");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("jun");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("agus");
                break;
            case 9:
                System.out.println("sep");
                break;

            case 10:
                System.out.println("octo");
                break;
            case 11:
                System.out.println("dec");
                break;
                default:
                    System.out.println("feb");
                    break;

        }
    }
}
