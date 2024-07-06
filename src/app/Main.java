package app;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        String fileName;
        String myText;
        String message = "Make your choice \uD83E\uDEF5 1, 2, 3 or Exit";
        System.out.println("Please make your choice:");
        System.out.println("1 - Create and save a file \uD83D\uDCDD");
        System.out.println("2 - Read this file \uD83D\uDCDC");
        System.out.println("3 - Delete this file ❗");
        System.out.println("Exit - For exiting \uD83D\uDD1A");
        while (true) {
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println(" ☑️ ");
                break;
            }
            try {
                choice = Integer.parseInt(input);
                if (choice == 1 ^ choice == 2 ^ choice == 3) {
                    switch (choice) {
                        case 1:
                            System.out.println(choice + " - Selected to create and write a file \uD83D\uDE00 \uD83D\uDCDD");
                            FileWriteService fws = new FileWriteService();
                            System.out.println("Input file Name:");
                            fileName = scan.nextLine();
                            System.out.println("Input my text:");
                            myText = scan.nextLine();
                            String result = fws.writeFile(fileName, myText);
                            getOutput("RESULT: " + result);
                            getOutput(message);
                            break;
                        case 2:
                            System.out.println(choice + " - Selected to read this file \uD83D\uDE00 \uD83D\uDCDC");
                            FileReadService frs = new FileReadService();
                            System.out.println("Input file Name:");
                            fileName = scan.nextLine();
                            getOutput("FILE CONTENT: ");
                            frs.readFile(fileName);
                            System.out.println();
                            getOutput(message);
                            break;
                        case 3:
                            System.out.println(choice + " - Selected to delete this file ❌");
                            FileDeleteService fds = new FileDeleteService();
                            System.out.println("Input file Name to delete:");
                            fileName = scan.nextLine();
                            String resume = fds.deleteFile(fileName);
                            getOutput("RESUME: " + resume);
                            getOutput(message);
                    }
                } else {
                    System.out.println("A number other than 1 or 2 or 3 is entered. \uD83D\uDC7D");
                    getOutput(message);
                }
            } catch (NumberFormatException e) {
                final Runnable runnable =
                        (Runnable) Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.exclamation");
                if (runnable != null) runnable.run();
                System.out.println("Error! Not a number entered! \uD83D\uDC7D");
                getOutput(message);
            }
        }
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}