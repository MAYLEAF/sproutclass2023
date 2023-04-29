package org.example.templatemethod;


public abstract class CafeTemplate {

    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public abstract void brew();

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public abstract void addCondiments();
}
