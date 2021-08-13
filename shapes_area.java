import java.util.*;
class Areas{

double area(double r)
{
  return 3.14*r*r;
 
}


double area(double a,double b)
{
	return a*b;
}
}

class shapes_area{
public static void main(String args[])
{
  int x,y,choice;
  double  a = 0 ,z;
  Scanner shape=new Scanner(System.in);
  System.out.println("\nChoose any shape\n\n1.Circle\n2.Square\n3.Rectangle\n\n");
  choice=shape.nextInt();
  Areas obj = new Areas();
  switch(choice)
  {
	  case 1:
	    System.out.println("Enter radius of the circle:");
		z=shape.nextDouble();
		a=obj.area(z);
		System.out.println("\n\nArea of circle =  "+a+"\n\n");
		break;
	  case 2:
	    System.out.println("Enter one side of the square:");
        x=shape.nextInt();
		a=obj.area(x,x);
		System.out.println("\n\nArea of square = "+a+"\n\n");
        break;
      case 3:
        System.out.println("Enter length of the rectangle:");
		x=shape.nextInt();
		System.out.println("Enter breadth of the rectangle:");
		y=shape.nextInt();
		a=obj.area(x,y);
		System.out.println("\n\nArea of rectangle = "+a+"\n\n");
        break;	  
  }
  
  
  
}
}  