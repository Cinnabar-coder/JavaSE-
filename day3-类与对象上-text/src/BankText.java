import 类与对象_Account_Customer课后题2.Account;
import 类与对象_Account_Customer课后题2.Bank;


public class BankText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank back = new Bank();
		back.addCustomer("张", "三");
										// 匿名对象
		back.getCustomer(0).setAccount(new Account(2000)); // 不设置账户直接下面存钱取钱 会导致空指针
		back.getCustomer(0).getAccount().deposit(1000);
		back.getCustomer(0).getAccount().withdraw(500);
		
		double balance = back.getCustomer(0).getAccount().getBalance();
		System.out.println("客户："+back.getCustomer(0).getFirstName()+"先生的余额为："+balance);
	}

}
