package 类与对象_封装性;

public class Order {
	int Orderdefault;
	private int Orderprivate;
	public int Orderpublic;
	
	void defaultMethod()
	{
		Orderdefault=1;
		Orderprivate=2;
		Orderpublic=3;
	}
	
	private void privateMethod(){
		Orderdefault=1;
		Orderprivate=2;
		Orderpublic=3;
	}
	
	public void publicMethod(){
		Orderdefault=1;
		Orderprivate=2;
		Orderpublic=3;
	}
}
