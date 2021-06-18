package com.sat.work;

public class StringCount {
	public void count(String st)
	{
		int wordCount = 0;
		
		for (char letter = 'a';letter <= 'z'; letter++) {
			for (int i = 0; i < st.length(); i++) {
				if (st.charAt(i) == letter) {
					wordCount++;
				}
			}
			if (wordCount > 0) {
				System.out.println(letter + "=" + wordCount);
				wordCount = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		StringCount c1 = new StringCount ();
		c1.count("king");
		
		
		
	}

}
