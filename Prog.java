import  java.util.*;

public class Prog{
	public static String Inc(long input){
		int length = String.valueOf(input).length();
		int i = length-1, j = 1, k = 0;
		int []digits = new int[length];
		String res = "";

		while(i >= 0){
			digits[i] = (int)input%10;
			input = input/10;
			i--;
		}

		while(t && (k<length)){
			if(digits[k] > digits[j]){
				digits[k] = digits[k]-1;
				res += digits[k];

				while(j < length){
					digits[j] = 9;
					res += digits[j];
					j++;
				}
				t = false;
			}else{
				res += digits[k];
				k++;
				if(j < digits.length-1){
					j++;
				}else{
					res += digits[j];
					t = false;
				}
			}
		}
		return res;
	}

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 10^18");
		long num = input.nextLong();
		System.out.println(Inc(num));

	}
}
