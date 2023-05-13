package org.example.adapter;

public class DuckAdapter implements Quackable {
    private String name = "Duck";

    private final Goose goose;


    public DuckAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public String sayName() {
        System.out.println("My name is " + name);
    }

    //make noise
    public void quack() {
        goose.honk();
    }
}
