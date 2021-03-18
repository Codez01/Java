import java.util.Arrays;

public class SpamChecker {

	public static int[] getSpamStatistics(String[] names, String[] lables, String queryName) {

		int A = 0;
		int B = 0;
		int C = 0;
        boolean found = false;
	

		
				for (int j = 0; j < lables.length; j++) {

					if (lables[j] == "spam") {

						A++;
					}

					if (lables[j] == "not_spam") {

						B++;

					}

					if (lables[j] == "unknown") {

						C++;
					}
					if(names[j] == queryName) {
						
						System.out.println("the email sent by " + queryName);
						found = true;
						
					}
					
				}
				
				if(found == false){
					System.out.println("no email was sent by " + queryName);
				}
				int[] a = { A, B, C };
			return a;
		

			
		
	}

	public static void main(String[] args) {

		String lables[] = {"spam", "spam" , "unknown" , " not_spam"};

		String names[] = { "yazan" , "hanna" , "amir" , "omar"};
		
		
		System.out.println(Arrays.toString(
				getSpamStatistics(names , lables , "samir")));
		
		
	}

}