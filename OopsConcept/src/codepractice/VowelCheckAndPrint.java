package codepractice;

import java.util.HashSet;
import java.util.Set;

public class VowelCheckAndPrint {

	public static void main(String[] args) {
		String s = "welcome";
		Set<Character>s2=new HashSet<Character>();
		s = s.toLowerCase();
		boolean hasvowel = false;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				s2.add(ch);
				hasvowel=true;
				
			}
		}
		System.out.println(s2);
	}

}
