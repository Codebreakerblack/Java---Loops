package dev.mariel.javaloop.app;

import dev.mariel.javaloop.service.MultiplicationTable;

public class AppMultiplicationTable {

    public AppMultiplicationTable(MultiplicationTable multiplicationTable){}

    public static void main(String[] args) {

        MultiplicationTable table = new MultiplicationTable();

        int number = 5;
        String multiplicationTable = table.getMultiplicationTable(number);

        System.out.println(multiplicationTable);        

    }

}
