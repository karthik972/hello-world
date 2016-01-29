package practise;

public class ReadArguments {

	public static void main(String[] args) {
		//Given command line arguments are stored as Array of String in args variable.
		System.out.println("Total number of arguments :" + args.length);
		System.out.println("Given Arguments are :");
		for(int i=0; i<args.length; i++){
			System.out.println(args[i]);
		}
	}

}
