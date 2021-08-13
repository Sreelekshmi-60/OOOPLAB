import java.util.*;

class circle{

float a;

circle(float r)
{
a = r;
}

void display()
{
  System.out.println("Area of circle = "+3.14*a*a);
}
}

class square extends circle
{

float a;

square(float r)
{

super(r);
a = r;

}
//overrides display in  class circle
void display()
{
  System.out.println("Area of square = "+a*a);
} 
}
class rectangle extends circle
{
float b;

rectangle(float r,float breadth)
{
super(r);
b=breadth;
}
//overrides display in  class circle
void display()
{
  System.out.println("Area of rectangle = "+a*b);
} 
}

class override{
	public static void main(String args[])
	{
		
		float x,y;
		Scanner over=new Scanner(System.in);
		
		System.out.println("Enter radius of the circle:");
		x=over.nextFloat();
		circle c = new circle(x);
		System.out.println("Enter one side of the square:");
        x=over.nextFloat();
		square sq = new square(x);
		System.out.println("Enter length of the rectangle:");
		x=over.nextFloat();
		System.out.println("Enter breadth of the rectangle:");
		y=over.nextFloat();
		rectangle r= new rectangle(x,y);
		
		c.display();
		
		sq.display();
		
		r.display();
		
	}
}	