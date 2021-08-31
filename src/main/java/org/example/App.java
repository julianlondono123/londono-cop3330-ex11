import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 julian londono
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println( "How many euros are you exchanging?" );
        double c_from = input.nextDouble();
        System.out.println("What is the exchange rate? ");
        double rate = input.nextDouble();

        double c_to = Math.round(rate * c_from * 100.00)/100.00 ;
        System.out.println(c_from + " euros at an exchange rate of " + rate + " is ");
        System.out.println(c_to + " U.S dollars.");


    }
}
