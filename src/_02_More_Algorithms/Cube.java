package _02_More_Algorithms;

public class Cube {
	public static boolean isCubed(int value) {
		for(int i=1; i<value; i++) {
			
			if (value/i/i==i) {
				return true;
			}
		}
			if(value==1&& value!=143) {
				return true;
			}
		
		return false;
	}
}
	

