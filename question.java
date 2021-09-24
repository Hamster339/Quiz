import java.util.Scanner

/**
 *Class to represent a question
 *
 *@authour Hamish Philip
 *
 */
public class Question {
	
	private String question;
	private String answer;
	private String answerGiven;
	private boolean correct;
	
	/**
	 *Constructor
	 * @param question the question
	 * @param answer the answer
	 */
	public question (String question, String answer) {
		self.question = question;
		self.answer = answer
	}

	/**
	*	@return returns the question text
	*/
	public String  ShowQuestion(){
		return self.question;
	}
	
	/**
	 * Method answer's the question with given answer
	 *
	 * @param answer aswer given by the user
	 * @return boolean stateing weather answer was corrcct
	 */
	public boolean Answer (String answer) {
		self.answergiven = answer;

		self.correct = (self.answergiven == self.answer);
		return self.correct;

	}	

}
