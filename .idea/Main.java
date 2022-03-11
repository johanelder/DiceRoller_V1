/**
 * @author Johan Elder
 * @since MArch 10, 2022
 *
 * Creating a text based D&D dice roller.
 * Use Switch case to choose which die
 * Inputs to choose, modifiers and how many dies to roll.
 * use how rollNum to set a loop?
 */
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int die;
    static int modifier;
    static int rollNum;

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        // get number of die rolls and modifiers
        System.out.println("What kind of die do you want to roll?");
        die = input.nextInt();
        System.out.println("How many times do you want to roll the " + die + "?");
        rollNum = input.nextInt();
        System.out.println();
        System.out.println("Add a modifier to your roll: ");
        modifier = input.nextInt();




    } // end main method

    // Dice methods here. One for each die. D4, D6, D8, D10, D12, D20, D100?
} // end class main
