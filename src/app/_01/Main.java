package app._01;

import app._01.service.FileDeleteService;
import app._01.service.FileReadService;
import app._01.service.FileWriteService;

import java.util.Scanner;

public class Main {

    static Scanner scanner;

    public static void main(String[] args) {
        handleChoice(getChoice());
    }

    private static String getChoice() {
        scanner = new Scanner(System.in);
        System.out.print("""
                Make a choice:
                1) Create and write in file.
                2) Read file.
                3) Delete file.
                0) Close the app.
                """);
        System.out.println("Input choice: ");
        return scanner.nextLine();
    }

    private static void handleChoice(String choice) {
        //String choice = getChoice();
        switch (choice) {
            case "1" -> getOutput(writeFile(getWriteData()));
            case "2" -> getOutput(readFile(getReadData()));
            case "3" -> getOutput(deleteFile(getDeleteData()));
            case "0" -> {
                System.out.println("App closed");
                System.exit(0);
            }
            default -> System.out.println("Wrong value " + choice);
        }
    }

    private static String[] getWriteData() {
        scanner = new Scanner(System.in);
        System.out.println("Enter you content: ");
        String content = scanner.nextLine();
        System.out.println("Enter file name: ");
        String fileName = scanner.nextLine();
        return new String[] {content, fileName};
    }

    private static String getReadData() {
        scanner = new Scanner(System.in);
        System.out.println("Enter file name: ");
        return scanner.nextLine();
    }

    private static String getDeleteData() {
        scanner = new Scanner(System.in);
        System.out.println("Enter file name: ");
        return scanner.nextLine();
    }



    private static String writeFile(String[] data) {
        return new FileWriteService().writeFile(data[0], data[1]);
    }

    private static String readFile(String fileName) {
        return new FileReadService().readFile(fileName);
    }

    private static String deleteFile(String fileName) {
        return new FileDeleteService().deleteFile(fileName);
    }

    private static void getOutput(String output) {
        System.out.println(output);
        scanner.close();
    }
}