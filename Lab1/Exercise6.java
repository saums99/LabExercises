import java.io.*;
class Difference {
	
	public int calculateDifference(int n){

	int Sum, sum1=0, sum2=0;
	
	
	sum1=(n*(n+1)*(2*n+1))/6;
	sum2=(n*(n+1))/2;
	
	Sum=sum1-(sum2*sum2);
	
	return Sum;
}
}
public class Exercise6{

	public static void main(String[] args){

	Difference d= new Difference();
	int diff= d.calculateDifference(10);
	System.out.println("Difference:"+diff);
	}
}
	
