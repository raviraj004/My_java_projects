import java.util.*;

public class Input5 {
    public static void main(String[] args )
    {
        Scanner sc =new Scanner(System.in);
        int a[]=new int[5];
        int  data;
        int sum=0,avg=0;

        System.out.println("Enter the marks of 5 marks ");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Enter 1:MATHS 2:ENG 3:PHY 4:CHEM 5:CSE ");
        data=sc.nextInt();
        System.out.println("marks = "+a[data-1]);

        //System.out.println("calulating avg....");
        for(int i=0;i<5;i++)
        {
            sum=sum+a[i];
        }
        avg=sum/5;
        System.out.println("AVG = "+avg);

        sc.close();
    }
    
}
