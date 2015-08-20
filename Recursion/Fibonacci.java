package recursion;

public class Fibonacci {
	
	static int first;
	static int second=1;
			static int sum = 0;
	public void fib(int n){
		
		if(n==0){
			//System.out.println("0");
		}
		else
		{
			
			sum = first+second;
			first=second;
			second=sum;
			System.out.print(sum+" ");
			fib(n-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.print("0 1 ");
		new Fibonacci().fib(23);
	}

}
