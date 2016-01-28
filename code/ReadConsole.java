package practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadConsole {

	public static void main(String[] args) throws IOException {
		
		//Console Input can be read through two ways, Scanner and BufferedReader. 
		//To know which one is better, go to http://stackoverflow.com/questions/2231369/scanner-vs-bufferedreader
		
		readFromScanner();
		readFromBufferedReader();
	}
	
	private static void readFromBufferedReader() throws IOException {
		//Read Standard Input stream (System.in) through InputStreamReader. System.in typically
		//corresponds to keyboard input. 
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is your name?");
		String name = bufferRead.readLine(); //BufferedReader will take the whole stream as String. 
		System.out.println("Welcome " + name);
	}

	private static void readFromScanner(){
		//Scanner is a modern way to read the console input. This will parse the input stream
		Scanner s = new Scanner(System.in);
		System.out.println("Input some data");
		//print whole line
		System.out.println(s.nextLine());
		System.out.println("Input list of integers");
		//print all integers from given input
		while(s.hasNextInt()){
			System.out.println(s.nextInt());  //no need to read the stream, parsing it to integer objects.
			                                  //Scanner will do this automatically
		}
		s.close(); //close the scanner after use, so that data leaking can be prevented.
	}

}
