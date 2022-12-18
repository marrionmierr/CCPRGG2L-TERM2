import java.util.Scanner;
import java.io.File;
//import java.io.*;
import java.io.FileNotFoundException;

public class FileRead {
        public static void main(String[] args) throws FileNotFoundException {
            File inputFile = new File("C:\\Users\\mierrmb\\Documents\\NetBeansProjects\\JavaFileHandling\\input.txt");
            Scanner inFile = new Scanner(inputFile);
            
            try{
                while(inFile.hasNextLine()){
                    System.out.println(inFile.nextLine());
                }
                System.out.println("");
            }
            catch(Exception e) {
                System.out.println("An error has occured" + e.getMessage());
        
            }
        }
     
}
