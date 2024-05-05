import java.io.*;

class filereader1 {
    public static void main(String[] args) {
        try {
            BufferedReader r = new BufferedReader(new FileReader("//home/Desktop/daily_programs/amey.txt"));
            try {
                int i;
                while ((i = r.read()) != -1) {
                    System.out.print((char) i);
                }
            } finally {
                r.close();
                System.out.println("File closed");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

