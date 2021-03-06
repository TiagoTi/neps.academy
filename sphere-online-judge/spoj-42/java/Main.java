/*
EXPECT - Life, the Universe, and Everything (Interactive).

Description
		Your program is to use the brute-force approach in order to find the
	Answer  to Life, the Universe, and Everything. More precisely... rewrite
	small numbers from input to output. Stop processing input after reading in
	the number 42. All numbers at input are integers of one or two digits

    Interactive Protocol:
				You should communicate with Judge using standard input and output.

				Attention: the program should clear the output buffer after printing
			each line.

				It can be done using fflush(stdout) command or by setting the proper
			type of buffering at the beginning of the execution - setlinebuf(stdout).

				Each time the judge will give you a number. You should rewrite this
			number to standard output. If this number equals 42, after rewriting your
			program should terminate immediately.


    Link: https://www.spoj.com/problems/EXPECT/

*/
import java.util.Scanner;
import java.util.NoSuchElementException;

public class Main {
	static final int FORTY_TWO = 42;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int currentNumber;

		while(scanner.hasNext()){
					currentNumber = scanner.nextInt();
					if(currentNumber == FORTY_TWO) break;
					System.out.println(currentNumber);
		}
	}
}
