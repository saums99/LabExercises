import java.io.*;
class Sum{

	int sum=0;
	int calculateSum(int n){
	
		for(int i=0;i<=n;i++){

		if(i%3==0 || i%5==0)
		sum=sum+i;
		}
	return sum;
	}
}
public class Exercise5{
	
	public static void main(String[] args){

	Sum s=new Sum();
	int tsum=s.calculateSum(10);
	System.out.println("Sum:"+tsum);
}
}
