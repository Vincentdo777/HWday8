package HomeWork8;

public class LongestSameString {
	public static void main(String[] args) {
		String[] test = {"aaa", "aaabbb","abbbb"}; 
		if(test.length > 0) {
			System.out.println(findLongestSameString(test));
		}else {
			System.out.println("empty");
		}
		
	}
	
	public static String findShortestString(String [] array) {
		String minString = array[0];
		for(int i = 0 ; i < array.length; i ++) {
			if(minString.length() > array[i].length()) {
				minString = array[i];
			}
		}
		return minString;
	}
		
	public static String findLongestSameString(String [] array) {
		String minWord = findShortestString(array);
		String result = "";
		for(int i = 0; i < minWord.length() ; i++ ) {
			char letter = array[0].charAt(i);
			
			for(int j = 0; j < array.length ; j++) {
				if(array[j].charAt(i) != letter) {
					return result;
				}
			}
			result += letter;
		}
		return result;
		
	}


	
}
