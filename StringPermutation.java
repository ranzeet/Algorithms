class StringPermutation {
	public static void main (String argr[]) {
		String input = "abc";
		permute(input);
	}

	static void permute(String inp) {
		permutation(inp, "");	
	}
	
	static void permutation(String inp, String prefix) {
		if (inp.length() == 0) {
			System.out.println(prefix);
			return;
		}
		for (int i = 0; i < inp.length(); i++) {
			String rem = inp.substring(0, i) + inp.substring(i+1);
			permutation(rem, prefix+inp.charAt(i));
		}
	}
}