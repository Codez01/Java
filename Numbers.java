import java.util.Scanner;
public class Numbers {


	public static void main(String[] args) {
	
Scanner scan = new Scanner(System.in);


int  numbers , digit1 , digit2, digit3, sumOfAnArmstrongNumber;
int digit1InfourNumbers , digit2InfourNumbers, digit3InfourNumbers , digit4InfourNumbers;
int digit1InfiveNumbers , digit2InfiveNumbers , digit3InfiveNumbers , digit4InfiveNumbers , digit5InfiveNumbers;

double numbersleft1 , numbersleft2;

System.out.println("Please enter a number = ");
numbers = scan.nextInt();

digit1 = numbers / 100; // first digit in a number
digit2 =(numbers/10)%10 ; // second digit in a number
digit3 = numbers % 10; // third digit in a number



sumOfAnArmstrongNumber=(digit1*digit1*digit1) +(digit2 * digit2 * digit2) + (digit3*digit3*digit3);

    if( numbers > 99 && numbers<1000 ) {
    
    if(sumOfAnArmstrongNumber == numbers) {
    	System.out.println("The number : " + numbers + " is an Armstrong number. ");
    }
    else
    	System.out.println("The number : " + numbers+ " isn't an Armstrong number. ");
    }
    else if (numbers > 999 && numbers < 10000) {
    	digit1InfourNumbers = numbers % 10;
		digit2InfourNumbers = (numbers /10) %10;
		digit3InfourNumbers = ( numbers /100)%10;
		digit4InfourNumbers = ( numbers/1000);
    if( numbers>999 && numbers< 10000 && digit4InfourNumbers
			== digit1InfourNumbers && digit2InfourNumbers == digit3InfourNumbers) {
    	System.out.println("The number: " + numbers+ " is a palindrome  ");
    }
    else
    	System.out.println("The number: " + numbers + " is not  a palindrome  ");
     }
    else if(numbers > 9999 && numbers< 100000) {
    	digit1InfiveNumbers = numbers % 10;
		digit2InfiveNumbers = (numbers / 10) %10;
		digit3InfiveNumbers = ( numbers / 100 ) %10;
		digit4InfiveNumbers= ( numbers /1000) %10 ;
        digit5InfiveNumbers = ( numbers / 10000);
		
    if(digit1InfiveNumbers == digit5InfiveNumbers && digit2InfiveNumbers == digit4InfiveNumbers) {
    	System.out.println("The number : " + numbers + " is a palindrome  ");	
    }
    else
    	System.out.println("The number : " + numbers + " is not  a palindrome  ");
    }
    else if ( numbers >99999) {
    	System.out.println("The number" + numbers + " is invalid");
    }
	}

}
	
		
				
			
		
	


