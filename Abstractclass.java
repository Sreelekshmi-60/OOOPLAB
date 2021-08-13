import java.util.*;
abstract class Shape{  
abstract double findArea();  
}   
class Circle extends Shape{  //creating subclass Circle

float rad;

Circle(float r)
{
 rad=r;
}
double findArea(){
return 3.14*rad*rad; 
} 
} 
class Square extends Shape{ //creating subclass Square

float side;

 Square(float a)
{
 side=a;
 
}
 
double findArea(){
 return side*side;
} 
}  
class Rectangle extends Shape{  //creating subclass Rectangle

float length,breadth;

 Rectangle(float a,float b)
{
 length=a;
 breadth=b;
}
 
double findArea(){
 return length*breadth;
} 
}  
class Abstractclass{  
public static void main(String args[]){ 
Scanner abs = new Scanner(System.in);
float x,y;
Shape c,s,r;

System.out.println("Enter radius of the circle:");
x=abs.nextFloat();
Circle cir=new Circle(x); 
c=cir;
System.out.println("Area of circle : "+c.findArea()+"\n"); 

System.out.println("Enter side of square : ");
x=abs.nextFloat();
Square sq = new Square(x);
s=sq;
System.out.println("Area of square: "+s.findArea()+"\n");

System.out.println("Enter length of the rectangle:");
x=abs.nextFloat();
System.out.println("Enter breadth of the rectangle:");
y=abs.nextFloat();
Rectangle rect=new Rectangle(x,y); 
r=rect;
System.out.println("Area of rectangle : "+r.findArea());  
}  
}