package app._02.model;

import app._02.utils.Constants;

import java.io.*;

public class AppModel {

    public String writeFile(String[] data) {

        String content = data[0];
        String fileName = data[1];

        try (FileOutputStream fos =
                     new FileOutputStream(Constants.BASE_PATH_REL + fileName + ".txt")) {
            byte[] bytes = content.getBytes();
            fos.write(bytes, 0, bytes.length);
        } catch (IOException ex) {
            return ex.getMessage();
        }
        return "> Success!";
    }

    public String readFile(String fileName) {
        try (BufferedReader br =
                     new BufferedReader(new InputStreamReader(new FileInputStream(
                             Constants.BASE_PATH_REL + fileName + ".txt")))) {
            String str;
            StringBuilder stringBuilder = new StringBuilder();
            while ((str = br.readLine()) != null) {
                stringBuilder.append(str).append("\n");
            }
            return stringBuilder.toString();
        } catch (IOException ex) {
            return "> " + ex.getMessage();
        }
    }
}
