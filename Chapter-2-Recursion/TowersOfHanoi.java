package recursion;

public class TowersOfHanoi {
	
	
	/**
	 * Problem Statement:-
	 * 
	 * MOVE ALL THE DISKS FROM SOURCE STICK TO DESTINATION
	 * 
	 * WITHOUT EVER MOVING A BIGGER PEG ON THE SMALLER
	 * 
	 * AND ONE PEG AT A TIME
	 * 
	 * **/

	int j=0;


		   public void solve(int n, String start, String auxiliary, String end) {
		       if (n == 1) {
		           
		    	   j =j +1;
		    	   System.out.print("TIMES: "+j+" ");
		    	   System.out.println(start + " -> " + end);
		    	   
		           
		       } else {
		           solve(n - 1, start, end, auxiliary);
		           j=j+1;
		           System.out.print("TIMES: "+j+" ");
		           System.out.println(start + " -> " + end);
		           solve(n - 1, auxiliary, start, end);
		       }
		   }

		   public static void main(String[] args) {
		       TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
		       
		       towersOfHanoi.solve(5, "A", "B", "C");
		   }
		
	
}
