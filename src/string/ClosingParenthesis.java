package string;

import java.util.Scanner;

public class ClosingParenthesis {

	private static Scanner scanner;
	public int getClosingParen(String sentence , int openingParanIndex){
		
		int openNestedParan = 0;
		
		for(int position = openingParanIndex+1; position < sentence.length(); position++){
			
			if(sentence.charAt(position) == '('){
				openNestedParan += 1;
			}else if(sentence.charAt(position) == ')'){

				if(openNestedParan == 0){
					return position;
				}else {
					openNestedParan -= 1;
				}
			}
				
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClosingParenthesis closingParan = new ClosingParenthesis();
		scanner = new Scanner(System.in);
		System.out.println("Input the String");
		String sentence = scanner.nextLine();
		System.out.println("Input the opening paran index");
		int openingParanIndex = scanner.nextInt();
		System.out.println("Closing paran index is "+closingParan.getClosingParen(sentence, openingParanIndex));
	}

}
