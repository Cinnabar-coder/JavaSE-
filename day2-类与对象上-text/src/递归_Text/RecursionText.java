package 递归_Text;
//例3:已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),
	//其中n是大于0的整数，求f(10)的值。
public class RecursionText {
	public static void main(String[] args) {
		RecursionText text = new RecursionText();
		int value = text.f(10);
		System.out.println(value);
	}
	public int f(int x) {
		if (x==0) {
			return 1;
		}else if(x==1){
			return 4;
		}else {
			return  2*f(x-1)+f(x-2); 
		}
	}
}
