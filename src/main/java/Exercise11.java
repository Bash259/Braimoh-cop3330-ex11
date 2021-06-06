/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fouad Braimoh
 */


import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        System.out.println("How may euros are you exchanging?");
        Scanner UserInput = new Scanner(System.in);
        double amountFrom = UserInput.nextDouble();

        System.out.println("What is the exchange rate?");
        double rateFrom = UserInput.nextDouble();

        double rateTo = (81 * 137.51)/111.38;

        double amountTo = Math.round((amountFrom * rateFrom)/rateTo);

        String Output = amountFrom + " euros at an exchange rate of " + rateFrom +" is \n" +amountTo + " U.S. Dollars.";

        System.out.println(Output);
    }
}
