
public class Task {

	public static void main(String[] args) {
		
		//Task
		//Write a Java program for the following logic:
        //If marks<60,then prin "Fail" If marks >=60, but lesss than 90, then print "Pass".
		//If marks>=90,then print "Passed with Distinction
		
		
	    int marks=89;
		if(marks<60) {
		System.out.println("Fail");
		}
		 else if((marks>=60) && (marks<90)) {
			System.out.println("Pass");
		}else {
			System.out.println("Passed with Disition");
		}
		
	}

}
