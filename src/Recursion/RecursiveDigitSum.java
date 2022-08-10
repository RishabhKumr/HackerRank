package Recursion;

public class RecursiveDigitSum {
	/*
	 * We define super digit of an integer  using the following rules:
       Given an integer, we need to find the super digit of the integer.
       1.If x has only  1 digit, then its super digit is x.
       2.Otherwise, the super digit of  is equal to the super digit of the sum of the digits of .
       For example, the super digit of  9875 will be calculated as:

	   super_digit(9875)   	9+8+7+5 = 29 
	   super_digit(29) 	    2 + 9 = 11
	   super_digit(11)		1 + 1 = 2
	   super_digit(2)	  	= 2  
	 */
	 public static int superDigit(String n, int k) {
		 //check for condition 1
         if(n.length() == 1 && k == 1)
            return Integer.valueOf(n);

              long sum = 0;
              for(int i=0;i<n.length();i++)
              sum += Integer.valueOf(n.substring(i,i+1));
              sum *= k;
              return superDigit(Long.toString(sum), 1);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(superDigit("9875",4));

	}

}
