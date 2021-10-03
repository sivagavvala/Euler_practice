class method
{
	int check_prime(int w)
	{
		for(int k=2;k<=w/2;k++)
		{
			if(w%k==0) return -1;
		}
		return w;
	}
}
class Euler50
{
	public static void main(String args[])
	{
		int e,c=0,sum=0,s=0;
		int[] prime=new int[1000];
		method ob=new method();
		for(int i=2;i<1222;i++)
		{
			e=ob.check_prime(i);
			if(e!=-1)
			prime[c++]=e;
		}
		for(int q=0;q<c;q++)
		System.out.print(prime[q]+" ");		
	}
}