package may2022;

public class May01_ReverseString {

	public static void main(String[] args) {
		
		String s = "Ashish";
		
		int a=s.length();
	System.out.println(a);
	while(a>0) {
		System.out.print(s.charAt(a-1));
		a--;
	}
	}
}
