import java.util.Scanner;
abstract class Shape
{
    abstract double area();
}
class Rectangle extends Shape
{
    double area()
    {   Scanner obj=new Scanner(System.in); 
        System.out.println("Enter length:");
        double l= obj.nextDouble();   
        System.out.println("Enter breadth:");
        double b= obj.nextDouble();    
        return(l*b);
    }
}
class circle extends Rectangle
{
    double area()
    {
        Scanner obj=new Scanner(System.in); 
        System.out.println("Enter radius:");
        double r= obj.nextDouble();   
        return(3.14*r*r);
    }
}
class abstracts
{   public static void main(String args[])
    {System.out.println("CREATED BY HARSH DEVGAN");
    circle c=new circle();
    double areacircle= c.area();
    System.out.println("Area of circle :"+areacircle);
    Rectangle r=new Rectangle();
    double arearect=r.area();
    System.out.println("Area of Rectangle :"+arearect);
}
}