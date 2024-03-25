
import java.util.LinkedList;
import java.util.Queue;
 
 class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
 
        
        queue.add("a");
        queue.add("b");
        queue.add("c");
 
     
        System.out.println("Queue: " + queue);
 
       
        String front = queue.remove();
        System.out.println("Removed: " + front);
 
      
        System.out.println("Queue: " + queue);
        queue.add("d");
        System.out.println("added: " + "d");
        String peeked = queue.peek();
        System.out.println("Peeked: " + peeked);
 
        System.out.println("Queue: " + queue);
    }
}

