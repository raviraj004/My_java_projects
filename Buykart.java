import java.util.*;

public class Buykart {



    public void Welcome(String gname[],int grating[],int gprice[],String review[])
    {
        System.out.println("***Welcome to BUYKART***");
        for(int i=0;i<5;i++)
        {
            System.out.println("\t"+gname[i]);
            System.out.println("RATING : "+grating[i]+"\t PRICE : "+gprice[i]);
            System.out.println("REVIEW : "+review[i]+"\n");

        }
    }




    public void Filter(String gname[],int grating[],int gprice[],String review[])
    {
        Scanner obj=new Scanner(System.in);
        String str1="y",str2="y";
        
        while(str1.equalsIgnoreCase(str2))
        {
            System.out.print("Filters =>Press 1:Price  2:Review ");
            Scanner fil =new Scanner(System.in);
            int ch=fil.nextInt();
            if(ch==1)
            {
                System.out.println("Choose your Price Filter options");
                System.out.println("Press 1::6000-1000  2::11000-14000 => ");
                int ch2=fil.nextInt();
                if(ch2==1)
                {
                    int cc=0;
                    for(int a:gprice)
                    {
                        if(a<=10000 && a>=6000)
                        {
                            System.out.println("\t"+gname[cc]);
                            System.out.println("RATING : "+grating[cc]+"\t PRICE : "+gprice[cc]);
                            System.out.println("REVIEW : "+review[cc]+"\n");
                        }  
                        cc=cc+1;
                    } 
    
                }
                else if(ch2==2)
                {
                    int cc=0;
                    for(int a:gprice)
                    {
                        if(a<=14000 && a>10000)
                        {
                            System.out.println("\t"+gname[cc]);
                            System.out.println("RATING : "+grating[cc]+"\t PRICE : "+gprice[cc]);
                            System.out.println("REVIEW : "+review[cc]+"\n");
                        }  
                        cc=cc+1;
                    } 
    
                }
                else 
                {
                    System.out.println("Invalid Input ....PLz Read The Instructions Carefully");
                }
            }
            
            else if(ch==2)
            {
                System.out.println("Choose your Review Filter options");
                System.out.print("Press 1::GOOD  2::NICE  3::BEAUTIFUL => ");
                int ch2=fil.nextInt();
                if(ch2==1)
                {
                    int cc=0;
                    for(String a:review)
                    {
                        if(a.equalsIgnoreCase("good"))
                        {
                            System.out.println("\t"+gname[cc]);
                            System.out.println("RATING : "+grating[cc]+"\t PRICE : "+gprice[cc]);
                            System.out.println("REVIEW : "+review[cc]+"\n");
                        }  
                        cc=cc+1;
                    } 
                }
                else if(ch2==2)
                {
                    int cc=0;
                    for(String a:review)
                    {
                        if(a.equalsIgnoreCase("nice"))
                        {
                            System.out.println("\t"+gname[cc]);
                            System.out.println("RATING : "+grating[cc]+"\t PRICE : "+gprice[cc]);
                            System.out.println("REVIEW : "+review[cc]+"\n");
                        }  
                        cc=cc+1;
                    } 
                }
                else if(ch2==3)
                {
                    int cc=0;
                    for(String a:review)
                    {
                        if(a.equalsIgnoreCase("beautiful"))
                        {
                            System.out.println("\t"+gname[cc]);
                            System.out.println("RATING : "+grating[cc]+"\t PRICE : "+gprice[cc]);
                            System.out.println("REVIEW : "+review[cc]+"\n");
                        }  
                        cc=cc+1;
                    } 
                }
                else 
                {
                    System.out.println("Invalid Input ....PLz Read The Instructions Carefully");
                }
    
            }
            else
            {
                System.out.println("Invalid Input ....PLz Read The Instructions Carefully");
            }
            
            
            System.out.print("Press 'Y' to continue filtering 'N' to stop:= ");
            str2=obj.next();
            //fil.close();
        }
        
        obj.close();
    }

    public static void main(String[] args)
    {
        String gname[]={"guitar111","guitar222","guitar333","guitar444","guitar555"};
        int grating[]={5,4,5,5,5};
        int gprice[]={6000,8000,10000,12000,14000};
        String review[]={"good","beautiful","nice","bad","good"};

        Buykart by=new Buykart();

        by.Welcome(gname, grating, gprice,review);

        by.Filter(gname, grating, gprice,review);
    }
    
}
