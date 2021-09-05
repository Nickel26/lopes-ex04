import java.util.Scanner;

public class solution04 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 1 Solution
     *  Copyright 2021 Nicholas Lopes
     */
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        /*Prompt noun, verb, adjective, and adverb input and store in strings
           Display madlib with inputs included
         */
        System.out.print("Enter a noun: ");
        String noun = in.nextLine();

        System.out.print("Enter a verb: ");
        String verb = in.nextLine();

        System.out.print("Enter an adjective: ");
        String adject = in.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = in.nextLine();

        System.out.printf("Today I saw %s %s on the road doing %s %s", adject, noun, verb, adverb);
    }
}
