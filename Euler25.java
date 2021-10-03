import java.util.*;
class Fib
{
ArrayList fib(int n)
{
ArrayList arr=new ArrayList();
int a=-1,b=1;
int c;

for(int i=0;i<=n;i++)
{
c=a+b;
arr.add(c);
a=b;
b=c;
}
return arr;
}
int countDigit(int n)
{
ArrayList ary=new ArrayList();
while(true)
{
int m=n%10;
ary.add(m);
n=n/10;
if(n==0) break;
}
return ary.size();

}

}
class Euler25
{
public static void main(String args[])throws Exception
{
int count=0,w=0;
Scanner s=new Scanner(System.in);
System.out.println("enter n");
int n=s.nextInt();
Fib f=new Fib();
ArrayList arr=f.fib(n);
for(int j=0;j<arr.size();j++)
System.out.println("Fib series:"+arr.get(j));
for(int k=0;k<arr.size();k++)
{
w=(int)arr.get(k);
count =f.countDigit(w);
	if(count==8){
System.out.println("Index with "+count+" digits is : "+arr.indexOf(w));
break;}
}

}
}
//-------------------------------------------------------------------------------------------
//Complete this by getting index of 1000 digit number.(put count==1000)
//-------------------------------------------------------------------------------------------




