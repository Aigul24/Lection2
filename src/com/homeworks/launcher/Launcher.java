package com.homeworks.launcher;

import com.epam.spb.lection2.*;

import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] classnames = {
                "ArgumentsExample",
                "AutoPack",
                "BigExample",
                "BitOperations",
                "CharsTest",
                "ClassExample",
                "CoverClasses",
                "DataTypes",
                "Import",
                "InstanceOf",
                "LogicOperations",
                "Main",
                "Operators",
                "StringTransformation",
                "UnaryOperators"
        };
        for (int a = 0; a < classnames.length; a++) {
            System.out.println((a + 1) + " - " + classnames[a]);
        }
        System.out.println("quit - for exit");
        System.out.println();
        System.out.println("Input number from 1 to 15");
        String input = scanner.nextLine();
        switch (input) {
            case "1":
                ArgumentsExample.main(args);
                break;
            case "2":
                AutoPack.main(args);
                break;
            case "3":
                BigExample.main(args);
                break;
            case "4":
                BitOperations.main(args);
                break;
            case "5":
                CharsTest.main(args);
                break;
            case "6":
                ClassExample.main(args);
                break;
            case "7":
                CoverClasses.main(args);
                break;
            case "8":
                DataTypes.main(args);
                break;
            case "9":
                Import.main(args);
                break;
            case "10":
                InstanceOf.main(args);
                break;
            case "11":
                LogicOperations.main(args);
                break;
            case "12":
                Main.main(args);
                break;
            case "13":
                Operators.main(args);
                break;
            case "14":
                StringTransformation.main(args);
                break;
            case "15":
                UnaryOperators.main(args);
                break;
            case "quit":
                System.out.println("Exit...");
                break;
            default:
                System.out.println("Type wrong number");
        }
    }
}
