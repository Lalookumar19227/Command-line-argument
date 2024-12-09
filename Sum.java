class Sum
{
	public static void main(String[] args)
	{
		int sum=0;
		for(String p: args){
			for(int i=0;i<p.length();i++){
				char k=p.charAt(i);
				if(k>=48 && k<=57)
					sum=sum+(k-48);
			}
		}	
		System.out.println("Sum is: "+sum);
		
	} 
}