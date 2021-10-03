class DigitFact
{

int digFact(int n)
{
int k,r=0,res;
while(true)
{
k=n%10;
res=fact(k);
r=r+res;
n=n/10;
if(n==0) break;
}
return r;
}

int fact(int k)
{
int f=1;
if(k!=0)
f=k*fact(k-1);
return f;
}

}
class Euler34
{
public static void main(String args[])
{
long startTime = System.currentTimeMillis();
DigitFact df=new DigitFact();
for(int i=11;i<1000000;i++){
int r=df.digFact(i);
if(i==r)
System.out.println("digit factorials are " + r);
}
long endTime   = System.currentTimeMillis();
long totalTime = endTime - startTime;
System.out.println(totalTime);
}}


