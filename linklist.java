import java.util.LinkedList;

class Main {
  public static void main(String[] args){
    
    LinkedList<String> animals = new LinkedList<>();  
    animals.add("a");//add directly
    animals.add("b");
    animals.add("c");
    System.out.println("LinkedList: " + animals);
    animals.add(1, "d");//with index
    System.out.println("Updated LL: " + animals);
  }
}
