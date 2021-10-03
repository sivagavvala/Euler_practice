class Euler48
{
	public static void main(String args[])
	{
		double sum=0;
		for(int i=1;i<=100;i++)
		{
			sum=sum+Math.pow(i,i);
		}
		System.out.println(sum);
	}
}