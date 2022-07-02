public class test_alias_string {
	public static void main (String[] args) {
		String x =new String("ab");
		String y = x;


		y="bcd";
		System.out.println(x);
		System.out.println(y);

	}
} 