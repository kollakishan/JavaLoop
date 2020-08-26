
class Random
{
	int num1;
	int num2;
	int num3;
	
	public void methodOne()
	{
		System.out.println(num1);
	}
}



public class ObjectDemo {
	
	public static void main(String[] args)
	{
		Random obj = new Random();
		
		obj.num1 = 5 ;
		obj.num2 = 1;
		obj.num3 = 4;
		
		obj.methodOne();
		
	}

}
