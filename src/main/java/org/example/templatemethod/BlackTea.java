package org.example.templatemethod;

public class BlackTea extends CafeTemplate{

    @Override
    public void boilWater() {
        System.out.println("Chilling water");
    }

    @Override
        public void brew() {
            System.out.println("Steeping the tea");
        }

        @Override
        public void addCondiments() {
            System.out.println("Adding lemon");
        }

}
