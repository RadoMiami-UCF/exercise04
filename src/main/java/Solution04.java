import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 1 Solution
         *  Copyright 2021 Kimari Guthre
         */
        /* Ask for a word, then store it
        Repeat three times, (can't be looped due to different prints)
        Print the mad lib story with the four words
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = in.nextLine();
        System.out.print("Enter a verb: ");
        String verb = in.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = in.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = in.nextLine();
        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
    }
}
