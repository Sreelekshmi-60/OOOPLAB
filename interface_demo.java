import java.util.*;

interface demoInterface
{
//compiler treat these as abstract methods
void area();
void perimeter();
default void heading(String str)
{
 System.out.println("\nArea and Perimeter of "+str);
 System.out.println("*------------------------------*\n\n");
}
}

class Circle implements demoInterface
{
float rad;

Circle(float r){
 rad=r;
 }
 
 //implementing abstract methods area() and perimeter() 
 public void area()
 {
  System.out.println("Area of Circle: "+3.14*rad*rad);
 }
 
 public void perimeter()
 {
  System.out.println("Perimeter of Circle : "+2*3.14*rad+"\n\n");
 }
} 

class Rectangle implements demoInterface
{
 int length,breadth;

Rectangle(int a,int b){

  length=a;
  breadth=b;
  
 }
 
 //implementing abstract methods area() and perimeter() 
 public void area()
 {
  System.out.println("Area of Rectangle : "+length*breadth);
 }
 
 public void perimeter()
 {
  System.out.println("Perimeter of Rectangle : "+2*(length+breadth)+"\n\n");
  
 }
} 
  
class interface_demo{
  public static void main(String args[])
   {
     Scanner inter = new Scanner(System.in);
	 System.out.println("OBJECTS\n\n1.Circle\n2.Rectangle\n\nChoose an object :");
	 int choice=inter.nextInt();
	 switch(choice)
	 {
	  case 1:
           System.out.println("Enter radius of the circle:");
           float a=inter.nextFloat();
	       //creating object of class Circle implementing interface demoInterface
	       demoInterface cir = new Circle(a);
	       cir.heading("Circle");
	       cir.area();
	       cir.perimeter();
           break;
	 case 2:
	       System.out.println("Enter length of the rectangle:");
	       int x=inter.nextInt();
	       System.out.println("Enter breadth of the rectangle:");
	       int y=inter.nextInt();
	       //creating object of class Rectangle implementing interface demoInterface
           demoInterface rect = new Rectangle(x,y);
           rect.heading("Rectangle");
           rect.area();
           rect.perimeter();
		   break;
 }
 }
} 	 