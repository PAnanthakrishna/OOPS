import java.util.*;
class Shape
{
void area(int r)
{
double Area=3.14*r*r;
System.out.println("\n Area of Circle:"+Area); 
}
void area(int l,int b)
{
int Area=l*b;
System.out.println("\n Area of Rectangle:"+Area); 
}
void area(int l,int b,int h)
{
int Area=2*(l*b+b*h+h*l);
System.out.println("\n Area of Cuboid:"+Area); 
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Shape obj=new Shape();
System.out.println("\n\tArea of Recatangle"); 
System.out.println("\nEnter the length:");
int l=sc.nextInt();
System.out.println("\nEnter the Breadth:");
int l1=sc.nextInt();
obj.area(l,l1);
System.out.println("\n\tArea of Circle"); 
System.out.println("\nEnter the radius:");
int r=sc.nextInt();
obj.area(r);
System.out.println("\n\tArea of Cuboid"); 
System.out.println("\nEnter the length:");
int a=sc.nextInt();
System.out.println("\nEnter the Breadth:");
int b=sc.nextInt();  
System.out.println("\nEnter the Height:");
int c=sc.nextInt();
obj.area(a,b,c);  
}
}
