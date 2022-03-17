package Utility;

import java.io.*;
import java.util.Properties;

public class config {

    public  config() throws IOException {
        FileReader fr = new FileReader(".//configuration/config.properties");
        Properties prop = new Properties();
        prop.load(fr);

    }




}
