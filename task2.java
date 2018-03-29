import java.util.ArrayList;
import java.util.Scanner;

public class main {
  static ArrayList<Integer>  mas = new ArrayList<Integer>();
		
	public static void fib(int n){
		int new_el = mas.get(mas.size()-1)+mas.get(mas.size()-2);
		if(new_el<=n){
			mas.add(new_el);
			fib(n);
		}
	}

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n){
		case 0:
			mas.add(0);
			break;
		default:
			mas.add(0);
			mas.add(1);
			mas.add(1);
			fib(n);
		}
		for(int num:mas)
			System.out.print(num+" ");
	}
}
