class Program1
{
	public static void main(String[] args)
	{
		System.out.println("This is Program1");
		int[] a={12, 34, 50};
		test(a);
		System.out.println("========Program1==============");
		test(null);	
		
	} 
	public static void test(int[] x)
	{
		System.out.println("This is test method");
	}
}