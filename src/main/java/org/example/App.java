/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Austin Mathew
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        boolean YN;
        Scanner input = new Scanner(System.in);

        System.out.println( "Is the car silent when you turn the key? then (yes)" );
        YN = input.next().equalsIgnoreCase("yes");

        if(YN){
            System.out.println( "Are the battery terminals corroded? then (yes)" );
            YN = input.next().equalsIgnoreCase("yes");

            if(YN){
                System.out.println("Clean terminals and try starting again.");
            }
            else{
                System.out.println("Replace cables and try again.");
            }
        }
        else {
            System.out.println( "Does the car make a slicking noise? then (yes)" );
            YN = input.next().equalsIgnoreCase("yes");

            if(YN){
                System.out.println("Replace the battery.");
            }
            else {
                System.out.println( "Does the car crank up but fail to start? then (yes)" );
                YN = input.next().equalsIgnoreCase("yes");

                if(YN) {
                    System.out.println("Check spark plug connections.");
                }
                else {
                    System.out.println( "Does the engine start and then die? then (yes)" );
                    YN = input.next().equalsIgnoreCase("yes");

                    if(YN){
                        System.out.println( "Does you car have fuel injection? then (yes)" );
                        YN = input.next().equalsIgnoreCase("yes");

                        if(YN){
                            System.out.println("Get it in for service.");
                        }
                        else {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else {
                        System.out.println("This should not be possible.");
                    }

                }
            }

        }

    }
}
