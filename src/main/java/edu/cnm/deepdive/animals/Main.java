package edu.cnm.deepdive.animals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
/*    Dog.describe();*/
    List<Canis> animals = new ArrayList<>();
    Collections.addAll(animals,
/*
        new Wolf("Buck"),
        new Dog("Rex"),
        new Wolf("Balto"),
*/
        new Dog("Fido"));

/*
    for (Canis c : animals) {
      introduce(c);
    }
    System.out.println("Shuffling...");
    Collections.shuffle(animals);
    animals.forEach(Main::introduce);
*/
  }

  private static void introduce(Canis c) {
    System.out.print(c + ": ");
    c.vocalize();
    if (c instanceof Dog) {
      ((Dog) c).doTrick();
    }
  }

}
