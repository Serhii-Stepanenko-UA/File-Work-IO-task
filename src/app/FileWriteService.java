package app;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteService {
    public String writeFile(String fileName, String myText) {
        String s = "Success 😀";
        try {
            String myFile = FilePath.getBasePath() + fileName + ".txt";
            FileOutputStream fous = new FileOutputStream(myFile);
            byte[] someBytes = myText.getBytes();
            fous.write(someBytes);
            fous.close();
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
            System.exit(0);
        }
        return s;
    }
}