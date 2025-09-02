package codepractice;

import java.util.Arrays;

public class SortStringComponents {

	public static void main(String[] args) {
		String s="aBcA1bC2";//Output:abcABC12
		System.out.println(modifyString(s));
	}
	public static String modifyString(String s) {
		StringBuilder lowercase= new StringBuilder();
		StringBuilder uppercase=new StringBuilder();
		StringBuilder digit=new StringBuilder();

		for(int i=0; i<s.length();i++) {
			Character ch=s.charAt(i);
			if(Character.isLowerCase(ch)) {
				lowercase.append(ch);
			}else if (Character.isUpperCase(ch)) {
				uppercase.append(ch);
			}else if (Character.isDigit(ch)) {
				digit.append(ch);
			}
		}
		String lower=sortString(lowercase.toString());
		String upper=sortString(uppercase.toString());
		String digits=sortString(digit.toString());
		String result=lower+upper+digits;
		return result;
	}
	

	private static String sortString(String s) {
		char a[]=s.toCharArray();
		Arrays.sort(a);
		String result=new String(a);
		return result;
	}

}
