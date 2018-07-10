import java.util.Scanner;

public class MathQuiz {

        boolean question1(){
        System.out.println("1. Jaki jest wynik mnożenia 3*5 ?");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        if (answer==15) {
            return true;

        }
        else {
            return false;}
        }

    boolean question2(){
        System.out.println("2. Jakie jest pole kwadratu o boku 12 ?");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        if (answer==144) {
            return true;
        }
        else {
            return false;}
    }

    boolean question3(){
        System.out.println("3. Jaki jest pierwiastek kwadratowy z liczby 15129?");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        if (answer==123) {
            return true;
        }
        else {
            return false;}
    }



}


