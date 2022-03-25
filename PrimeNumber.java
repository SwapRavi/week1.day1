package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//number divisible by 1 and itself
		//1, 2, 3 , 5, 7, 11, 1, 17

		
		int input = 13;
	    boolean flag = false;
	    for (int i = 2; i <= input / 2; ++i) {
	          if (input % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(input + " is a prime number.");
	    else
	      System.out.println(input + " is not a prime number.");
	  }
	}


