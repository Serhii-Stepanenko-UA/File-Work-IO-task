package app;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadService {
    public void readFile(String fileName) {
        //String c = null;
        String path = FilePath.getBasePath() + fileName + ".txt";
        FileInputStream fins;
        try {
            fins = new FileInputStream(path);
            int symb;
            //StringBuilder stringBuilder = new StringBuilder();
            while ((symb = fins.read()) != -1) {
                //stringBuilder.append((char) symb);
                System.out.print((char) symb);
            } fins.close();
            //c = stringBuilder.toString();
            //return c;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            //return ex.getMessage();
        }
    }
}