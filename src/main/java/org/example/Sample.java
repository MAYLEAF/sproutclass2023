package org.example;


import org.example.strategy.LogStrategy;
import org.example.templatemethod.BlackTea;
import org.example.templatemethod.CafeTemplate;
import org.example.templatemethod.FunctionCafeTemplate;
import org.example.templatemethod.Latte;

public class Sample {

    private static LogStrategy logStrategy;

    public static void main(String[] args) {
        final CafeTemplate latte = new Latte();
        latte.prepareRecipe();
        System.out.println("====================================");
        final CafeTemplate tea = new BlackTea();
        tea.prepareRecipe();
        System.out.println("====================================");
        final FunctionCafeTemplate redTea = new FunctionCafeTemplate(() -> {
            System.out.println("Steeping the red tea");
            return null;
        }, () -> {
            System.out.println("Adding lemon");
            return null;
        });
        redTea.prepareRecipe();


    }
}