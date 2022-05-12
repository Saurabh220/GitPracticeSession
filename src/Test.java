import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//int n=7;
		System.out.println("enter a number = ");
		Scanner sc =new Scanner(System.in);
		Integer no=sc.nextInt();
		int count =0;
		for(int i=1;i<=no;i++) {
			if(no%i==0) {
				count++;
			}
	}
		if(count==2) {
			System.out.println("prime number = " +no);
			
		}else {
			System.out.println("not a prime number =  " +no);
		}

}
}
