package dev.tanto;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Prop {
    public static String getFilename() {
        try {
            return tryGetFilename();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return "";
        }

    }
    private static String tryGetFilename() throws IOException {
        Properties pro = new Properties();
        String configFilename = "Program.config";
        InputStream inputStream = new FileInputStream(configFilename);
        pro.load(inputStream);
        return pro.getProperty("Filename");
    }

}
