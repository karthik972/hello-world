package practise;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class GeneratePrime {

	public static void main(String[] args) {
		System.out.println(getPrimeNumbers(100));  //Generate all prime numbers less than or equal to 100
		System.out.println(getPrimeNumbers(101,199));  // Generate all prime numbers between 101 and 199
		System.out.println(getPrimeNumbers(1000,1005)); // Range where no prime number is present
	 }	
	
	protected static List<Integer> getPrimeNumbers(int limit){
		return generatePrimeListFromBitSet(filterPrimeNumbers(limit));
	}
	
	protected static List<Integer> getPrimeNumbers(int start, int limit){
		List<Integer> primeList = generatePrimeListFromBitSet(filterPrimeNumbers(limit));
		int i=0;
		if(primeList.get(primeList.size()-1) > start){
			for(;primeList.get(i)<start;i++);
			return primeList.subList(i, primeList.size());
		}
		return new ArrayList<Integer>();
	}
	
	private static List<Integer> generatePrimeListFromBitSet(BitSet wholeList){
		List<Integer> primeList = new ArrayList<Integer>();
		primeList.add(2);
		for(int i=3; i<=wholeList.length(); i+=2){
			if(!wholeList.get(i)){
				primeList.add(i);
			}
		}
		return primeList;
	}

	private static BitSet filterPrimeNumbers(int num) {
		BitSet bs = new BitSet(num+1);
		for (int i=2; i*i<=num; i++){
			if(!bs.get(i)){
				for (int k=2*i; k<=num; k+=i){
					bs.set(k);
				}
			}
		}
		return bs;
	}

}
