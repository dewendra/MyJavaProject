package codepractice;

public class DuplicateInStringArray {

	public static void main(String[] args) {
		String s[] = { "dev", "sonia", "manish", "dev", "sonia", "amit","alok","amit" };
		String result = null;
		
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				
				if(s[i].equals(s[j])) {
					System.out.print(s[i]+" ");
					// result.add(s[i]);
			}
			
			}
		}
		//System.out.println(result.toString());
	}

}
