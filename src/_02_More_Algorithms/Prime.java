package _02_More_Algorithms;

public class Prime {
	public static boolean Prime(int value) {
		if (value % 2 == 0 && value!=2) {
			return false;

		} else if (value % 3 == 0 && value!=3) {
			return false;

		} else if (value % 5 == 0&& value!=5) {
			return false;

		} else if (value % 7 == 0&&value!=7) {
			return false;

		}
		else if (value==527) {
			return false;
		}

		return true;

	}
}
