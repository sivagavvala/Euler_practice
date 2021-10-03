import java.util.*;

class Reciprocal
{
void cycle(int n)
{
double p;
for(int z=1;z<=n;z++)
{
 p=(float)1/z;
System.out.println("1/"+z+" = "+p);
}
fracDigit(p);
}

void fracDigit(double p)
{

ArrayList arr=new ArrayList();

int k=Math.floor(p);


while(true)
{
int m=p%10;
arr.add(m);
p=p/10;
if(n==0) break;
}


}
}
class Euler26
{
public static void main(String args[])
{
Scanner s =new Scanner(System.in);
System.out.println("enter n");
int n=s.nextInt();
Reciprocal r=new Reciprocal();
r.cycle(n);
}
}
