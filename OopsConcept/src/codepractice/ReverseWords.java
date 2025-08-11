package codepractice;

public class ReverseWords {

	public static void main(String[] args) {
		
		String s = "abc xyz";
		String words[] = s.split(" ");
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < words.length; i++) {
			String word = words[i];

			String reversedWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reversedWord += word.charAt(j);

			}

			System.out.println("Reversed word : "+reversedWord);
			result.append(reversedWord);
			System.out.println("Reversed result : "+result);
			if(i<words.length-1) {
				result.append(" ");
			}
			// System.out.println(word);
			// StringBuilder sb=new StringBuilder(word).reverse();
			// System.out.println(sb);
		}
		System.out.println("Original string : "+s);
        System.out.println("Reversed string : "+result);

	}

}
