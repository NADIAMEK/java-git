
// Exercice 1
//import java.util.Scanner;
//
//public class TP1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Entrer le premier entier: ");
//        int num1 = scanner.nextInt();
//
//        System.out.print("Entrer le second entier: ");
//        int num2 = scanner.nextInt();
//
//        int sum = num1 + num2;
//        int product = num1 * num2;
//        int quotient = num1 / num2; 
//        int difference = num1 - num2;
//
//        System.out.println("The sum of " + num1 + " and " + num2 + " est " + sum);
//        System.out.println("The product of " + num1 + " and " + num2 + " est " + product);
//        System.out.println("The quotient of " + num1 + " and " + num2 + " est " + quotient);
//        System.out.println("The difference between " + num1 + " and " + num2 + " est " + difference);
//    }
//}

// EXERCICE 2
//import java.util.Scanner;
//
//public class TP1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Entrer le rayon de circle: ");
//        double rayon  = scanner.nextDouble();
//
//        double surface = Math.PI * Math.pow(rayon, 2);
//        double périmètre = 2 * Math.PI * rayon;
//
//        System.out.println("la surface de circle est " + surface);
//        System.out.println("le périmètre de circle est " + périmètre);
//    }
//}
// EXERCICE 3
//import java.util.Scanner;
//
//public class TP1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Entrer le premier entier : ");
//        int a = scanner.nextInt();
//
//        System.out.print("Entrer le second entier : ");
//        int b = scanner.nextInt();
//
//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println("Apres permutation ,le premier entier est  " + a);
//        System.out.println("Apres permutation ,le second  entier est " + b);
//    }
//}
// EXERCICE 4
//import java.util.Scanner;
//
//public class TP1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Entrer un nombre reel : ");
//        double x = scanner.nextDouble();
//
//        System.out.print("entrer un entier : ");
//        int n = scanner.nextInt();
//
//        double result = Math.pow(x, n);
//
//        System.out.println(x + " a la puissance de  " + n + " is " + result);
//    }
//}
// EXERCICE 5
//import java.util.Scanner;
//
//public class TP1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Entrer un nombre positif : ");
//        int n = scanner.nextInt();
//
//        if (n < 0) {
//            System.out.println("Erreur le nombre doit etre positif .");
//            return;
//        }
//
//        long factorial = 1;
//        for (int i = 2; i <= n; i++) {
//            factorial += i;
//        }
//
//        System.out.println("factoriel " + n + " est " + factorial);
//    }
//}
// EXERCICE 6
//import java.util.Scanner;
//
//public class TP1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Entrer le coefficient a: ");
//        double a = scanner.nextDouble();
//
//        System.out.print("Entrer le coefficient b: ");
//        double b = scanner.nextDouble();
//
//        if (a == 0) {
//            if (b == 0) {
//                System.out.println("Equation a une infinite de solutions .");
//            } else {
//                System.out.println("pas de solution .");
//            }
//        } else {
//            System.out.println("equation a une seule solution: x = " + (-b / a));
//        }
//    }
//}
//EXERCICE 7
//import java.util.Scanner;
//
//public class TP1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Entrer le coefficient a: ");
//        double a = scanner.nextDouble();
//
//        System.out.print("Entrer le coefficient b: ");
//        double b = scanner.nextDouble();
//
//        System.out.print("Entrer le coefficient c: ");
//        double c = scanner.nextDouble();
//
//        double discriminant = b * b - 4 * a * c;
//
//        if (discriminant > 0) {
//            double racine1 = (-b + Math.sqrt(discriminant)) / (2 * a);
//            double racine2 = (-b - Math.sqrt(discriminant)) / (2 * a);
//            System.out.println("les racines sont des reels et different : " + racine1 + " and " + racine2);
//        } else if (discriminant == 0) {
//            double racine = -b / (2 * a);
//            System.out.println("racines sont des reels et identiques : " + racine);
//        } else {
//            double realPart = -b / (2 * a);
//            double imagPart = Math.sqrt(-discriminant) / (2 * a);
//            System.out.println("racine sont complexe et different: " + realPart + " + i" + imagPart + " and " + realPart + " - i" + imagPart);
//        }
//    }
//}
//EXERCICE 8
//import java.util.Scanner;
//
//public class TP1  {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Entrer le premier entier : ");
//        int num1 = scanner.nextInt();
//
//        System.out.print("Entrer le second entier : ");
//        int num2 = scanner.nextInt();
//
//        int PGCD = CALCULERPGCD(num1, num2);
//
//        System.out.println("LE PGCD de  " + num1 + " et " + num2 + " est " + PGCD);
//    }
//
//    private static int CALCULERPGCD(int num1, int num2) {
//        if (num2 == 0) {
//            return num1;
//        }
//        return CALCULERPGCD(num2, num1 % num2);
//    }
//}
