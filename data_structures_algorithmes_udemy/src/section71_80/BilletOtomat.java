package section71_80;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class BilletOtomat {
	
	private static void prettyPrint(Map<Long, Long> map) {
		for(Entry<Long, Long> element: map.entrySet()) {
			if(element.getValue() != 0) {
				boolean isEuro = element.getKey() >= 100;
				long euroEquivalant = 0;
				String last = "";
				if(isEuro) {
					euroEquivalant = element.getKey() / 100;
					last = euroEquivalant + " euro";
				} else {
					last = element.getKey() + " centime";
				}
				System.out.printf("%-10s : %d \n", last , element.getValue() );
			}
		}
		
	}
	
	static long[] arr = {1, 	 2, 	 5,
						 10, 	 20, 	 50,
						 100,    200,    500,
						 1000,   2000,   5000};
			
	
	public static void main(String[] args) {
		prettyPrint((rendre(11).monnaie));
	}
	
	

	static Rendu rendre(double prix) { 
		
		if(prix <= 0) throw new IllegalArgumentException("Prix ne peut pas etre negatif ou zero");
		
		Rendu rendu = new Rendu();
		
		long prixInteger = (long) (prix * 100); 
		
		long temp = -1;
		while(temp != 0) {
			temp = findPlusProche(prixInteger);
			prixInteger -= temp;
			if(temp==0) break;
			rendu.monnaie.put(temp, rendu.monnaie.get(temp) + 1);
		}		
				
		return rendu;
	}
	
	static long findPlusProche(long prix) {
		return Arrays.stream(arr).filter(t -> t <= prix).max().orElseGet(() -> 0); // 20
	}
	
}

class Rendu {
	long[] arr = {1, 	 2, 	 5,
			 	  10, 	 20, 	 50,
			 	  100,   200,    500,
			 	  1000,  2000,   5000};
	
	
	Map<Long, Long> monnaie = new TreeMap<>();
	
	Rendu(){
		Arrays.stream(arr).forEach(t -> monnaie.put(t, (long) 0));
	}
	
}

/*
int centime1;
int centime2;
int centime5;
int centime10;
int centime20;
int centime50;
int euro1;
int euro2;

int euro5;
int euro10;
int euro20;
int euro50; */

/*
 
 * 0,1   0,2   0,5   0,1  - 0,9
 * 0,10  0,20  0,50  0,10 - 0,99
 * 1     2     5     1    - 9
 * 10    20    50    10   - 99
 * 
 * ===> 4,45    10    rendu 5,35

 */
