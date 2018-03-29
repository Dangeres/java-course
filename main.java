import java.util.ArrayList;
import java.util.Scanner;


public class main {
	
	/* task 2 */
	static ArrayList<Integer>  mas = new ArrayList<Integer>();
		
	public static void fib(int n){
		int new_el = mas.get(mas.size()-1)+mas.get(mas.size()-2);
		if(new_el<=n){
			mas.add(new_el);
			fib(n);
		}
	}
	
	/* task 3 */
	
	public static void compare(double xy1, double xy2, double xy3, double xy4){
		
	}
	
	public static String peresechenie(double x11, double y11, double x12, double y12, double x21, double y21, double x22, double y22){
		
		return "No";
	}
	
	
	/* task 5 */
	public static String palindrom(String str){
		String reverse = new StringBuffer(str).reverse().toString();
		if(str.equals(reverse)){
			return "Palindrom!";
		}
		
		return "not palindrom!";
	}
	
	/* task 6 */
	
	public static String delete(String str){
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		for(int a =0;a<sb.length();a++){
			if(sb.charAt(a)>='0'&&sb.charAt(a)<='9'){
				if(a+1<sb.length()&&sb.charAt(a+1)=='.'){
					if(a+2<sb.length()&&sb.charAt(a+2)>='0'&&sb.charAt(a+2)<='9'){
						
					}
				}
			}
		}
		return "kl";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		switch(n){
//		case 0:
//			mas.add(0);
//			break;
//		default:
//			mas.add(0);
//			mas.add(1);
//			mas.add(1);
//			fib(n);
//		}
//		for(int num:mas)
//			System.out.print(num+" ");
		
//		System.out.println("Введите координаты отрезков в формате: х11 у11 х12 у12 х21 у21 х22 у22");
//		System.out.println(peresechenie(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble()));
		
//		String first = sc.nextLine();
//		System.out.println(palindrom(first));
		
		String str = sc.nextLine();
		delete(str);
	}

}
