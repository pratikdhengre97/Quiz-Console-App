import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Question(1,"Which of the following is used to compile Java code?","java","javac","jvm","jre","javac");
        questions[1] = new Question(2,"Which method is the entry point of a Java program?","start()","run()","main()","init()","main()");
        questions[2] = new Question(3,"Which of the following is NOT a Java keyword.","class","static","public","main","main");
        questions[3] = new Question(4,"Which data type is used to store whole numbers?","float","double","int","char","int");
        questions[4] = new Question(5,"Which symbol is used to end a statement in Java?",":",".",";",",",";");
    }

    public void playQuiz() {
        int i = 0;
        for(Question q : questions) {
            System.out.print("Q"+q.getId()+". ");
            System.out.println(q.getQuestion());
            System.out.println("a. "+q.getOpt1());
            System.out.println("b. "+q.getOpt2());
            System.out.println("c. "+q.getOpt3());
            System.out.println("d. "+q.getOpt4());

            Scanner sc = new Scanner(System.in);
            System.out.print("Answer : ");
            selection[i] = sc.nextLine();
            System.out.println();
            i++;
        }
        for(String s : selection) {
            System.out.println(s);
        }
    }
    public void printScore() {
        int score = 0;
        for(int i=0;i<questions.length;i++) {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();

            String userAnswer = selection[i];

            if(actualAnswer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is : "+score);
    }
    
}
