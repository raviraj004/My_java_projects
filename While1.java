import java.util.*;

public class While1 {
    public static void main(String[] args )
    { 
        Scanner sc=new Scanner(System.in);
        String str1="y",str2="y";


        while(str1.equals(str2))
        {
            System.out.println("HELLO");
            System.out.println("y?n");
            str2=sc.next();                
        }
        sc.close();
    }
    
}
