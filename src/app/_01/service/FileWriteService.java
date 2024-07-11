package app._01.service;

import app._01.utils.Constants;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteService {

    public String writeFile(String content, String fileName) {

        try (FileOutputStream fos =
                new FileOutputStream(Constants.BASE_PATH_REL + fileName + ".txt")){
            byte[] bytes = content.getBytes();
            fos.write(bytes, 0, bytes.length);
        } catch (IOException ex) {
            return "Exception: " + ex.getMessage();
        }
        return "> Success!";
    }
}