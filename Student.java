class Student
{
    public void Details(String name,String city,int pin)
    {
        System.out.println(name);
        System.out.println("CITY : ");
        System.out.println("\t"+city);
        System.out.println("PIN  : ");
        System.out.println("\t"+pin);

    }
    public static void main(String[] args)
    {
        Student s1=new Student();
        s1.Details("RAVI RAJ GOPE", "JSR", 830001);
      
    }
}