
public class Q1 {
	
	public static int recursProd(int x) {
		if(x == 0) {
			return 0;
		}
		else {
			int y = 15 + recursProd(x-1);
			System.out.println(y);
			return y;
		}
	}

	public static void main(String[] args) {
		/* Print the multiplication table of 15 using recursion. */
		//System.out.println(recursProd(5));
		recursProd(15);

	}

}
