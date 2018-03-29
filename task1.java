import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean mas[] = new boolean[n+1];
		
		for(int a=2;a<=n;a++){
			int k = 2;
			while(a*k<=n){
				mas[a*k]=true;
				k++;
			}
		}
		
		for(int a=2;a<=n;a++){
			if(!mas[a]){
				System.out.println(a);
			}
		}
	}

}
