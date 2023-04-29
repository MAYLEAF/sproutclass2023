package org.example.templatemethod;

public class Latte extends CafeTemplate {

        @Override
        public void brew() {
            System.out.println("Dripping coffee through filter");
        }

        @Override
        public void addCondiments() {
            System.out.println("Adding sugar and milk");
        }

}
