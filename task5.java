import java.util.ArrayList;
import java.util.Scanner;


public class main {
  
public static String palindrom(String str){
		String reverse = new StringBuffer(str).reverse().toString();
		if(str.equals(reverse)){
			return "Palindrom!";
		}
		
		return "not palindrom!";
	}

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String first = sc.nextLine();
    System.out.println(palindrom(first));
	}
}
