package PracticePackage;

public class starProgram {

	public static void main(String[] args)
	{
		for(int i=0;i<=4;i++) {
			for(int j=5-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) 
			{				
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("======================================");
		
		for(int a=5;a>=1;a--) {		
			for(int b=1;b<=a;b++)
			{
				System.out.print("*");
			}
			System.out.println("  ");
		}
		System.out.println("======================================");
		for(int c=0;c<=4;c++) {
			for(int d=0;d<=4;d++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("======================================");
		
		
		for(int e=0;e<=6;e++) {
			for(int f=0;f<=e;f++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
