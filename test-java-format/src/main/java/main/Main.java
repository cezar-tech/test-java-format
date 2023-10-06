package main;


public class Main {

  public static void main(String[] args) {

    System.out.println("hello world");
    String apiResponse =
        switch ("a") {
          case "videos" -> null;
          case "images" -> null;
          default -> null;
        };
  }
}
