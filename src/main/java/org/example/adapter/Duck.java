package org.example.adapter;

public class Duck implements Quackable{
        String name = "Duck";

        public Duck() {

        }

        @Override
        public String sayName() {
            System.out.println("My name is " + name);
        }

        //make noise
        public void quack() {
            System.out.println("Quack");
        }

}
