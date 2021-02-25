import java.io.*;
 
class Power {
 
    static boolean Number(int n)
    {
        if (n == 0)
            return false;
         
        while (n != 1)
        {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }
}
public class Exercise8{ 
   
    public static void main(String args[])
    {
	Power p= new Power();
        if (p.Number(64))
            System.out.println("Yes");
        else
            System.out.println("No");
 
    }
}