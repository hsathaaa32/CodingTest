
public class Problem2_Recursion {
	public String reverseString(String inputStr) {
		//Requirements: reverse the input string by using recursion.
		return inputStr.charAt(inputStr.length()-1) + reverseString(inputStr.subString(0,inputStr.length()-2));
	}
}
