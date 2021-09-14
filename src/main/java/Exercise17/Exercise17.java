/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package Exercise17;

import  java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {

        Scanner alcohol = new Scanner(System.in);

        System.out.print("Enter 1 if you are Male and Enter 2 if you are a Female: ");

        int P_Oak = alcohol.nextInt();

        System.out.print("How many ounces of alcohol did you drink? ");

        int A = alcohol.nextInt();

        System.out.print("What is your weight, in pounds? ");

        int W = alcohol.nextInt();

        System.out.print("How many hours has it been since your last drink? ");

        int H = alcohol.nextInt();

        double r;

        double BAC;

        String judgement;

        if(P_Oak == 1){

            r = .73;

            BAC = (A * 5.14 / W * r) - (.015 * H);

            judgement = (BAC < .80) ? "You can legally drive" : "You cannot legally drive";

            System.out.printf("Your BAC is %f\n%s", BAC, judgement);
        }

        else if(P_Oak == 2) {

            r = .66;

            BAC = (A * 5.14 / W * r) - (.015 * H);

            judgement = (BAC < .80) ? "You can legally drive" : "You cannot legally drive";

            System.out.printf("Your BAC is %f\n%s", BAC, judgement);

        }

        else{
            System.out.print("Please enter 1 or 2 to the first question for your BAC :  ^) ");
        }
    }
}
