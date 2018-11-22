
public class SwitchClass {

	public static void main(String[] args) {
		
	//}
//		// TODO Auto-generated method stub
//		
//		int switchValue=3;
//		switch(switchValue) {
//		case 1:
//			System.out.println("value was 1");
//			break;
//		case 2:
//			System.out.println("value was 2");
//			break;
//		case 3: case 4: case 5:
//			System.out.println("value was 3, or 4 , or 5");
//			break;
//		default:
//			System.out.println("was not correct value");
//			break;
//      			
//		}
//
//	}
//
//}

/*
 TASK
 Create a new switch statement using char instead of int. Create new char variable.
 Create a switch statement testing for A,B,C,D or E. Display a message if any of these are found and then break.
 Add a default which displays a message saying not found. 
 */

char charValue='C';
switch(charValue) {
case 'A':case 'B':case 'C':case 'D':case 'E':
	System.out.println(charValue + " was found ");
	break;
	default:
		System.out.println("It was not faund");
		break;
}
	}
}


























		

