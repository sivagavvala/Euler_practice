import java.util.*;

class DecToBinary
{
void printBinary(int n)
{
int bin[]=new int[25];
int bin1[]=new int[25];
int bin2[]=new int[25];
int index=0,i,j;
while(n>0)
{
bin[index++]=n%2;
n=n/2;
}
for(i=index-1;i>=0;i--)
{
System.out.print(bin[i]);
bin1[i]=bin[i];
}

System.out.println("\n");

for(j=0;j<=index-1;j++)
{
System.out.print(bin[j]);
bin2[j]=bin[j];
}
boolean k=aryCompare(bin1,bin2);
System.out.println(k);
}

boolean aryCompare(int bin[],int bin1[])
{
for (int i=0; i<bin.length; i++)  
        if (bin[i] != bin1[i])
          return true;
return false;              //**************error if one return statement .why ?**********
}

}
class Euler36
{
public static void main(String args[])
{
DecToBinary db=new DecToBinary();
db.printBinary(585);
}
}