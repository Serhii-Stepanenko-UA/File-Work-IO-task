package app._02.viev;

import java.util.Scanner;

public class AppView {

    Scanner scanner = new Scanner(System.in);

    public String getChoice() {
        System.out.print("""
                Make a choice:
                1) Create and write in file.
                2) Read file.
                o) Close the app.
                """);
        System.out.print("Input option: ");
        return scanner.nextLine().trim();
    }

    public String[] getWriteData() {
        System.out.println("Enter you content: ");
        String content = scanner.nextLine();
        System.out.println("Enter file name: ");
        String fileName = scanner.nextLine();
        return new String[]{content, fileName};
    }

    public String getReadData() {
        System.out.print("Enter file mame: ");
        return scanner.nextLine();
    }

    public void getOutput(String output) {
        System.out.println(output);
        scanner.close();
    }
}
