package FilesHandling;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileOperations {

    public static void main(String[] args) {
        String fileName = "mylogfile.txt";
        
        createFile(fileName);
        writeContentsToFile(fileName, "Namaskara Karnataka!");
        appendContentsToFile(fileName, "Namaskara Bharat!");
        

        readFilePrintToConsole(fileName);
        deleteFile(fileName);
    }

    public static void createFile (String fileName)
    {
        File myfirstFile = new File(fileName); // file handle

         System.out.println("Creating a new file " + fileName);
        try {
                boolean result = myfirstFile.createNewFile();

                if (result)
                    System.out.println("file got created succesfully");
                else
                    System.out.println("File already exist");

        } catch (Exception e) {
            System.out.println("An error occured" + e.toString());
        }
    }

    public static void writeContentsToFile(String fileName, String content)
    {
        System.out.println("Writing contents to a file ");
        try 
        {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(content + "\n");            
            fileWriter.write(content + "\n");            
            fileWriter.write(content + "\n");            
            fileWriter.write(content + "\n");            
            fileWriter.write(content + "\n");                        
            fileWriter.flush();
            fileWriter.close();

        } catch (Exception ex) 
        {
            System.out.println("Got an error " + ex.toString());
        }
    }

    public static void readFilePrintToConsole(String fileName)
    {
        System.out.println("Reading contents of a file ");
        try
        {   
            String content = Files.readString(Path.of(fileName));
            System.out.println(content);
        }
        catch (Exception ex)
        {
            System.out.println("Got an error " + ex.toString());
        }
    }


    public static void appendContentsToFile(String fileName, String content)
    {
        System.out.println("Appending the contents to a file ");
        try 
        {
            FileWriter fileWriter = new FileWriter(fileName,true);
            fileWriter.write(content);                        
            fileWriter.flush();
            fileWriter.close();

        } catch (Exception ex) 
        {
            System.out.println("Got an error " + ex.toString());
        }
    }

    public static void deleteFile(String fileName)
    {
        System.out.println("Deleting the contents of a file ");
        try
        {
            File fileHandle = new File(fileName);
            fileHandle.delete();
            System.out.println("DELETED THE FILE ");

        } catch (Exception ex) 
        {
            System.out.println("Got an error " + ex.toString());
        }
    }
}