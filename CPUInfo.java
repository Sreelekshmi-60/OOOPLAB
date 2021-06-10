import java.util.*;
class CPU{
  float price;
  RAM ram_obj;
  Processor proc_obj;
  CPU(float pr,int ram_mem,String ram_manufacturer,String proc_manufacturer,int cores)
  {
	  price=pr;
	  ram_obj= new RAM(ram_mem,ram_manufacturer);
	  proc_obj= new Processor(cores,proc_manufacturer);
  }
 static class RAM
 {
    String ram_manufacturer;
    int ram_mem;
	RAM(int ram_mem,String ram_manufacturer)
	{
       this.ram_manufacturer=ram_manufacturer;
       this.ram_mem=ram_mem;
	}
	void getRamData()
	{
	  System.out.println("RAM Memory :"+this.ram_mem+"GB");
      System.out.println("RAM Manufacturer :"+this.ram_manufacturer);
	}	
 }
class Processor
{
   int cores;
   String proc_manufacturer;
   Processor(int cores,String proc_manufacturer)
   {
     this.cores=cores;
     this.proc_manufacturer=proc_manufacturer;
   }
   void getProcData()
   {
	 System.out.println("Number of cores in Processor :"+this.cores);	
     System.out.println("Processor manufacturer :"+this.proc_manufacturer);  
   }   
}
void display()
{
System.out.print("\n\nCPU DETAILS\n");	
System.out.println("Price :"+price);
ram_obj.getRamData();
proc_obj.getProcData();
}
}
class CPUInfo{
 public static void main(String args[]){
   int cost,n_o_c,memory;
   String m1,m2;
   Scanner cpu= new Scanner( System.in);
   System.out.println("Enter CPU price :");
   cost=cpu.nextInt();
   System.out.println("Enter number of cores :");
   n_o_c=cpu.nextInt();
   cpu.nextLine();
   System.out.println("Enter RAM Memory in GB :");
   memory=cpu.nextInt();cpu.nextLine();
   System.out.println("Enter RAM manufacturer :");
   m1=cpu.nextLine();
   System.out.println("Enter Processor Manufacturer :");
   m2=cpu.nextLine(); 
   CPU obj= new CPU(cost,memory,m1,m2,n_o_c); 
   obj.display();
 }
}