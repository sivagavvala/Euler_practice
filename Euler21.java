import java.util.*;
import java.lang.*;

class Div
{
ArrayList propDiv(int n)
{
ArrayList arr=new ArrayList();
for(int i=1;i<=n;i++)
{
if((n%i)==0)
arr.add(i);
}
return arr;
}

int sumDiv(ArrayList arr)
{
int sum=0,p=0;
for(int k=0;k<arr.size()-1;k++)
{
p=(int)(arr.get(k));
sum=sum+p;
}
return sum;
}
void finalResult(int n,int sum2,int sum)
{
if(n==sum2)
System.out.println("sum is"+(sum+sum2));
}


}

class Euler21
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter number");
int n=s.nextInt();
Div d=new Div();

ArrayList arr=d.propDiv(n);
for(int j=0;j<arr.size();j++)
System.out.println("Divisors of "+n+" are "+arr.get(j));//****or juz print it as arr.***
int sum=d.sumDiv(arr);
System.out.println("sum is :"+sum);

ArrayList arr2=d.propDiv(sum);
for(int q=0;q<arr2.size();q++)
System.out.println("Divisors of "+ sum+" are "+arr2.get(q));
int sum2=d.sumDiv(arr2);
System.out.println("sum is :"+sum2);

//if(n==sum2)
//System.out.println("sum of amicable numbers is "+(sum+sum2));
d.finalResult(n,sum2,sum);
}
}




