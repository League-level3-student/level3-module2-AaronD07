package _01_Searching_Algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] words = {"A", "B", "C", "D", "E", "F"};
		assertEquals(2, _00_LinearSearch.linearSearch(words, "C"));
		assertEquals(0, _00_LinearSearch.linearSearch(words, "A"));
		assertEquals(-1, _00_LinearSearch.linearSearch(words, "Y"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] nums = {0, 1, 2, 3, 4, 5, 6};
		assertEquals(1, _01_BinarySearch.binarySearch(nums, 0, nums.length-1, 1));
		assertEquals(0, _01_BinarySearch.binarySearch(nums, 0, nums.length-1, 0));
		assertEquals(-1, _01_BinarySearch.binarySearch(nums, 0, nums.length-1, 7));
		assertEquals(6, _01_BinarySearch.binarySearch(nums, 0, nums.length-1, 6));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] nums = {0, 1, 2, 3, 4, 5, 6};
		assertEquals(1, _02_InterpolationSearch.interpolationSearch(nums, 1));
		assertEquals(0, _02_InterpolationSearch.interpolationSearch(nums, 0));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(nums, 7));
		assertEquals(6, _02_InterpolationSearch.interpolationSearch(nums, 6));
	}
	
	@Test
	public void testExponentialSearch() {
		int[] nums = {0, 1, 2, 3, 4, 5, 6};
		assertEquals(1, _03_ExponentialSearch.exponentialSearch(nums, 1));
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(nums, 0));
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(nums, 7));
		assertEquals(6, _03_ExponentialSearch.exponentialSearch(nums, 6));

		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
