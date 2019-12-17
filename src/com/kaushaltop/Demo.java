package com.kaushaltop;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {

    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("New Delhi");
        placesToVisit.add("Agra");
        placesToVisit.add("Hydrabad");
        placesToVisit.add("Bangalore");
        placesToVisit.add("Chennai");
        placesToVisit.add("Mumbai");

        printPlaces(placesToVisit);

        placesToVisit.add(4, "Belgaum");
        printPlaces(placesToVisit);

        placesToVisit.remove(5);
        printPlaces(placesToVisit);
    }

    private static void printPlaces(LinkedList<String> linkedList) {

        //Is similar to for loop in arrays
        Iterator<String> i = linkedList.iterator();

        //Is there a next, it will loop until all next are finished
        while (i.hasNext()) {

            System.out.println("Now visiting "+i.next());//i.next() is next item

        }
        System.out.println("*************************");

    }
}
