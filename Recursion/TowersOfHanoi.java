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

		   public static void main(String[] args) {
		       TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
		       
		       towersOfHanoi.towersOfHanoi(3, "A", "C", "B");
		   }
		
	public void towersOfHanoi(int count, String source, String destination, String spare){
		if(count==1){
			System.out.println(source+"--->"+destination);
		}
		else{
			towersOfHanoi(count -1, source, spare, destination);
			towersOfHanoi(1, source, destination, spare);
			towersOfHanoi(count -1 , spare, destination, source);
		}
	}
}
