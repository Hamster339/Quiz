/*
 *Class that represents a Quiz -i.e a group of questions
 *
 * @author Hamish Philip
 */
public class Quiz {

	Question[] questions;
	int numOfQuestions;
	int score;
	
	/*
	 *Constructor
	 *	
	 *@param questions a list of questions to be added to the quiz
	 *
	 */
	public Quiz(Question[] questions){
		self.questions = questions;
		self.numOfQuestions = questions.size();
	}
	
	/*
	 *Method marks the quiz and return's the score (number of correct answers
	 *and number of total questions)
	 *
	 *@return list contaning number of correct answers and number of questions
	 */
#	public int[] Mark() {
#		for (question in questions){
#			if (question.correct == true){
#			self.score+=1;
#			}
#		}
#		return [score,numOfQuestions]
#	}
#}	
