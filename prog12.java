/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Emilly Wasson
 */

import java.math.RoundingMode;
import java.util.Scanner;
import java.text.DecimalFormat;

public class prog12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Enter the principal: ");
        double principal = in.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = in.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = in.nextInt();

        double total = principal * (1 + (rate/100)*years);

        df.setRoundingMode(RoundingMode.UP);
        System.out.println("After " + years + " years at " + rate + "%, the investment will be worth $" + df.format(total));
    }
}
