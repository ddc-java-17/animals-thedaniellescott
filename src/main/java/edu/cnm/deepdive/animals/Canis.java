package edu.cnm.deepdive.animals;

public abstract class Canis {

  private final String name;

  protected Canis(String name) {
    this.name = name;
  }


  public abstract void hunt();

  public void vocalize() {
    describe();
    System.out.println("Do some kind of vocalization.");
  }

  public String getName() {
    return name;
  }
public static void describe() {
  System.out.println("Canis is a genus with multiple species including wolves, dogs, coyotes, etc.");
}

  @Override
  public String toString() {
    return "%1$s[name=%2$s]".formatted(getClass().getSimpleName(), name);
  }

}
