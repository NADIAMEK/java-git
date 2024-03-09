
// EXRECICE 2 
// WHILE 
//import java.util.Scanner;
//
//public class TP2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Entrer le nombre des chiffres : ");
//        int n = scanner.nextInt();
//
//        int sum = 0;
//        long product = 1;
//        int count = 0;
//
//        System.out.println("Entrer " + n + " nombres :");
//
//        while (count < n) {
//            int num = scanner.nextInt();
//            sum += num;
//            product *= num;
//            count++;
//        }
//
//        double average = (double) sum / n;
//
//        System.out.println("Sum: " + sum);
//        System.out.println("Product: " + product);
//        System.out.println("moyenne : " + average);
//    }
//}
//// DO - WHILE 
//import java.util.Scanner;
//
//public class TP2   {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Entrer le nombre des chiffres : ");
//        int n = scanner.nextInt();
//
//        int sum = 0;
//        long product = 1;
//        int count = 0;
//
//        System.out.println("Entrer " + n + " nombres :");
//
//        do {
//            int num = scanner.nextInt();
//            sum += num;
//            product *= num;
//            count++;
//        } while (count < n);
//
//        double average = (double) sum / n;
//
//        System.out.println("Sum: " + sum);
//        System.out.println("Product: " + product);
//        System.out.println("Average: " + average);
//    }
//}
//// FOR 
//import java.util.Scanner;
//
//public class TP2  {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("\"Entrer le nombre des chiffres: ");
//        int n = scanner.nextInt();
//
//        int sum = 0;
//        long product = 1;
//
//        System.out.println("Entrer " + n + " nombres:");
//
//        for (int i = 0; i < n; i++) {
//            int num = scanner.nextInt();
//            sum += num;
//            product *= num;
//        }
//
//        double average = (double) sum / n;
//
//        System.out.println("Sum: " + sum);
//        System.out.println("Product: " + product);
//        System.out.println("Average: " + average);
//    }
//}
// EXERCICE 2
//import java.util.Scanner;
//
//public class TP2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Entrer X: ");
//        int X = scanner.nextInt();
//
//        System.out.print("Entrer N: ");
//        int N = scanner.nextInt();
//
//        long resultat = 1;
//        for (int i = 1; i <= N; i++) {
//            resultat *= X;
//        }
//
//        System.out.println("Resultat est : " + resultat);
//    }
//}
//// EXERCICE 3
//import java.util.Scanner;
//
//public class TP2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Entrer le nombre de termes: ");
//        int N = scanner.nextInt();
//
//        double sum = 0.0;
//        for (int n = 1; n <= N; n++) {
//            sum += 1.0 / n;
//        }
//
//        System.out.println("la somme des premiers " + N + " termes est : " + sum);
//    }
//}
//EXERCICE 4
//import java.util.Scanner;
//
//public class TP2{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Entrer le nombre de lignes : ");
//        int N = scanner.nextInt();
//
//        for (int i = 1; i <= N; i++) {
//            for (int j = 1; j <= N - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}
// EXERCICE 5
//import java.util.Scanner;
//
//public class TP2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Entrer un nombre positif : ");
//        int n = scanner.nextInt();
//
//        long fact = 1;
//        int i = 1;
//        while (i <= n) {
//            fact *= i;
//            i++;
//        }
//
//        System.out.println(n + "! = " + fact);
//    }
//}
// EXRECICE 6
import java.util.Scanner;

public class TP2 {
	  public static void main(String[] args) {
	    int N = 10;
	    System.out.println("LES nombres premiers  entre 1 et  " + N + ":");
	    for (int i = 2; i <= N; i++) {
	      boolean estPremier = true;
	      for (int j = 2; j <= i / 2; j++) {
	        if (i % j == 0) {
	          estPremier = false;
	          break;
	        }
	      }
	      if (estPremier) {
	        System.out.print(i + " ");
	      }
	    }
	    System.out.println();
	  }
	}