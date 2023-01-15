package 类与对象_Account_Customer课后题2;

public class Bank {
	private Customer customers[] ; // 存放多个客户数组
	private int numberOfCustomer; // 记录客户的个数
	
	public Bank(){
		customers = new Customer[10];
	}
	
	// 添加客户
	public  void addCustomer(String f,String l){
		Customer cust = new Customer(f, l);
		customers[numberOfCustomer++] = cust;
	}
	// 获取客户的个数
	public int getNumOfCustomer(){
		return numberOfCustomer;
	}
	 
	// 获取指定位置上的客户
	public Customer getCustomer(int index){
		if (index >= 0 && index < numberOfCustomer) { // 第5个客户的数组下标是4
			return customers[index];
		}
		return null;
	}
	
	
}
