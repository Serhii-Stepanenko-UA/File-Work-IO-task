package app;

import java.io.File;
//import java.io.IOException;

public class FileDeleteService {
    public String deleteFile(String fileName) {
        String r;
        try {
            String path = FilePath.getBasePath() + fileName + ".txt";
            File file = new File(path);
            if (file.delete()) {
                r = (file.getName() + " - deleted!");
            } else {
                r = ("File does not exist or not deleted!");
            }
            return r;
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}