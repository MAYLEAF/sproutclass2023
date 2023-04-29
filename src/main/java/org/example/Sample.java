package org.example;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.logging.Logger;
import org.example.strategy.FileLogStrategy;
import org.example.strategy.LogStrategy;
import org.example.strategy.StdoutLogStrategy;
import org.yaml.snakeyaml.Yaml;

public class Sample {

    private static LogStrategy logStrategy;

    public static void main(String[] args) {
        try {
            final BufferedInputStream fileInputStream = (BufferedInputStream) Sample.class.getClassLoader().getResourceAsStream("application.yml");

            final Yaml yaml = new Yaml();
            final Map<String, Map<String, String>> data = yaml.load(fileInputStream);
            final Map<String, String> log = data.get("log");
            final String strategy = log.get("strategy");
            if (strategy.equals("file")) {
                final String path = log.get("path");
                System.out.println("path = " + path);
                logStrategy = new FileLogStrategy(path);
            } else if (strategy.equals("stdout")) {
                logStrategy = new StdoutLogStrategy();
            }
            logStrategy.log("Hello World!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}