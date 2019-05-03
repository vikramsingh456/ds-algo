package numbers;

public class IsPrime {
	
	public static boolean isPrime(int num){
	    if ( num > 2 && num%2 == 0 ) {
	        //System.out.println(num + " is not prime");
	        return false;
	    }
	    int top = (int)Math.sqrt(num) + 1;
	    for(int i = 2; i < top; i+=2){
	        if(num % i == 0){
	            //System.out.println(num + " is not prime");
	            return false;
	        }
	    }
	    //System.out.println(num + " is prime");
	    return true; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 6;
		System.out.println("is prime = "+isPrime(number));
	}

}
