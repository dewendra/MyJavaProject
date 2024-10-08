package javaStringMethods;

public class JavaStringMethods {
	
	static String string1="Hello";
	static String string2="world";
	static String string3="HELLO";
	static String string4="WORLD";
	
	//Returns the character at the specified index (position)
	public static void main(String[] args) {
		//Returns the character at the specified index (position)
		System.out.println("Returns the character at the specified index : " +string1.charAt(3));
		
		//Returns the Unicode of the character at the specified index
		System.out.println("Returns the Unicode of the character at the specified index : "+string1.codePointAt(0));
		
		//Returns the Unicode of the character before the specified index
		System.out.println("Returns the Unicode of the character before the specified index : "+string1.codePointBefore(1));
		
		//Returns the number of Unicode values found in a string.
		System.out.println("Returns the number of Unicode values found in a string : "+string1.codePointCount(0, 2));
		
		//Compares two strings lexicographically
		System.out.println("Compares two strings lexicographically : " +string1.compareTo(string2));
		
		//Compares two strings lexicographically, ignoring case differences
		System.out.println("Compares two strings lexicographically, ignoring case differences : "+string1.compareToIgnoreCase(string2));
		
		//Appends a string to the end of another string
		System.out.println("Appends a string to the end of another string : "+string1.concat(string2));
		
		//Checks whether a string contains a sequence of characters
		System.out.println("Checks whether a string contains a sequence of characters : "+string1.contains("o"));
		
		//Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer
		System.out.println("Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer : "+string1.contentEquals("or"));
		
		//Returns a String that represents the characters of the character array
		//System.out.println("Returns a String that represents the characters of the character array : "+string1.copyValueOf(char[ld]));
		
		//Checks whether a string ends with the specified character(s)
		System.out.println("Checks whether a string Hello ends with the specified character(d) : "+string1.endsWith("d"));
		System.out.println("Checks whether a string Hello ends with the specified character(o)) : "+string1.endsWith("o"));
		
		//Compares two strings. Returns true if the strings are equal, and false if not
		System.out.println("Compares two strings. Returns true if the strings are equal, and false if not : "+string1.equals(string2));
		
		//Compares two strings, ignoring case considerations
		System.out.println("Compares two strings, ignoring case considerations : "+string1.equalsIgnoreCase(string2));
		
		//Returns a formatted string using the specified locale, format string, and arguments
		//System.out.println("Returns a formatted string using the specified locale, format string, and arguments : "+string1.format(string1, args));
		
		//Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array
		System.out.println("Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array : "+string1.getBytes());
		
		//Copies characters from a string to an array of chars
		//System.out.println("Copies characters from a string to an array of chars : "+string1.getChars(0, 4, null, 0));
		
		//Returns the hash code of a string
		System.out.println("Returns the hash code of a string "+string1+ " is: Hashcode "+string1.hashCode());
		
		//Returns the position of the first found occurrence of specified characters in a string
		System.out.println("Returns the position of the first found occurrence of specified characters in a string :"+string1.indexOf("l"));
		
		//Returns the canonical representation for the string object
		System.out.println("Returns the canonical representation for the string object : "+string1.intern());
		
		//Checks whether a string is empty or not
		System.out.println("Checks whether a string is empty or not :"+string1.isEmpty());
		
		//Returns the position of the last found occurrence of specified characters in a string
		System.out.println("Returns the position of the last found occurrence of specified characters in a string :" +string1.lastIndexOf("l"));
		
		//Returns the length of a specified string
		System.out.println("Returns the length of a specified string :"+string1.length());
		
		//Searches a string for a match against a regular expression, and returns the matches
		//System.out.println("Searches a string for a match against a regular expression, and returns the matches: "+string1.matches(string1));
		
		//Returns the index within this String that is offset from the given index by codePointOffset code points
		//System.out.println("Returns the index within this String that is offset from the given index by codePointOffset code points :"+string1.offsetByCodePoints(0, 1));
		
		//Tests if two string regions are equal
		//System.out.println("Tests if two string regions are equal :"+string1.regionMatches(0, string1, 0, 0));
		
		//Searches a string for a specified value, and returns a new string where the specified values are replaced
		System.out.println("Searches a string for a specified value, and returns a new string where the specified values are replaced :"+string1.replace("l", "a"));
		
		//Replaces the first occurrence of a substring that matches the given regular expression with the given replacement
		System.out.println("Replaces the first occurrence of a substring that matches the given regular expression with the given replacement :"+string1.replaceFirst(string1, string2));
		
		//Replaces each substring of this string that matches the given regular expression with the given replacement
		System.out.println("Replaces each substring of this string that matches the given regular expression with the given replacement :"+string1.replaceAll(string2, string1));
		
		//Splits a string into an array of substrings
		System.out.println("Splits a string into an array of substrings :"+string1.split(string1));
		
		//Checks whether a string starts with specified characters
		System.out.println("Checks whether a string starts with specified characters :" +string1.startsWith("w"));
		
		//Returns a new character sequence that is a subsequence of this sequence
		System.out.println("Returns a new character sequence that is a subsequence of this sequence :" +string1.subSequence(0, 3));
		
		//Returns a new string which is the substring of a specified string	
		System.out.println("Returns a new string which is the substring of a specified string :"+string1.substring(1));
		
		//Converts this string to a new character array	
		System.out.println("Converts this string to a new character array :"+string1.toCharArray());
		
		//Converts a string to lower case letters	
		System.out.println("Converts a string to lower case letters	:"+string3.toLowerCase());
		
		//Returns the value of a String object	
		System.out.println("Returns the value of a String object :"+string1.toString());
		
		//Converts a string to upper case letters	
		System.out.println("Converts a string to upper case letters	:"+string1.toUpperCase());
		
		//Removes whitespace from both ends of a string	
		System.out.println("Removes whitespace from both ends of a string :"+string1.trim());
		
		//Returns the string representation of the specified value	
		System.out.println("Returns the string representation of the specified value :"+string1.valueOf("0"));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
