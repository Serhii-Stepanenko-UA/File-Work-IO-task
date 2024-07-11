package app._01.service;

import app._01.utils.Constants;

import java.io.File;

public class FileDeleteService {

    public String deleteFile(String fileName) {
        String r;
        try {
            String path = Constants.BASE_PATH_REL + fileName + ".txt";
            File file = new File(path);
            if (file.delete()) {
                r = (file.getName() + " - deleted!");
            } else {
                r = ("File does not exist or not deleted!");
            }
            return r;
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }
}