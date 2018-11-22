
//public class Tasks {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int marks = 99;
//		if(marks<60 && marks>=0) {
//			System.out.println("Fail");
//		}else if(marks>=60 && marks<90) {
//			System.out.println("Pass");
//		}else if(marks>=90 && marks<=100) {
//			System.out.println("Passed with Distinction");
//		}else {
//			System.out.println("Please write mark between 0 and 100");
//		}
//	}
//
//	}

//public class Tasks {
//
//	public static void main(String[] args) {
//		
//		int highScorePosition=calculateHighScorePosition(1500);
//		displayHighScorePosition("Mike", highScorePosition);
//		
//		highScorePosition=calculateHighScorePosition(900);
//		displayHighScorePosition("Smith", highScorePosition);
//		
//		highScorePosition=calculateHighScorePosition(400);
//		displayHighScorePosition("Anna", highScorePosition);
//		
//		displayHighScorePosition("Tedd", calculateHighScorePosition(100));
//
//	}
//	
//	public static void displayHighScorePosition(String playerName,int highScorePosition) {
//		System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
//	}
//	
//	public static int calculateHighScorePosition(int playerscore) {
//		if(playerscore>=1000) {
//			return 1;
//		}else if(playerscore>=500 && playerscore<1000) {
//			return 2;
//		}else if(playerscore>=100 && playerscore<500) {
//			return 3;
//		}else {
//			return 4;
//		}
//		
//	}
//	
//	
//
//}
/*
public class Tasks {

	public static void main(String[] args) {
		
		calcFeetAndInchesToCentimeters(100);
	

	}
	
	public static double calcFeetAndInchesToCentimeters(double feet,double inches) {
		
		if(feet<0 || (inches<0 || inches>12)) {
			System.out.println("Invalid feet or inches");
			return -1;
		}
		
		double centimeters = (feet * 12) * 2.54;
		centimeters += inches * 2.54;
		
		System.out.println(feet +" feet, " + inches + "inches=" + centimeters + " centimeters" );
	
		
		return centimeters;
		
	}  
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		
		if(inches<0) {
			return -1;
		}
		
		double feet = (int)inches / 12 ;
		double remainingInches = (int)inches % 12;
		
		System.out.println(inches  + " inches=" + feet + " feet and " + remainingInches + " inches");
		return calcFeetAndInchesToCentimeters(feet, remainingInches);
	}
	
}
*/

/*
▪ Create a for statement using a range of numbers from 1 to 1000 inclusive.
▪ Sum all the numbers that can be divided with both 3 and also with 5.
▪ For those numbers that met the above conditions, print out the number.
▪ break out of the loop once you find 5 numbers that met the above conditions.
▪ After breaking out of the loop print the sum of the numbers that 
met the above conditions.
*/
//public class Tasks {
//
//	public static void main(String[] args) {
//		int sum=0;
//		int counter=0;
//		
//		for(int i=1; i<1000;i++) {
//			if(i%3 == 0 && i%5 == 0) {
//				sum+=i;
//				System.out.println("Found number"+i);
//				counter++;
//				if(counter==5){
//				break;
//				}
//			}
//		}
//		
//		System.out.println(sum + "|" + counter);	
//	}
//	
//}

public class Tasks {

	public static void main(String[] args) {
		System.out.println(sumDigits(125));
		System.out.println(sumDigits(-125));
		System.out.println(sumDigits(32125));
		
	}
	
	public static int sumDigits(int number) {
		
		if(number<10) {
			return -1;
		}
		
		int sum=0;
		while(number>0) {
			int digit=number%10;  //125%10 = 5    //12%10=2    //1%10=1
			sum=sum+digit;        //0+5=5         //5+2=7      //7+1=8
			number=number/10;     //125/10=12     //12/10=1    //1/10=0
			
		}
		return sum;
	}


	}
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	













