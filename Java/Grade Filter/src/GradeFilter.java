import java.util.ArrayList;

public class GradeFilter {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(95);
        scores.add(75);
        scores.add(35);

        for (int score : scores) {

            if (score >= 90)
                System.out.println(score + " : Distinction");

            else if (score >= 40)
                System.out.println(score + " : Pass");

            else
                System.out.println(score + " : Fail");
        }
    }
}