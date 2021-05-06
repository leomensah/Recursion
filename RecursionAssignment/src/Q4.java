/*Write a recursive program to efficiently reverse a given string. For example:
* Google Drive
* evirD elgooG
*/
public class Q4 {
	public static void reverseString(String s) {
		if(s == null) {
			return;
		}
		if(s.length() == 1) {
			System.out.print(s);
		} else {
			System.out.print(s.charAt(s.length()-1));
			reverseString(s.substring(0, (s.length()-1)));
		}
		
	}
	public static void main(String[] args) {
		reverseString("Google Drive");
	}
}
