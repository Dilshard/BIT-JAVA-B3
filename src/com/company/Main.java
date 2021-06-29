package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Please enter your NIC number? ");
        String NIC = read.nextLine();
        String selectedYear = NIC.substring(0,2);
        String selectedDayMonth = NIC.substring(2,5);
        String lastValue = NIC.substring(9,10);

        System.out.println("Year :"+selectedYear);
        System.out.println("Month & Day :"+selectedDayMonth);
        System.out.println("Voting status: "+lastValue);

    }
}
