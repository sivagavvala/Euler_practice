import java.lang.*;
import java.util.*;
class meth1
{

void count(int i, int j)
{
ArrayList arr=new ArrayList();
arr.add(i);
arr.add(j);
System.out.println(arr);
}
}
class Euler39
{
public static void main(String args[])
{

int i=0,j=0,count=0,w=0;
int[] result=new int[10000];
int p=0;
meth1 obj=new meth1();	
for(i=1;i<=100;i++)
{
for(j=1;j<=100;j++)
{
p=(int)(i+j+Math.sqrt((i*i)+(j*j)));
if(result[p]==0) result[p]=1;
else result[p]+=1;
//obj.count(i,j);
}
}
int max = Integer.MIN_VALUE;
for (int q = 1; q < result.length; q++) {
    if (result[q] > max) {
      max = result[q];
      w=q;
    }
}
System.out.println("MAx solns are : "+max+"  "+w);
}

}

