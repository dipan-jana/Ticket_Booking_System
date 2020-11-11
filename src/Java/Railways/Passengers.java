package Java.Railways;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Passengers {
    public static Scanner scanner = new Scanner(System.in);
    //int passengerNumber;
    ArrayList<String> fullName = new ArrayList<String>();
    int[] age;
    String startCity;
    String endCity;
    Date strDate;

    public Passengers(int passengerNumber) {
        age = new int[passengerNumber];
    }

    public  void getName(int passengerNumber) {

        System.out.println("Enter " + passengerNumber + " passenger's Full Name: ");
        for (int i = 0; i < passengerNumber; i++) {
            fullName.add(scanner.nextLine());
        }
    }

    public void getAge(int passengerNumber) {
        System.out.println();

        for (int i = 0; i < passengerNumber; i++) {

            System.out.print("Enter the Age of Passenger " + (i+1) + " : ");
            age[i] = scanner.nextInt();
            scanner.nextLine();
        }
    }

//    public void checkAge(int[] age ) {
//        for (int j : age) {
//            if (j <= 12) {
//                System.out.println("");
//
//
//          } else if (j > 12 && j <= 60) {
//
//           } else if (j > 60) {
//
//            }
//        }
//    }
    public void getStartCity() {
        System.out.print("\nEnter the Start Station: ");
        startCity = scanner.nextLine();
        //scanner.nextLine();
        System.out.print("Enter the Destination: ");
        endCity = scanner.nextLine();
        //scanner.nextLine();
    }
    public void getDate() {

        System.out.print("Enter the Travelling Date in (DD/MM/YYYY) format: ");
        String inputDate = scanner.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        try {
            strDate = formatter.parse(inputDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }


    public void printPassengerDetails(int passengerNumber) {
        for (int i = 0; i < passengerNumber; i++) {
            String name = fullName.get(i);
            int passengerAge = age[i];
            System.out.println("\nThe Details of Passenger " + (i+1) + " is: ");
            System.out.println("\tName: " + name + " , " + " Age: " + passengerAge);
            System.out.println("\tBoarding At: " + startCity + "   Destination: " + endCity );
            System.out.println("Travelling Date: " +strDate);

        }
    }
}