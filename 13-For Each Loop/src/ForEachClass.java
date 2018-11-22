
public class ForEachClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] marks= {125,132,95,116,110};
		
		int highest_mark=maximum(marks);
		System.out.println(maximum(marks));

	}
public static int maximum(int[] array) {
	int max=array[0];
	for (int i=0;i<array.length;i++) {
		if (array[i]>max) {
			max=array[i];
		}
	}
	return max;
}
}
