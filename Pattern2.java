public class Pattern2 {
    public static void main(String args[])   
    {    
        int i, j;       
        for (i=1; i<=4; i++)   
        {  
            for (j=3; j>=1; j--)         
            {  
                System.out.print(" ");   
            }   
            for (j=1; j<=i; j++ )   
            {   
                System.out.print(" * ");   
            }   
            System.out.println();   
        }   
    }      
}
