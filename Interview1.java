
public class Interview1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a function that finds if a given string is a palindrome
		// ex: racecar
		String s = "a";
		isPalindrome(s);
		
	}
	public static void isPalindrome(String s) {
		
		int count = 0;
		for(int i = 0; i < s.length()/2;i++) {
			if(s.charAt(i)==s.charAt(s.length()-1-i)) {
				count++;
			}
		}
		
		if(count==s.length()/2) {
			System.out.println(s+" is a palindrome");
		}else {
			System.out.println(s+ " is not a palindrome");
		}
		
		
	}

}
