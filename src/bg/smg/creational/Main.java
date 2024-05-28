package bg.smg.creational;

import bg.smg.creational.Singleton;

public class Main {

    public static void main(String[] args) {
        Singleton.getInstance().doSomething();
        Singleton.getInstance().doSomething();
        Singleton.getInstance().doSomething();
    }
}
