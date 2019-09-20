/* 
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
        1
       222
      33333
     4444444
    555555555 
*/
package main;

public class Main {

	public static void main(String[] args) {
		int lines = 5;
			
		int row = 1;
		
		for (int i = lines; i > 0; i--) {
			for (int j = 1; j <= i + i; j++) { // print spaces at the beginning of each row
				System.out.print(" ");
			} for (int j = 1; j <= row; j++) { // printing the additive value for each row
				System.out.print(row + " ");
			} for (int j = row - 1; j >= 1; j--) { // printing the subtractive value for each row
				System.out.print(row + " ");
			}
			
			System.out.println();
			
			row++; // increasing the row count for the next line
		
		}
	}
}
