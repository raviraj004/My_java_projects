public class Sumofarray {
    public static void main(String[] args )
    {
        int arr1[]={1,2,3},arr2[]={4,5,6};
        int arr3[]=new int[3];

        for (int i = 0; i < 3; i++) 
        {
            arr3[i]=arr1[i]+arr2[i];
        }

        for (int i=0;i<3;i++)
        {
            System.out.println(arr3[i]);
        }
        
    }
}
