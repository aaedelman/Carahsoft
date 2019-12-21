/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.nio.file.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
	
	
	
	public boolean FileExists(String filename, String directory)

        {

            File dir = new File(directory);

 

            for(File file : dir.listFiles()) {

                if (file.toString().toLowerCase() == filename) {

                    return true;
                }
            }
 

            for(File subdir : dir.list())
                
                if(subdir.isDirectory()) {
                    FileExists(subdir.toString(), filename);
                }
        return false;

        }
        
}
