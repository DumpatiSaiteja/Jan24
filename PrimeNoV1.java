
public class PrimeNoV1 {

	public static void main(String[] args) {
		
		int num =29,counter=0;
		for(int i=1;i<=num;i++) {
			if(num % i == 0)counter++;
			
	    }
		if(counter==2)System.out.println("yes it is Prime");
		else System.out.println("not");

	}

}
