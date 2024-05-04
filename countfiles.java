/*count ifferent types of file formats count in a given folder*/
import java.io.File;

class FileClass{
  static int javaFilesCount;
  static int classFIleCount;
  static int images_pngCount;
  static int folderCount;
  static int otherFiles;
  
  public static void main(String Args[]){
    //Driver code to run logic
    String path="/home/amey-medewar/Desktop/java project";
    countItems(path);
    System.out.println("java files " + javaFilesCount);
    System.out.println("class files " + classFIleCount);
    System.out.println("images " + images_pngCount);
    System.out.println("other files " + otherFiles);
    System.out.println("folders " + folderCount);
    }
    
  public static void countItems(String path){
    File address = new File(path);
    
    File fileArray[]=address.listFiles(); 

    for(int i=0;i<fileArray.length;i++){
      if(fileArray[i].exists()){
        if(fileArray[i].isFile()){
          String filename=fileArray[i].toString();
          if(filename.endsWith("java")){
            javaFilesCount++;
          }
          else if(filename.endsWith("class")){
            classFIleCount++;
          }
          else if(filename.endsWith("png")){
            images_pngCount++;
          }
          else if(filename.contains(".")){
            otherFiles++;
          }            
        }
      else{
        String foldername=fileArray[i].toString();
        if(foldername.endsWith("git") || foldername.endsWith("md")){
          
        }
        else{
        folderCount++;
        countItems(foldername);
      }
      }
    }
  }
}
}
  
