import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CapitalsGermanSpeakingCountries {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("What is the capital of Germany? ");//displays question
		
		String answerGermany = reader.readLine();//reads answer from the keyboard
		String Berlin = "Berlin";//correct answer
		if (answerGermany.equals(Berlin)) {//if "Berlin" was typed in, then...
			System.out.println("Correct!");//"Correct!" gets displayed
			System.out.println("");
		}
		else if (!answerGermany.equals(Berlin)){//if another city was typed in, then...
			System.out.println("False. The correct answer is 'Berlin'.");//-->will get displayed
			System.out.println("");
		}
		
		System.out.print("What is the capital of Austria? ");
		String answerAustria = reader.readLine();
		String Vienna = "Vienna";
		if (answerAustria.contentEquals(Vienna)) {
			System.out.println("Correct!");
			System.out.println("");
		}
		else if (!answerAustria.contentEquals(Vienna)) {
			System.out.println("False. The correct answer is 'Vienna'.");
			System.out.println("");
		}
		
		System.out.print("What is the capital of Switzerland? ");
		String answerSwitzerland = reader.readLine();
		String Bern = "Bern";
		if (answerSwitzerland.equals(Bern)) {
			System.out.println("Correct!");
			System.out.println("");
		}
		else if (!answerSwitzerland.equals(Bern)) {
			System.out.println("False. The correct answer is 'Bern'.");
			System.out.println("");
		}
	}

}
