class Rectarea
 {
    float length;
	float breadth;
 
  void setData(float x,float y)
  {
     length=x;
	 breadth=y;
   }
   float  getArea()
   {
      return length*breadth;
	 }
}
class Rectangle 
{
public static void main(String args[]) 
{
  Rectarea R1=new Rectarea();
  R1.setData(12.4f,13f);
  float area1=R1.getArea();
  Rectarea R2=new Rectarea();
  R2.setData(10.5f,9f);
  float area2=R2.getArea();
  Rectarea R3=new Rectarea();
  R3.setData(13f,14f);
  float area3=R3.getArea();
  System.out.println("\nArea of rectangle R1 = "+area1);
  System.out.println("\nArea of rectangle R2 = "+area2);
  System.out.println("\nArea of rectangle R3 = "+area3);
 }
 }