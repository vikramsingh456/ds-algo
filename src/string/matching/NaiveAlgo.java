package string.matching;

public class NaiveAlgo {

	private String text;
	
	public void setText(String text){this.text = text; }
	public String getText(){return text;}
	
	public int firstIndex(String pattern){
		int patternLength = pattern.length();
		int textLength = text.length();
		
		for(int curIndex = 0; curIndex <= textLength - patternLength; curIndex++){
			if(text.charAt(curIndex) == pattern.charAt(0)){
				int tempLength = 1;
				while((tempLength < patternLength) && (text.charAt(curIndex + tempLength)  == pattern.charAt(tempLength))){
						tempLength++;
				}
				if(tempLength == patternLength){
					return curIndex;
				}
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NaiveAlgo stringMatch = new NaiveAlgo();
		stringMatch.setText("123cdcde");
		
		System.out.println(stringMatch.firstIndex("cde"));
	}

}
 