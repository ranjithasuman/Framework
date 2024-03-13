package javapa;

public class Demoo2 {
	public static void main(String[] args) {
		int no = 20;
		boolean flag=false;
		for(int i=2;i<20;i++)
		{
			if(no%i==0)
			{
				flag=true;
				break;
				
			}
		}
		if(flag=true)
		{
			System.out.println("prime no "+no);
			
		}
		else
		{
			System.out.println("it is not"+no);
		}
	}

}
