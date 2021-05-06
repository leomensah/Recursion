
public class Q2 {
	public static int fibSeries(int fib) {
		/* 
		 * Using recursion, define a method to know the nth term of a Fibonacci series.
			Nth term of Fibonacci series is
			F(n) = F(n-1)+(n-2)
			F(0) = 0
			F(1) = 1
			F(2) = F(1)+(0) = 1+0 = 1
			F(3) = F(2)+(1) = 1+1 = 2
			F(4) = F(3)+(2) = 2+1 = 3
		 */
		if(fib == 0) {
			return 0;
		} else if(fib == 1) {
			return 1;
		} else {
			return fibSeries(fib-1) + fibSeries(fib - 2);
		}
	}

	public static void main(String[] args) {
		System.out.print(fibSeries(12));
	}
}
