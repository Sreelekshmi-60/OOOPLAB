import java.util.*;
class Complex
{
  double real;
  double img;

void setValues(double rp, double ip)
{
    real = rp; img = ip;
}

double getReal()
{
    return real;
}
 double getImg()
{
    return img;
} 
 void setReal(double rp)
{
    real = rp;
}
void setImg(double ip)
{
    img = ip;
}
Complex add(Complex c)
{ 
    Complex sum = new Complex();
	sum.setValues(real + c.real, img + c.img);
    return sum;
}
}

class ComplexAddition
{
public static void main(String args[])
{
int r,i;	
Complex complex1, complex2, complex3;
Scanner comp = new Scanner(System.in);
System.out.println("Enter real and imaginary part of first complex number :");
r= comp.nextInt();
i=comp.nextInt();
complex1 = new Complex();
complex1.setValues(r,i);
System.out.println("Enter real and imaginary part of second complex number :");
r= comp.nextInt();
i=comp.nextInt();
complex2 = new Complex();
complex2.setValues(r,i);
complex3 = complex1.add(complex2); 

System.out.print("\n\nFirst Complex Number  =  " + complex1.getReal() + "+" + complex1.getImg() + "i");
System.out.print("\n\nSecond Complex Number  =  "+ complex2.getReal() + "+" + complex2.getImg() + "i");
System.out.print("\n\nSum of first and second complex numbers =  " + complex3.getReal() + "+" + complex3.getImg() + "i");
}
}