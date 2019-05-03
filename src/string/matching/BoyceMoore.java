package string.matching;

import java.util.Arrays;

import util.array.ArrayUtil;

public class BoyceMoore {

private String text;
	
	public void setText(String text){this.text = text; }
	public String getText(){return text;}
	int table[] = new int[128];
	
	public void buildTable(String pattern){
		Arrays.fill(table, pattern.length());
		int len = pattern.length();
		for(int i = 0; i< len-1; i++){ // for last char shift= pattern length if it is not present in patter except last char 
			table[(int)pattern.charAt(i)] = len -1 -i;
		}
		ArrayUtil.printIntArray(table);
	}
	public int firstIndex(String pattern){
		int textLen = text.length();
		int patternLen = pattern.length();
		for(int i=0; i<= textLen - patternLen;  ){
			
			if(text.charAt(i+patternLen -1) == pattern.charAt(patternLen -1)){
				System.out.println("In if "+i);
				int j = 0;
				while(j<patternLen && text.charAt(i+j) == pattern.charAt(j)){
					j++;
				}
				if(j == patternLen)
					return i;
				i++;
			}else{
				System.out.print("In else "+i);
				i = i + table[text.charAt(i+patternLen -1)];
				System.out.println(",,In else "+i);
				
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BoyceMoore bm = new  BoyceMoore();
		bm.setText("aswwedfewwdwwefssfabcdfg");
		String pattern = "abcd";
		bm.buildTable(pattern);
		System.out.println("Found at "+bm.firstIndex(pattern));
	}

}
