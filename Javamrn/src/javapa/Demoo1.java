package javapa;

public class Demoo1 {
	public static void main(String[] args) {
		int no=143;int sum=0;int copy=no;
		while(no!=0)
		{
			int rem=no%10;
			rem=rem*rem*rem;
			sum=rem+sum;
			no=no/10;
			
			
		}
		if(sum==copy)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
			
		}
	}

}
