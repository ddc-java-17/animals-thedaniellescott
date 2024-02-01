package edu.cnm.deepdive.animals;

public class Wolf extends Canis {

  protected Wolf(String name) {
    super(name);
  }

  @Override
  public void hunt() {
    System.out.println("Hunt for live prey in packs.");
  }

  @Override
  public void vocalize() {
    describe();
    System.out.println("Howl!");
  }

  public static void describe() {
    System.out.println("Gray wolf (Canis Lupus) is a species of the Canis genus.");

  }

}
