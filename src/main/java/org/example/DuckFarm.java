package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.example.adapter.Duck;
import org.example.adapter.DuckAdapter;
import org.example.adapter.Goose;
import org.example.adapter.Quackable;

public class DuckFarm {

    public DuckFarm() {

    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Quackable> ducks = new ArrayList<>();
        ducks.add(new Duck());
        ducks.add(new Duck());
        ducks.add(new Duck());
        ducks.add(new DuckAdapter(new Goose()));
        var stringStream = ducks.stream().map(Quackable::sayName).collect(
            Collectors.toList());

        ducks.stream().forEach(duck -> duck.quack());
    }

    private static void guho(List<Quackable> ducks) {
        for (Quackable duck : ducks) {
            duck.quack();
        }
    }

}
