package dp;

public class EditDistance {

	public int editDistanceByRecursion(String s1,  String s2, int len1, int len2){
		
		if(len1 == 0)
			return len2;
		if(len2 == 0)
			return len1;
		if(s1.charAt(len1-1) == s2.charAt(len2-1))
			return editDistanceByRecursion(s1,s2,len1-1,len2-1);
		
		int a = 1+ editDistanceByRecursion(s1,s2,len1,len2-1);
		int b = 1+ editDistanceByRecursion(s1,s2,len1-1,len2);
		int c = 1+ editDistanceByRecursion(s1,s2,len1-1,len2-1);
		
		return Math.min(a, Math.min(b,c));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EditDistance ed = new EditDistance();
		String s1 = "abcde";
		String s2 = "abcd";
		
		System.out.println(ed.editDistanceByRecursion(s1, s2, s1.length(), s2.length()));

	}

}
