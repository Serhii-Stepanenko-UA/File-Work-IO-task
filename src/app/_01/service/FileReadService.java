package app._01.service;

import app._01.utils.Constants;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadService {

    public String readFile(String fileName) {

        try(BufferedReader br =
                new BufferedReader(new InputStreamReader(new FileInputStream(
                        Constants.BASE_PATH_REL + fileName + ".txt")))) {
            String str;
            StringBuilder stringBuilder = new StringBuilder();
            while ((str = br.readLine()) != null) {
                stringBuilder.append(str).append("\n");
            }
            return stringBuilder.toString();
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }
}