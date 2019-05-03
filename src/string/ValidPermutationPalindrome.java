package string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ValidPermutationPalindrome {

	public boolean hasPermutationPalindrome(String theString)
	{
		if(theString == null || theString.length()<=0)
			return false;
		
		Set<Character> unpairedCharacters = new HashSet<Character>();
		for(char c : theString.toCharArray())
		{
			if(unpairedCharacters.contains(c)){
				unpairedCharacters.remove(c);
			}else{
				unpairedCharacters.add(c);
			}
		}
		return unpairedCharacters.size()<=1;
	}
	
	public static void main(String[] args) {

		ValidPermutationPalindrome permutationTest = new ValidPermutationPalindrome();
		System.out.println("Enter the string to test for permutation palindrome");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println("Is any permutation of input stirng is valid palindrome "+permutationTest.hasPermutationPalindrome(str));
	}

}
