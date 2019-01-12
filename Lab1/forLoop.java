
public class forLoop {

	public static void main(String[] args) {
		
		int i,k,j,h;
		int n=10;
		
		for (i=0;i<=n;i++){
			 for (k=0;k<i;k++) {
				 System.out.print("#");
			 }
			 System.out.println();
		}
		
		System.out.println();
		
		for (j=0;j<n;j++) {
			for (k=1;k<j+1;k++) {
				System.out.print(" ");
			}
			for (h=n;h>j;h--) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (i=n;i>0;i--) {
			for (k=0;k<i-1;k++) {
				System.out.print(" ");
			}
			for (j=n;j>i-1;j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (j=n;j>=0;j--) {
			for (h=0;h<j;h++) {
				System.out.print("#");
			}
			 System.out.println();
		}
	}

}
