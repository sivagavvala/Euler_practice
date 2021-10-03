import java.util.*;
import java.lang.*;

class DistinctPower
{
ArrayList res(){
ArrayList arr=new ArrayList();
for(int i=2;i<=100;i++)
{
for(int j=2;j<=100;j++)
{
int k=(int)Math.pow(i,j);
arr.add(k);
}
}
return arr;
}
}
class Euler29
{
public static void main(String args[])
{
DistinctPower dp=new DistinctPower();
ArrayList arr=dp.res();
System.out.println(arr);
System.out.println("count before removal:"+arr.size());

ArrayList newList = new ArrayList(new LinkedHashSet(arr));
Iterator it = newList.iterator();
while (it.hasNext()) {
System.out.print(" "+it.next());
}
System.out.println("\n");
System.out.println("count after removal :"+newList.size());
}}