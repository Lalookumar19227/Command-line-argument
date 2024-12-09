class Sum1
{
	public static void main(String[] args)
	{
		int sum=0;
		for(String p: args){
			sum=sum+getSum(p);
		}	
		System.out.println("Sum is: "+sum);	
	} 
	public static int getSum(String s){
		int sum=0;
		for(int i=0;i<s.length();i++){
			char k=s.charAt(i);
			if(k>=48 && k<=57)
				sum=sum+k-48;
		}
	return sum;
	}	
}







