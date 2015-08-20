package recursion;

public class Factorial {
	
	public int factorial(int n){
		if(n==0||n==1){
			return 1;
		}
		else
			return n*factorial(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(new Factorial().factorial(Integer.parseInt(args[0])));
	}
}
