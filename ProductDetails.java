import java.util.*;
class product{
      int pcode;
	  String pname;
	  int price;
	  
      void getDetails(int pc,String pn,int pr)
	  {
		pcode=pc;
		pname=pn;
		price=pr;
		System.out.print("\n\nProduct Details\n\n");	
		System.out.println("Product Code : "+ pcode);
        System.out.println("Name of the Product : "+ pname);
        System.out.println("Price of the Product : Rs."+ price);
		System.out.println();
	  }
     void LowPrice(product a,product b)
	  {
          if(price<a.price && price<b.price)
		  {
            System.out.print("\n\nThe lower price is  Rs."+price);
		  }
          else
		  {
             if(a.price<price && a.price<b.price)
			 {
                System.out.print("\n\nThe lower price is  Rs."+a.price);				 
			 }
			 else
			 {
                 System.out.print("\n\nThe lower price is  Rs."+b.price+"\n  ");
			   }
		  }			   
	  }
}
class ProductDetails{
    public static void main(String[] args){
		Scanner pdt =new Scanner(System.in);
		 int code,cost;
		 String name;
		 System.out.println("Enter product name :");name=pdt.nextLine(); 
		 System.out.println("Enter product code :");code=pdt.nextInt();
		 System.out.println("Enter product price :");cost=pdt.nextInt();
		 System.out.print("\n\nDetails of Product 1");
		 product prod1 = new product();
		 prod1.getDetails(code,name,cost);
		 System.out.println("Enter product name :");
		 pdt.nextLine();name=pdt.nextLine(); 
		 System.out.println("Enter product code :");code=pdt.nextInt();
		 System.out.println("Enter product price :");cost=pdt.nextInt();
		 System.out.print("\n\nDetails of Product 2");
		 product  prod2 = new product();
		 prod2.getDetails(code,name,cost);
		 System.out.println("Enter product name :");
		 pdt.nextLine();name=pdt.nextLine(); 
		 System.out.println("Enter product code :");code=pdt.nextInt();
		 System.out.println("Enter product price :");cost=pdt.nextInt();
		 System.out.print("\n\nDetails of Product 3");
		 product prod3 = new product();
		 prod3.getDetails(code,name,cost);
		 prod3.LowPrice(prod1,prod2);
		 
		 
	}	 
}		   