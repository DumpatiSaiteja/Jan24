
public class Pattern1 {

	public static void main(String[] args) {
		for(int r=1;r<=5;r++) {
			/*1
			 *1 2
			 *1 2 3
			 *1 2 3 4
			 *1 2 3 4 5
			 */
			//for(int c=1;c<=r;c++) { 
			   /*5 
                *5 4 
                *5 4 3 
                *5 4 3 2 
                *5 4 3 2 1 
               */
				for(int c=5,p=1;p<=r;c--,p++){
				//for(int c=5;c>=r;c--) {
				System.out.print(c+" ");
			}
			System.out.println();
				
		}

	}

}
