package TEXT3;

public class rectangle3 {

	int i;
	int j;
	int cnt=0;
	public int method(int m,int n){
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("*");
				cnt++;
				if (cnt%m==0) {
					System.out.println();
				}
					
			}
		}
		return m*n;
	}
	

}
