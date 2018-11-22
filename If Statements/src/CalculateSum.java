
//public class CalculateSum {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		calculateSum(4,5);
//		System.out.print(calculateSum2(5,10));
//			
//	}
//	public static void calculateSum(int a, int b) {
//		
//		int sum = a + b;
//		System.out.println(sum);
//		
//	}
//	
//	public static int calculateSum2(int x,int y) {
//		
//		int sum = x +y;
//		return sum;
//	}

  public class Task {

	public static void main(String[] args) {
		
		int highScorePosition=calculateHighScorePosition(1500);
		displayHighScorePosition("Mike", highScorePosition);
		
		highScorePosition=calculateHighScorePosition(900);
		displayHighScorePosition("Smith", highScorePosition);
		
		highScorePosition=calculateHighScorePosition(400);
		displayHighScorePosition("Anna", highScorePosition);
		
		displayHighScorePosition("Tedd", calculateHighScorePosition(100));

	}
	
	public static void displayHighScorePosition(String playerName,int highScorePosition) {
		System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
	}
	
	public static int calculateHighScorePosition(int playerscore) {
		if(playerscore>=1000) {
			return 1;
		}else if(playerscore>=500 && playerscore<1000) {
			return 2;
		}else if(playerscore>=100 && playerscore<500) {
			return 3;
		}else {
			return 4;
		}
		
	}
	
	

}