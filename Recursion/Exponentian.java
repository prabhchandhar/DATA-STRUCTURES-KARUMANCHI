package recursion;

public class Exponentian {
	//x^m
	public int exp(int x, int m){
		if(m==1){
		return x;
		}
		else if(m==0)
		{	return 0;
		}
		else
			return x*exp(x, m-1);
	}
	
	public static void main(String[] args) {
		System.out.println(new Exponentian().exp(3, 5));
	}

}
