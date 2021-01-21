public class Burger {
    String burgerName="nameOfBurger";
    String burgerTopping="topping";


    public Burger(String nameOfBurger,char size,String topping)//1st constructor
    {   String burgerName=this.nameOfBurger=nameOfBurger;
         char burgerSize=this.size=size;
         String burgerTopping=this.topping=topping;
        System.out.println("burgerName is "+burgerName+" burgerSize "+burgerSize+" burgerTopping "+burgerTopping);
    }




    public static void main(String[] args) {
        //Burger myBurger=new Burger();
       //Burger yourBurger=new Burger();
        Burger order=new Burger("dominos "+'l'+34);

    }



}
