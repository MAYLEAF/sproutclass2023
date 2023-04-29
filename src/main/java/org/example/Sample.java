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
import org.example.templatemethod.BlackTea;
import org.example.templatemethod.CafeTemplate;
import org.example.templatemethod.Latte;
import org.yaml.snakeyaml.Yaml;

public class Sample {

    private static LogStrategy logStrategy;

    public static void main(String[] args) {
        final CafeTemplate latte = new Latte();
        latte.prepareRecipe();
        System.out.println("====================================");
        final CafeTemplate tea = new BlackTea();
        tea.prepareRecipe();

    }
}