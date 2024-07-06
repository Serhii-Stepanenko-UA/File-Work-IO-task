package app;

import java.io.File;
//import java.io.IOException;

public class FileDeleteService {
    public String deleteFile(String fileName) {
        String r = null;
        try {
            //fileName = "fileName" + ".txt";
            String path = FilePath.getBasePath() + fileName + ".txt";
            File file = new File(path);
            // delete() повертає true, якщо файл видалено,
            // false - якщо ні
            if (file.delete()) {
                // Виведення інформації в консоль при успіху
                r = (file.getName() + " - deleted!");
            } else {
                // Виведення інформації в консоль при провалі
                r = ("File does not exist or not deleted!");
            }
            return r;
        } catch (Exception e) {
            // Виведення інформації в консоль при провалі
            return e.getMessage();
        }
    }
}