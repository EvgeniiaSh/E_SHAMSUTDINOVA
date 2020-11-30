/* Write to a file from the console / output a file to the console
1. Read the file name from the console.
2. Read the lines from the console until the user enters the "exit" line.
3. Adding rows to the file.
4. Print lines from the file to the console.
*/
        
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteFile {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String fileNameIn = args[0]; 
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(fileNameIn);
        FileOutputStream output = new FileOutputStream(fileNameIn, true);
                
        
        while (true)
        {
            String data = reader.readLine();
            if(data.equals("exit")){
                break;
            }
            else {
                output.write((data +"\r\n").getBytes());
            }
            
        byte[] date = new byte[input.available()];
        input.read(date); 
       
        String text = new String(date);
        System.out.println(text);   
        }
        output.close();
        reader.close();
    }    

}