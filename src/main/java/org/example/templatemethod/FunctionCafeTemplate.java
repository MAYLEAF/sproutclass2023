package org.example.templatemethod;

import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionCafeTemplate {

    final Supplier<Void> brew;
    final Supplier<Void> addCondiments;

    public FunctionCafeTemplate(Supplier<Void> brew, Supplier<Void> addCondiments) {
        this.brew = brew;
        this.addCondiments = addCondiments;
    }


    public void prepareRecipe() {
        boilWater();
        brew.get();
        pourInCup();
        addCondiments.get();
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }


    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

}
