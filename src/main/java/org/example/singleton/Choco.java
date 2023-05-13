package org.example.singleton;

import java.util.Scanner;

public class Choco {

    private static Choco uniqueInstance;
    private static String name ;

    private Choco() {
    }

    public static Choco getInstance() {
        if (uniqueInstance == null) {
            //get input with stdin
            Scanner scanner = new Scanner(System.in);
            name = scanner.nextLine();

            uniqueInstance = new Choco();
        }

        return uniqueInstance;
    }


}
