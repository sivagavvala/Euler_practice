
import java.lang.*;
class Concat{
public String concString(int n)
{
StringBuilder sb=new StringBuilder();
int a[]=new int[20];
for(int j=1;j<=10;j++)
{

a[j-1]=(j)*n;

}
for(int i=0;i<a.length;i++)
{
sb.append(a[i]);
if(sb.length()==9||sb.length()==8) break;
}
return sb.toString();
}
}
class Euler38
{
public static void main(String args[])
{
int a[]={9,8,7,6,5,4,3,2,1};
StringBuilder sb=new StringBuilder();
Concat c=new Concat();
for(int n=1;n<10;n++){
int p=Integer.parseInt(c.concString(n));

//System.out.println(p);

for(int i=0;i<a.length;i++)
{
sb.append(a[i]);
}
int w=Integer.parseInt(sb.toString());

if(p>w)
System.out.println(p);
//System.out.println(sb.toString());
}
}
}