public class PracticeConstructor {

//AccessModifier construcorname(){}

    int age=45;
    String name;
    String address;
    String stAddress;
    String stName;

    public PracticeConstructor()//1st constructor
    {
        System.out.println("the age is "+age);
    }

    public PracticeConstructor(String name)    //2nd constructor: parameterized constructor
    {
        System.out.println("the student name is "+name);
    }

    public PracticeConstructor(String name,int age)// 3rd constructor with multiple parameter
    {
        System.out.println("i am "+name+" i have "+ age+" months ");
    }

     public PracticeConstructor(String name,int age,String address)//4th constructor with multiple parameter
     {
         System.out.println("My name is "+name+" I am "+age+" i live in "+address);
     }
     public PracticeConstructor(String name,String address)
     {
         this.stName=name;
         this.stAddress=address;
         System.out.println("the stName is "+this.stName+" her address is "+this.stAddress);


     }




    public static void main(String[] args)
    {
      //  classname objectName=new constructor of class();
        PracticeConstructor obj=new PracticeConstructor();
        System.out.println("ghania meziani");
        PracticeConstructor student=new   PracticeConstructor("eileen",8 );
        PracticeConstructor friend=new PracticeConstructor("sofiane",30 ,"PA");
        PracticeConstructor multi=new PracticeConstructor("sabrina","philadelphia");

    }


}
