
public class CalculateSum {

	//public static void main(String[] args) {
		
//		calculateSum(4,5);
//		System.out.println(calculateSum2(5,10));
//		
//	}
//	
//	public static void calculateSum(int a, int b) {
//		
//		int sum = a+b;
//		System.out.println(sum);
//	}
//	
//	public static int calculateSum2(int x, int y) {
//		
//		int sum = x +y;
//		return sum;
//	}
//
//}
  /*
   * TASK
   * Create a method called displayHighScorePosition. It should have a player name as a parameter,
   *  and a 2nd parameter as position in the high score table.You should display the players name along with a message like 
   *  "managed to get into position" and the position they got and a further message"on the high score table"
   * Create a 2nd method called calculateHighScorePosition. It should be sent one argument only,the player score.It should 
   * return an int. The return data should be:
   * 1- if the score is>=1000
   * 2-if the score is >=500 and<1000
   * 3- if the score is>=100 and<500
   * in all other cases
   * 
   * Call both methods and display the results of the following: a score of 1500,900,400 and 50.
   
   */
  public static void main(String[] args) {
	  
	  int highScorePosition=calculateHighScorePosition(1500);
	  displayHighScorePosition("Smith",highScorePosition);
	  
	   highScorePosition=calculateHighScorePosition(900);
	  displayHighScorePosition("Mike",highScorePosition);
	  
	   highScorePosition=calculateHighScorePosition(400);
	  displayHighScorePosition("Anna",highScorePosition);
	  
  }
	public static void displayHighScorePosition(String playerName,int highScorePosition) {
		System.out.println(playerName + "managed to get into position" + highScorePosition +"on the high score table");
		
	}
	public static int calculateHighScorePosition(int playerscore) {
		if (playerscore>=1000){
			return 1;
		}else if(playerscore>=500 &&playerscore<1000) {
			return 2;
		}else if(playerscore>100 && playerscore<500) {
			return 3;
		}else {
			return 4;
			
		}
		
	}
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	  
  