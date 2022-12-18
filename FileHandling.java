import java.io.*;
import java.io.File;
import java.util.Scanner;


public class FileHandling {
    public static void main(String[] args) throws FileNotFoundException {
        // Declaration for file
        File inputFile = new File("C:\\Users\\dalalt\\Documents\\NetBeansProjects\\JavaFileHandling\\input.txt");
        Scanner inFile = new Scanner(inputFile);
       
        try{
           while(inFile.hasNextLine()){
            System.out.println(inFile.nextLine());
        }
        System.out.println("");
        }
        catch(Exception e){
            System.out.println("An error has occured: "+ e.getMessage());
        }
        finally{
            inFile.close();
        }
        
    }
    
}
