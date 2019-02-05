package ca.sheridancollege.week1.softwarefundamentals;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of names you want to add");
        int arrayLength = input.nextInt();

        Student[] sList = new Student[arrayLength];

        for (int i = 0; i < sList.length; i++) {
            System.out.println("Enter a name to assign to index " + i + " of the sList array. " + (sList.length - i) + " names remaining");
            sList[i] = new Student(input.next());
        }
        System.out.println("The array of objects has the following names stored; ");
        for (int i = 0; i < sList.length; i++) {
            if (i < sList.length - 1) {
                System.out.print(i + ":" +sList[i].getName() + ", ");
            } else {
                System.out.print(i + ":" +sList[i].getName()+"\n");
            }
        }

    }

}
