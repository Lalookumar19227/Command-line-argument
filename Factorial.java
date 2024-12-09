class Factorial
{
	public static void main(String[] args)
	{
		int n=Integer.valueOf(args[0]);	
		System.out.println(n+"!= "+getfactorial(n));
	} 
	public static int getfactorial(int n){
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
	return fact;
	}	
}







