import java.util.*;
class person{
String name,gender,address;
int age;

//adding personal details

public person(String n,int a,String g,String addr)
{
name=n;
age=a;
gender=g;
address=addr;
}
}
//inheriting class employee from class person

class employee extends person{
int empid,salary;
String company_name,qualification;
public employee(String n,int a,String g,String addr,int id,String cname,String qualify,int wages)
{
super(n,a,g,addr);//access variables of super class person
//adding employee details

empid=id;
company_name=cname;
qualification=qualify;
salary=wages;
}
}
//inheriting class teacher from class employee
class teacher extends employee{
String subject,department;
int teacherid;

public teacher(String n,int a,String g,String addr,int id,String cname,String qualify,int wages,String sub,String dept,int tid)
{
super(n,a,g,addr,id,cname,qualify,wages);//access variables of super class employee
//adding details of teachers	
subject=sub;
department=dept;
teacherid=tid;
}
void display()
{
System.out.println("\n\nTEACHER'S DETAILS\n\n");
System.out.print("Name : "+name+"\nAge : "+age+"\nGender : "+gender+"\nAddress : "+address);
System.out.print("\nEmp id : "+empid+"\nCompany name : "+company_name+"\nQualification : "+qualification+"\nSalary: "+salary);
System.out.print("\nTeacher ID :"+teacherid+"\nSubject :"+subject+"\nDepartment :"+department+"\n");
}
}

class inheritance{
	public static void main(String args[]){
	String a,b,c,d,e,f,g;
    int p,q,r,s,t,n,i;
    teacher obj[] = new teacher[15];	
	Scanner inherit=new Scanner(System.in);
	System.out.println("Total number of people : ");
	n=inherit.nextInt();
	for(i=0;i<n;i++)
    {		
	System.out.println("\n\nCOLLECTING DETAILS");
	System.out.println("Enter Name: ");
	a=inherit.next();
	System.out.println("Enter Age ");
	p=inherit.nextInt();
	System.out.println("Enter Gender : ");
	b=inherit.next();
	System.out.println("Enter Address: ");
	c=inherit.next();
	inherit.nextLine();
	System.out.println("Enter Employee ID: ");
	q=inherit.nextInt();
	System.out.println("Enter Company name: ");
	d=inherit.next();
	System.out.println("Enter Qualification: ");
	e=inherit.next();
	System.out.println("Enter Salary: ");
	r=inherit.nextInt();
	System.out.println("Enter Teacher ID: ");
	s=inherit.nextInt();
	System.out.println("Enter Subject: ");
	f=inherit.next();
	System.out.println("Enter Department: ");
	g=inherit.next();
	obj[i]=new teacher(a,p,b,c,q,d,e,r,f,g,s);
	}
	for(i=0;i<n;i++)
	{
		obj[i].display();
	}
 }
}
	
	
	
	