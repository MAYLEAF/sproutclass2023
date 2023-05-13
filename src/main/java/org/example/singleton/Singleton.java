package org.example.singleton;

public class Singleton {
    private static Singleton uniqueInstance;
    private Choco choco;

    private Singleton(Choco choco) {
        this.choco = choco;
    }

    public static Singleton getInstance(Choco choco) {
        if (uniqueInstance == null)
            uniqueInstance = new Singleton(choco);

        return uniqueInstance;
    }
}
