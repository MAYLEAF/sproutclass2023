package org.example;

public class Honey implements Runnable {

  public void run1() {
    System.out.println("Honey1");
  }
  @Override
  public void run() {
    System.out.println("Honey");
  }
}
