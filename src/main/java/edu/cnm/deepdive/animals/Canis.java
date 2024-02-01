package edu.cnm.deepdive.animals;

public abstract class Canis {

  private static int helperValue = helper();


  private final String name;

  static {
    System.out.println("Canis static block");
  }

  {
    System.out.println("Canis instance initialization block");
  }

  protected Canis(String name) {
    System.out.println("Canis::<init>");
    this.name = name;
  }
  private final int instHelperValue = helper();

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

  private static int helper() {
    System.out.println("Canis::helper");
    return 0;
  }

  private static int helperValue2 = helper();

  static {
    System.out.println("second canis static block");
  }

}
