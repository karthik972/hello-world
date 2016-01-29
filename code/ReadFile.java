package practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* 
 * This example shows how to read a file using File Object and FileInputStream. 
 * We can use Buffered Reader also to read contents from file. 
 * Example for how to read file contents using buffer reader
 * and String builder is available at http://stackoverflow.com/a/4716623/3534696
 */
public class ReadFile {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			// Create a java.io.File object using relative path
			File file = new File("C:\\Users\\kyakkali\\spoj\\SPOJ\\src\\Resources\\readFile.txt");
			
			//Initialize a file input stream to read the above created file
			fis = new FileInputStream(file);
			
			System.out.println("Size of file in bytes:" + fis.available());
			int content;
			
			//Reading byte by byte and printing it to console
			while( (content = fis.read()) != -1){
				System.out.println((char) content);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if (fis != null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
