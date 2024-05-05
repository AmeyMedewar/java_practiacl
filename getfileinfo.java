import java.io.*;

class getfileinfo {
    public static void main(String[] args) {
        File f = new File("/home/Desktop/daily_programs/amey.txt");
        if (f.exists()) {
            System.out.println("File name:" + f.getName());
            System.out.println("File location:" + f.getAbsolutePath());
            System.out.println("File writable:" + f.canWrite());
            System.out.println("File readable:" + f.canRead());
            System.out.println("File size:" + f.length());
            //System.out.println("File delete:" + f.delete());
        } else {
            System.out.println("File does not exist");
        }
    }
}

