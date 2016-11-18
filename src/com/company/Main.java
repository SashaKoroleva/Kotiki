package com.company;


import anml.Toys;

public class Main {

    public static void main(String[] args) {

        Toys myToys = new Toys();

        for (int i = 0; i < myToys.getListOfToys().size(); i++) {

            System.out.println("\n" + myToys.getListOfToys().get(i).getName() + " говорит: ");
            myToys.getListOfToys().get(i).makeASound();

        }


    }
}

