
public class NestedLoop2 {

	public static void main(String[] args)
	{
		int i=1;
		int j=1;
	int	rows =5;
		
		
		
		for(i=1;i<=rows;i++)
		{
			for(j=1; j<=i ;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
