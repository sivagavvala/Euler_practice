
class PrimeNum
{
public void truncPrime(int n)
{
while(true)
{
primeOrNot(n);
n=n/10;
if(n==0) break;
}


void primeOrNot(int m) {
	int temp;
	boolean isPrime=true;
	for(int i=2;i<=m/2;i++)
	{
	temp=n%i;
	if(temp==0)
	{
	isPrime=false;
	break;
	}
	}
	if(isPrime)
	System.out.println(n + " is Prime Number");
	else
	System.out.println(n+ " is not Prime Number");
	}
	
}

}

class Euler37
{
public static void main(String args[])
{
PrimeNum pn=new PrimeNum();
pn.truncPrime(3793);
}
}



