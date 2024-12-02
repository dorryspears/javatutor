public class Main {
  public static void main(String[] args) {
    var Strings = "test is a test";
    for (String string : Strings.split(" ")) {
      System.out.println(string.concat("hi"));
    }
  }
}
