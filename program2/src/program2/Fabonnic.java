package program2;
/*class Fabonnic{
	

 public static void main(String args[])
{  
	 int n1=0,n2=1,n3,i,count=15;  
	 System.out.print(n1+" "+n2);//printing 0 and 1  
	  
	 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed  
	 {  
	  n3=n1+n2;  
	  System.out.print(" "+n3);  
	  n1=n2;  
	  n2=n3;  
	 }  

	}
 }
*/

class Fabonnic{
	public static void main(String Args[])
	{ 
		int a=0, b=1,c,count=15;
		System.out.print(a+" "+b);
		
		for(c=2;c<=count;++c)
		{
			c=a+b;
		
		System.out.print(" "+c);
		a=b;
				b=c;
	}
}}


