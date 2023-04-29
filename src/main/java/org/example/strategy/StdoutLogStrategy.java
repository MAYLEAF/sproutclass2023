package org.example.strategy;

public class StdoutLogStrategy implements LogStrategy {

    @Override
    public void log(String msg) {
        System.out.println(msg);
    }
}
