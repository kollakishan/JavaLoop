
public class TryingConstructor {
	
	public TryingConstructor()
	{
		int i =1;
		int q =4;
		
	}
	
	public TryingConstructor( int y, int z)
	
	{
		j = y;
		i = z;
		
	}
	
	public TryingConstructor(double x)
	{

	}
	
	public static void main()
	{
		TryingConstructor obj = new TryingConstructor();
		
		System.out.println(obj.i);
		
	}

}
