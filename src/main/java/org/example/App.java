/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Brandon Knudson
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int people, pizzas, slices;
        System.out.println("How many people? ");
        people = input.nextInt();
        System.out.println("How many pizzas do you have? ");
        pizzas = input.nextInt();
        System.out.println("How many slices per pizza? ");
        slices = input.nextInt();


        System.out.printf("%d people with %d pizzas (%d slices)%n", people, pizzas, slices * pizzas);
        System.out.printf("Each person gets %d pieces of pizza.%n", (slices * pizzas)/ people);
        System.out.printf("There are %d leftover pieces", (slices * pizzas) % people);
    }
}
