public static String Reverse(String word ) {
//reverse and lowercasing a specific string using recurrsion
	

	
	int length = word.length();
	int i =length-1;
	word =word.toLowerCase();
	
	String reversed="";
	
	
	
	
	
	String answer = helper(word , i ,reversed);
	return answer;
	
	
	
}

public static String helper(String word , int i , String reversed) {
	
	
	if( i == -1) {
		
		
		return reversed;
	}
	
	reversed += word.charAt(i);
	


	return helper(word,i-1,reversed);
	
}
	
public static void main(String[] args) {
	
	
	
	System.out.println(Reverse("LOha32434De"));
	
	
	
	
	
}




}