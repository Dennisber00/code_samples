package org.example.one;

import java.util.HashSet;
import java.util.Set;

public class BasicSetQuestion {

  public static void main(String[] args) {
    Dog one = new Dog("alpha");
    Dog two = new Dog("alpha");

    Set<Dog> dogs = new HashSet<>();
    dogs.add(one);
    dogs.add(two);
    dogs.forEach(System.out::println);
  }

  private static class Dog {

    private String name;

    public Dog(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }

    @Override
    public String toString() {
      return getName() + ": " + super.toString();
    }
  }
}
