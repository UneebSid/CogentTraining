package Day9;


abstract class Marks
{
    abstract double getPercentage();
}

class StudentA extends Marks
{
    double subject1_Score;
    double subject2_Score;
    double subject3_score;

    public StudentA(double subject1_Score, double subject2_Score, double subject3_score) {
        this.subject1_Score = subject1_Score;
        this.subject2_Score = subject2_Score;
        this.subject3_score = subject3_score;
    }

    @Override
    double getPercentage() {
        return ((subject1_Score+subject2_Score+subject3_score)/300)*100;
    }
}

class StudentB extends Marks
{
    double subject1_Score;
    double subject2_Score;
    double subject3_score;
    double subject4_Score;

    public StudentB(double subject1_Score, double subject2_Score, double subject3_score, double subject4_Score) {
        this.subject1_Score = subject1_Score;
        this.subject2_Score = subject2_Score;
        this.subject3_score = subject3_score;
        this.subject4_Score = subject4_Score;
    }

    @Override
    double getPercentage() {

        return ((subject1_Score+subject2_Score+subject3_score+subject4_Score)/400)*100;
    }
}

public class Question4
{

    public static void main(String[] args) {
        StudentA studentA = new StudentA(55.00,65.00,75.00);
        StudentB studentB = new StudentB(100.00,100.00,100,100);

        System.out.println("Student A's percentage is: " + studentA.getPercentage()+"%");
        System.out.println("Student B's percentage is: " + studentB.getPercentage()+"%");

    }
}
