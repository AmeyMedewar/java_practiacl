import java.util.LinkedList;

class Main {
  public static void main(String[] args) {
    LinkedList<String> languages = new LinkedList<>();

    languages.add("Python");
    languages.add("Java");
    languages.add("JavaScript");
    System.out.println("LinkedList: " + languages);

    String str = languages.get(0);
    System.out.println("Element at index 1: " + str);
     str = languages.get(1);
    System.out.println("Element at index 2: " + str);
     str = languages.get(2);
    System.out.println("Element at index 3: " + str);
  }
}
