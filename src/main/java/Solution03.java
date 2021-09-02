/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Glaspey
 */

import java.util.Scanner;

public class Solution03 {
    /*
    Create a program that prompts for a quote and an author. Display the quotation and author as shown in the example output.
    's1', 's2' = Strings to hold quote and author
    print "Enter quote"
    print "Enter author"
    print "Author: 's2' Quote: 's1'"
     */

    public static void main(String[] args) {

        //declare variables
        Scanner in = new Scanner(System.in);
        String s1, s2;

        System.out.print("What is the quote? ");
        s1 = in.nextLine();
        System.out.print("Who said it? ");
        s2 = in.nextLine();
        System.out.println(s2 + " says, \"" + s1 + "\"");
    }
}
