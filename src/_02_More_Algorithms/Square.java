package _02_More_Algorithms;

public class Square {
	public static boolean isSquare(int value) {
		for(int i=1; i<value; i++) {
			
			if (value/i==i) {
				return true;
			}
		}
		if(value==1) {
			return true;
		}
		return false; 
	
	
}
	}

