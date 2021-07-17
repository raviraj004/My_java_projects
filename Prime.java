import java.util.*;
public class Prime {
    public static void main(String[] args )
    {
        Scanner obj=new Scanner(System.in);
        int a=0,c=0;


        System.out.print("Enter the number = ");
        a=obj.nextInt();

        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
               c=c+1;
        }
        if(c==2)
        {
            System.out.println("prime number"); 
        }
        else
        {
            System.out.println("not prime number"); 
        }

        obj.close();
    }
    
}
