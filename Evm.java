import java.util.*;
public class Evm{

    public void display()
    {
        Scanner sc=new Scanner(System.in);
        String pname[]=new String[3];
        int pvote[]=new int[3];
        String city;
        int total=0,avg=0;

        System.out.print("enter the name of the City = ");
        city=sc.next();

        for(int i=0;i<3;i++)
        {
            System.out.print("enter the name of the partys "+(i+1)+"=> ");
            pname[i]=sc.next();
        }
    
        for(int i=0;i<3;i++)
        {
            System.out.print("\nenter the votes of the party "+(i+1)+" => ");
            pvote[i]=sc.nextInt();
        }

        int n=3;
        
        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < n-i-1; j++)
            {
                if (pvote[j] < pvote[j+1])
                {
                    String temp = pname[j];
                    pname[j] = pname[j+1];
                    pname[j+1] = temp;

                    int temp1 = pvote[j];
                    pvote[j] = pvote[j+1];
                    pvote[j+1] = temp1;
                }

            }
        }

        for(int i=0;i<3;i++)
        {
           total+=pvote[i];
        }

        avg=total/3;

        System.out.println("\nAVG of Evm is "+city+" = "+avg);
        System.out.println("List of party names in descending order of votes :");
        for(int i=0;i<3;i++)
        {
           System.out.println(pname[i]);
        }
        System.out.println(pname[0]+" won election in "+city);


    }

    public static void main(String[] args)
    {
        Evm obj[]=new Evm[5];

        for(int i=0;i<5;i++)
        {
            obj[i].display();
        }      

    }
    
}
