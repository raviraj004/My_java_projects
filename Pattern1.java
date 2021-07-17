public class Pattern1 {
    public static void main(String[] args )
    {
        System.out.println(" pattern 1");
        for (int i = 1; i <=4; i++) 
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println(" pattern 2");
        for (int i= 4; i>=1 ; i--) 
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }


        
    }
    
}
