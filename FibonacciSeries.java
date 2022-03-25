package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0, 1, 1, 2, 3 , 5, 8, 13, 21, 34
		
		int firstNum=0;
		int secNum=1;
		
		int sum;
		
		System.out.print(firstNum +" "+ secNum);
		
		for (int i=2; i<=9; i++ ) {
			sum=firstNum+secNum;
				
			firstNum=secNum;
			secNum=sum;
			System.out.print(" "+sum);
		}
			

	}

}
