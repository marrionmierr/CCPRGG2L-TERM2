import java.io.*;

public class FileReadFR {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        File inFile = new File("C:\\Users\\mierrmb\\Documents\\NetBeansProjects\\JavaFileHandling\\filething.txt");
        FileReader fr = new FileReader(inFile);
        
        try{
            int i;
            while((i = fr.read()) != -1){
                System.out.print((char)i);
            }
            System.out.println("");
        }
        catch (Exception e){
            System.out.println("There is an error reading the file: ");
            System.out.println(e.getMessage());
        }    
    }
    
}
