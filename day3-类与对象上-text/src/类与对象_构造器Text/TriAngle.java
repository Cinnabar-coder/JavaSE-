package 类与对象_构造器Text;

public class TriAngle {
	private double base;
	private double height;
	
	public  TriAngle() {
		
	}
	 public TriAngle(double B,double H)
	 {
		 base =B;
		 height = H;
	 }
	
	public double getbase() {
		return base;
	}
	public void setbase(double B){
		base = B;
	}
	
	public  double getheight() {
		return height;
	}
	public void setheight(double H){
		height = H;
	}
	
	public double area() {
		return height*base/2;
	}
}
