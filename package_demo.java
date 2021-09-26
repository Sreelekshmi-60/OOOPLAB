//importing Package Graphics
import Graphics.rectangle_fig;
import Graphics.circle_fig;
import Graphics.square_fig;
import Graphics.triangle_fig;
import java.util.*;
import java.io.*;
public class package_demo
{
    public static void main(String[] args)
    {
      int ch;

        rectangle_fig rect = new rectangle_fig();
          circle_fig cir = new circle_fig();
          square_fig sqr =new square_fig();
              triangle_fig tri =new triangle_fig();
          do
          {
            System.out.println("Enter your choice");
            System.out.println("1. Rectangle ");
         System.out.println("2. Square ");
          System.out.println("3. Circle");
         System.out.println("4.Triangle");
          Scanner sc = new Scanner(System.in);
          ch=sc.nextInt();

          switch(ch)
          {
            case 1:
                   rectarea();
                   break;
                   case 2:
                          sqr.area();
                          break;



                          case 3:
                                 cir.area();
                                 break;
                                 case 4:
                                        tri.area();
                                        break;

                                        default: System.out.println("WRONG CHOICE");
                                        break;
          }}
          while(a<=4);


    }
}
