package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		int x = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				x = x + 1;
			}
		}
		return x;

	}

	public static double findTallest(List<Double> peeps) {
		double x = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > x) {
				x = peeps.get(i);
			}
		}
		return x;

	}

	public static Object findLongestWord(List<String> words) {
		String x = words.get(0);
		for (int i = 0; i < words.size(); i++) {

			if (words.get(i).length() > x.length()) {
				x = words.get(i);
			}
		}
		// TODO Auto-generated method stub
		return x;
	}

	public static boolean containsSOS(List<String> message2) {
		// TODO Auto-generated method stub
		boolean x = false;
		for (int i = 0; i < message2.size(); i++) {
			if (message2.get(i).equals("... --- ...")) {
				x = true;
			}
		}
		return x;
	}

	public static List<Double> sortScores(List<Double> results) {
		for (int q = 0; q < results.size(); q++) {
			for (int i = 1; i < results.size(); i++) {
				if (results.get(i - 1) > results.get(i)) {
					double x = results.get(i);
					results.set(i, results.get(i - 1));
					results.set(i - 1, x);

				}

			}
		}
		return results;
	}

	public static Object sortDNA(List<String> unSortedSequences) {
		for (int q = 0; q < unSortedSequences.size(); q++) {

			for (int i = 1; i < unSortedSequences.size(); i++) {

				if (unSortedSequences.get(i-1).length() > unSortedSequences.get(i).length()) {
					String x = unSortedSequences.get(i);
					unSortedSequences.set(i, unSortedSequences.get(i -1));
					unSortedSequences.set(i -1, x);
				}
			}
		}
		// TODO Auto-generated method stub
		return unSortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		for(int i =1; i<words.size(); i++) {
		}	
		return null;
	}

}
