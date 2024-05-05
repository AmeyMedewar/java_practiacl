import java.io.*;
import java.util.Scanner;

class filereader3 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("/home/Desktop/daily_programs/amey.txt"));
            try {
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
            } finally {
                scanner.close();
                System.out.println("File closed");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}

