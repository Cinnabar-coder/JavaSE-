package TEXT3;

public class rectangle {
	int i;
	int j;
	int cnt=0;
	public void getrectangle() {
		for(i=0;i<10;i++)
		{
			for(j=0;j<8;j++)
			{
				System.out.print("*");
				cnt++;
				if (cnt%10==0) {
					System.out.println();
				}
			}
		}
	}
	
	public int area() {
		int S=i*j;
		return S;
	}
	
}
