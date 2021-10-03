import java.util.*;
import java.math.*;


class Res{
double fact(int n)
{
double fac=1;
if(n!=0)
fac=n*fact(n-1);
return fac;
}
double SumCount(double n)
{
double sum=0;
boolean b=true;
while(b){
double a=n%10;
sum=sum+a;
n=n/10;
if(n<10)
b=false;
}
return (sum+n);
}
}


class Euler20
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);

System.out.println("enter n");
int n=s.nextInt();
Res r=new Res();
double fac=r.fact(n);
System.out.println("Result is : "+fac);
double fs=r.SumCount(fac);
System.out.println("Final Result is : "+fs);

}}

