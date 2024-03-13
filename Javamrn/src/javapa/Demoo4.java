package javapa;

public class Demoo4 {
	public static void main(String[] args) {
		int no=13;
		boolean flag=true;
		for(int i = 2;i<13;i++)
		{

			
				if(no%2==0)
				{
					flag=false;
					break;
				}
				
				}
			if(flag==true)
			{
				System.out.println(no +"is a prime no");
			}
			else
			{
				System.out.println(no+"is not a prime no");
				
		}
	
	}

}
