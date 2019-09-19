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
		int a = lines + 4 - 1;
	
		for (int i = 1; i <= lines; i++) {
			
			for (int j = a; j > 0; j--) {
				System.out.print(" ");
			} for (int k = 1; k <= i; k++) {
			System.out.print(i + " ");
			}
			System.out.println();
			a++;
			
		/*int rows = 1;
		for (int i = lines; i > 0; i--) {
			for (int j = 1; j > 0; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= rows; k++) {
				System.out.print(rows + "");
			}
			System.out.println();
			
			rows++;*/
		
		}
	}

	private static void printSpaces(int i) {
		// TODO Auto-generated method stub
		
	}
}
