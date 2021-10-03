import java.util.*;

class FifthPower
{
ArrayList oper(int n)
{
ArrayList arr=new ArrayList();
while(n>0)
{
int p=n%10;
arr.add(p);
n=n/10;
}
return arr;
}
int powerSum(ArrayList arr)
{
int sum=0,i;
while(true)
{
for(i=0;i<arr.size();i++)
sum=sum+(int)Math.pow((int)arr.get(i),5);
if(i==arr.size()) break;
}
return sum;
}

void dis(int sum)
{
System.out.println("final sum is : "+sum);
}

}

class Euler30
{
public static void main(String args[])
{
int i,sum=0;
ArrayList arr=new ArrayList();
FifthPower fp=new FifthPower();
for(i=10;i<=100000;i++)
{
arr=fp.oper(i);
sum=fp.powerSum(arr);
if(i==sum)
fp.dis(sum);
}
}

}