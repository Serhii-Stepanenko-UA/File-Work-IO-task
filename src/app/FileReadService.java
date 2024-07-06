package app;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadService {
    public String readFile(String fileName) {
        String c = null;
        FileInputStream fins;
        String path = FilePath.getBasePath() + fileName + ".txt";
        try {
            fins = new FileInputStream(path);
            int symb;
            StringBuilder stringBuilder = new StringBuilder();
            while ((symb = fins.read()) != -1) {
                stringBuilder.append((char) symb);
            }
            c = stringBuilder.toString();
            return c;
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }
}