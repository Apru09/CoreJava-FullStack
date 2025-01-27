import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];

    String[] selection = new String[5];

    public QuestionService() {

        questions[0] = new Question(1, "One of the OOPS concepts", "Encapsulation", "Abstraction", "Inheritance", "All of the above", "All of the above");
        questions[1] = new Question(2, "Which type of inheritance is not supported in java?", "Single Inheritance", "Multi-level Inheritance", "Multiple Inheritance", "All of the above", "Multiple Inheritance");
        questions[2] = new Question(3, "Where is object created inside the JVM?", "Heap", "Queue", "Stack", "All of the above", "Heap");
        questions[3] = new Question(4, "Right way to create an object?", "ClassName name = new ClassName();", "ClassName name();", "ClassName new = ClassName();", "None of the above", "ClassName name = new ClassName();");
        questions[4] = new Question(5, "Which keyword is used to make a constant variable?", "static", "this", "final", "super", "final");

    }

    public void playQuiz() {
        
        int i = 0;
        for(Question q : questions){

            System.out.println("Question :" + q.getId());
            System.out.println();
            System.out.println(q.getQuestion());

            System.out.println();

            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            System.out.println();

            Scanner sc = new Scanner(System.in);
            System.out.print("Your Answer: ");
            selection[i++] = sc.nextLine();
            System.out.println();
            sc.close();
        }

    }

    public void getScore() {

        int score = 0;

        for(int i=0; i<questions.length; i++) {

            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];

            if(userAnswer.equals(actualAnswer)){
                score++;
            }
        }

        System.out.println("Correct Answers are: ");

        for(Question q : questions){
            System.out.println(q.getAnswer());
        }
        System.out.println();
        System.out.println("Your Score is: " + score);
    }
}
