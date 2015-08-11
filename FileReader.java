import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.io.PrintWriter;

public class FileReader {

    public static void main(String[] args) {
        
        if ( args != null && args.length>0 ){
            Path file = Paths.get(args[0]);
            try {
                
                String newFilename = getNewFilename(args[0]);
                
                PrintWriter out = new PrintWriter(newFilename);
                byte[]  bytes = Files.readAllBytes(file);
                String str = new String(bytes); 
                System.out.println("\nYour input test:\n" + str);
                
               
                str = switchVowels(str);
                out.println (str);
                out.close ();
                System.out.println("Your output text\n"+str);
                System.out.println("\nThe output text path and name is: " + newFilename);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("The file was not input");
        }
    }
    public static String getNewFilename(String s){
        String[] arr = s.split("\\.");
        return arr[0] + "_01." + arr[1];
    }
    public static String switchVowels(String s){
        String newStr ="";
        for(int i = 0; i < s.length(); i++){
          
            switch(s.charAt(i)){
                case 'a': newStr += "*";
                    break;
                case 'e': newStr += "^";
                    break;
                case 'i': newStr += "&";
                    break;
                case 'o': newStr += "$";
                    break;
                case 'u': newStr += "#";
                    break;
                case 'A': newStr += "@";
                    break;
                case 'E': newStr += "%";
                    break;
                case 'I': newStr += "+";
                    break;
                case 'O': newStr += "~";
                    break;
                case 'U': newStr += "`";
                    break;
                default: newStr += s.charAt(i);
                    break;
            }
        }
        return newStr;
    }
}