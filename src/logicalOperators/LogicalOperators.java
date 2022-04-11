package logicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean isInterviewQuestionsSent = true;
        boolean isJavaHomeworkSent = true;

         // Send me the interview questions OR Java Homework

        System.out.println("The student is okay! " + (isInterviewQuestionsSent || isJavaHomeworkSent));
        // if there is a single true for OR than it is always true

        // Send me the interview questions AND Java Homework

        System.out.println("The student is okay! " + (isInterviewQuestionsSent && isJavaHomeworkSent));

        // if there is a single False for AND it is false

    }
}
