public class test {

    public static void main(String[] args) {


        MathQuiz quiz = new MathQuiz();

        boolean q1 = quiz.question1();
        boolean q2 = quiz.question2();
        boolean q3 = quiz.question3();

        if (q1) {
            System.out.println("Odpowiedź na pytanie 1 jest poprawna");
        }
        else {
            System.out.println("Poprawna odpowiedź pytanie 1 to 15");
        }

        if (q2) {
            System.out.println("Odpowiedź na pytanie 2 jest poprawna");
        }
        else {
            System.out.println("Poprawna odpowiedź na pytanie 144");
        }

        if (q3) {
            System.out.println("Odpowiedź na pytanie 3 jest poprawna");
        }
        else {
            System.out.println("Poprawna odpowiedź na pytanie 3 to 123");
        }

    }
}
