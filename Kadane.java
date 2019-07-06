class Kadane {
	public static void main (String argr[]) {
		int [] a = {0, -3, -4, -1, -2, -1, -5, -3}; 
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
	}

	static int maxSubArraySum(int a[]) {
		int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;

		for (int ech : a) {
			maxEndingHere = maxEndingHere + ech;
			if (maxSoFar < maxEndingHere)
				maxSoFar = maxEndingHere;
			if (maxEndingHere < 0)
				maxEndingHere = 0;
		}
		return maxSoFar;
	}
}