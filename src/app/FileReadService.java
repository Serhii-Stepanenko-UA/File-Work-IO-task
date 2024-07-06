package app;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadService {
    public void readFile(String fileName) {
        String path = FilePath.getBasePath() + fileName + ".txt";
        FileInputStream fins;
        try {
            fins = new FileInputStream(path);
            int symb;
            while ((symb = fins.read()) != -1) {
                System.out.print((char) symb);
            } fins.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
    }
}