import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    static int MAX_NUMBER_TRY = 5;
    static int MAX_GENERATED_VALUE = 100;
    static int MIN_GENERATED_VALUE = 1;

    public static void main(String[] args) {
        Random random = new Random();
        int numberToAsk = random.nextInt(MAX_GENERATED_VALUE) + MIN_GENERATED_VALUE;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= MAX_NUMBER_TRY ; i++) {
            boolean isNotIntegerNumber = false;
            int userInput = 0;

            while (isNotIntegerNumber) {
                System.out.print("Vous devez deviner un chiffre aléatoire entre 0 et 100. Donnez votre première estimation : ");
                System.out.printf("Essai n°%s", i);
                if (sc.hasNextInt()) {
                    userInput = sc.nextInt();
                    isNotIntegerNumber = false;
                } else {
                    System.out.print("Veuillez taper un chiffre entre 1 et 100, réessayez : ");
                    sc.next();
                }

                if (numberToAsk == userInput) {
                    System.out.print("Vous avez trouvé le juste prix");
                } else {
                    System.out.print("Veuillez retenter votre chance :");
                }
            }
        }

    }
}

//public static void PriceIsRight() {
//    int randomNum = (int)(Math.random() * 101);
//
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Vous devez deviner un chiffre aléatoire entre 0 et 100. " +
//            "Donnez votre première estimation : ");
//
//    int p = sc.nextInt();
//
//
//    for (int i = 0; i < 5; i++) {
//        if (p > 0 && p < 100) {
//            if (p == randomNum) {
//                System.out.print("Vous avez trouvé le juste prix");
//                break;
//            } else {
//                System.out.print("Veuillez retenter votre chance :");
//                p = sc.nextInt();
//            }
//        } else if (p < 0) {
//            System.out.print("Veuillez taper un chiffre entre 0 et 100, les nombres négatifs ne sont pas pris en compte");
//            p = sc.nextInt();
//        } else {
//            System.out.print("Veuillez taper un chiffre entre 0 et 100, les nombres supérieurs à 100 ne sont pas pris en compte");
//        }
//
//    }
//    System.out.println(randomNum);
//}
//
//public class Main {
//    public static void main(String[] args) {
//        PriceIsRight();
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }
//    }
//}
