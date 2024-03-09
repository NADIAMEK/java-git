//EXERCICE 1 
//public class TP3{
//  public static void main(String[] args) {
//    String[] words = {"NADIA", "HANNA", "OMAR", "FATIMA"};
//    System.out.println("LES elements du tableau :");
//    for (int i = 0; i < words.length; i++) {
//      System.out.println("words[" + i + "] = " + words[i]);
//    }
//  }
//}
//EXERCICE 2 
//import java.util.Scanner;
//
//public class TP3 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Entrer 10 elements pour remplir le tableau:");
//        int[] tabl = new int[10];
//        
//        for (int i = 0; i < tabl.length; i++) {
//            System.out.print("Entrer element " + (i + 1) + ": ");
//            tabl [i] = scanner.nextInt();
//        }
//
//        System.out.println("les elements du tableau :");
//        for (int i = 0; i < tabl.length; i++) {
//            System.out.println("Element " + (i + 1) + ": " + tabl[i]);
//        }
//    }
//}
// EXERCICE 3
//import java.util.Scanner;
//
//public class TP3 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Entrer la taille du tableau (10-50): ");
//        int n = scanner.nextInt();
//        while (n < 10 || n > 50) {
//            System.out.print("SVP entrer la taille entre 10 and 50: ");
//            n = scanner.nextInt();
//        }
//
//        int[] t = new int[n];
//        System.out.println("Entrer " + n + " nombres:");
//        for (int i = 0; i < n; i++) {
//            System.out.print("Element " + (i + 1) + ": ");
//            t[i] = scanner.nextInt();
//        }
//        System.out.println("elements du tableau:");
//        for (int i = 0; i < n; i++) {
//            System.out.println("t[" + i + "] = " + t[i]);
//        }
//    }
//}
// EXERCICE 4
//import java.util.Scanner;
//
//public class TP3 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Entrer la taille du tableau (10-50): ");
//        int n = scanner.nextInt();
//
//        while (n < 10 || n > 50) {
//            System.out.print("SVP entrer une taille entre 10 and 50: ");
//            n = scanner.nextInt();
//        }
//        int[] t = new int[n];
//        System.out.println("Entrer " + n + " nombres:");
//        for (int i = 0; i < n; i++) {
//            System.out.print("Element " + (i + 1) + ": ");
//            t[i] = scanner.nextInt();
//        }
//        System.out.println("les elements du tableau:");
//        for (int i = 0; i < n; i++) {
//            System.out.println("t[" + i + "] = " + t[i]);
//        }
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            if (t[i] == 5) {
//                count++;
//            } else {
//                t[i - count] = t[i];
//            }
//        }
//        System.out.println(" elements resultat sont :");
//        for (int i = 0; i < n - count; i++) {
//            System.out.println("t[" + i + "] = " + t[i]);
//        }
//    }
//}
// EXERCICE 6
//import java.util.Scanner;
//
//public class TP3 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Entrer la taille du tableau : ");
//        int n = scanner.nextInt();
//        int[] t = new int[n];
//        
//        System.out.println("Entrer " + n + " nombres :");
//        for (int i = 0; i < n; i++) {
//            System.out.print("Element " + (i + 1) + ": ");
//            t[i] = scanner.nextInt();
//        }
//
//        System.out.println("tableau original:");
//        for (int i = 0; i < n; i++) {
//            System.out.println("t[" + i + "] = " + t[i]);
//        }
//
//        int[] tp = new int[n];
//        int[] tn = new int[n];
//        int tpCount = 0;
//        int tnCount = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (t[i] > 0) {
//                tp[tpCount++] = t[i];
//            } else if (t[i] < 0) {
//                tn[tnCount++] = t[i];
//            }
//        }
//
//        System.out.println("valaur positifs :");
//        for (int i = 0; i < tpCount; i++) {
//            System.out.println("tp[" + i + "] = " + tp[i]);
//        }
//
//        System.out.println("valeurs negative:");
//        for (int i = 0; i < tnCount; i++) {
//            System.out.println("tn[" + i + "] = " + tn[i]);
//        }
//    }
//}
//EXERCICE 7
//import java.util.Scanner;
//import java.util.Arrays;
//
//public class TP3 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Entrer la taille du tableau : ");
//        int n = scanner.nextInt();
//        
//        int[] t = new int[n];
//        System.out.println("Entrer " + n + " :");
//        for (int i = 0; i < n; i++) {
//            System.out.print("t[" + i + "] = ");
//            t[i] = scanner.nextInt();
//        }
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += t[i];
//        }
//        System.out.println("Sum = " + sum);
//        double avg = (double) sum / n;
//        System.out.println("Average = " + avg);
//
//        int[] t2 = new int[n];
//        System.arraycopy(t, 0, t2, 0, n);
//        System.out.println("tableauT2: " + Arrays.toString(t2));
//        Arrays.sort(t);
//
//        System.out.println(": " + Arrays.toString(t));
//    }
//}
// EXERCICE 8
import java.util.Scanner;

public class TP3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer la taille du tableau : ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Entrer les elements du tableau :");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int diff = Math.abs(arr[i] - arr[j]);
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }
        }

        System.out.println("le plus grand ecart est : " + maxDiff);
    }
}