import java.util.ArrayList;
import java.util.Scanner;


public class main {
  
public static String delete(String str){
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		for(int a = 0;a<sb.length();a++){
			if(sb.charAt(a)>='0'&&sb.charAt(a)<='9'){
				if(a+1<sb.length()&&sb.charAt(a+1)=='.'){
					if(a+2<sb.length()&&sb.charAt(a+2)>='0'&&sb.charAt(a+2)<='9'){
						sb.deleteCharAt(a+2);
						sb.deleteCharAt(a+1);
					}
				}
				sb.deleteCharAt(a);
				a--;
			}
		}
		return sb.toString();
	}

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String str = sc.nextLine();
		System.out.println(delete(str));
	}
}
