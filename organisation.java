import java.util.*;
class bonus
{
public static void main(String args[])
{
int s,fp;
double b;
Scanner c=new Scanner(System.in);
System.out.println("enter the grade of employee:");
char g=c.next().charAt(0);
System.out.println("enter the salary of employee:");
s=c.nextInt();
if (g=='A')
{
b=s*0.05;
if(s<10000)
{
b=b+(b*0.02);
System.out.println("bonus ="+b);
System.out.println("final payment="+(s+b));
}
else
{
System.out.println("bonus ="+b);
System.out.println("final payment="+(s+b));
}
}
else if (g=='B')
{
b=s*0.10;
if(s<10000)
{
b=b+(b*0.02);
System.out.println("bonus ="+b);
System.out.println("final payment="+(s+b));
}
else
{
System.out.println("bonus ="+b);
System.out.println("final payment="+(s+b));
}
}
else
{
System.out.println("invalid grade.");
}
}
}