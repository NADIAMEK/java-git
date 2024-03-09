// EXERCICE 1
//	import java.util.Scanner;
//
//	public class TP4 {
//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//
//	        System.out.print("Entrer un entier positif : ");
//	        int n = scanner.nextInt();
//
//	        System.out.print("Diviseurs: ");
//	        int count = 0;
//	        int sum = 0;
//	        for (int i = 1; i <= n; i++) {
//	            if (n % i == 0) {
//	                System.out.print(i + " ");
//	                count++;
//	                sum += i;
//	            }
//	        }
//
//	        System.out.println("\nnombre des diviseurs : " + count);
//	        System.out.println(" la somme des diviseurs : " + sum);
//	    }
//	}
// EXERCICE 2 
//	import java.util.Scanner;
//
//	public class TP4 {
//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//
//	        System.out.print("Entrer heure: ");
//	        int heure = scanner.nextInt();
//
//	        System.out.print("Entrer minutes: ");
//	        int minutes = scanner.nextInt();
//
//	        minutes++;
//	        if (minutes == 60) {
//	            minutes = 0;
//	            heure++;
//	            if (heure == 24) {
//	                heure = 0;
//	            }
//	        }
//
//	        System.out.println("il sera " + heure + " heure(s) " + minutes + " minute(s) .");
//	    }
//	}
// EXERCICE 3
//	import java.util.Scanner;
//
//	public class TP4  {
//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//
//	        System.out.print("Entrer un entier positif: ");
//	        int n = scanner.nextInt();
//
//	        int sum = 0;
//	        for (int i = 1; i < n; i++) {
//	            if (n % i == 0) {
//	                sum += i;
//	            }
//	        }
//
//	        if (sum == n) {
//	            System.out.println(n + " est un entier parfait .");
//	        } else {
//	            System.out.println(n + " est un entier imparfait .");
//	        }
//	    }
//	}
// EXERCICE 4
//	import java.util.Scanner;
//
//	public class TP4{
//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//
//	        System.out.print("Entrer le premier entier : ");
//	        int n = scanner.nextInt();
//
//	        System.out.print("Entrer le second entier: ");
//	        int m = scanner.nextInt();
//
//	        int sumN = 0;
//	        for (int i = 1; i < n; i++) {
//	            if (n % i == 0) {
//	                sumN += i;
//	            }
//	        }
//
//	        int sumM = 0;
//	        for (int i = 1; i < m; i++) {
//	            if (m % i == 0) {
//	                sumM += i;
//	            }
//	        }
//
//	        if (sumN == m && sumM == n) {
//	            System.out.println(n + " et " + m + " sont des nombres amis .");
//	        } else {
//	            System.out.println(n + " et  " + m + "ne sont pas des nombres amis.");
//	        }
//	    }
//	}
// EXERCICE 5
//	import java.util.Scanner;
//
//	public class TP4 {
//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//
//	        int[] buts = new int[22];
//	        for (int i = 0; i < 29)
//	    }
//}
// EXERCICE 6
//	import java.util.Scan
//	
//	public class TP4 {
//public static void main(String[] args) {
//	Scanner scanner = new Scanner(System.in);
//	System.out.print("Entrer age : ");
//	        		        
//int age = scanner.nextInt();
//System.out.print("Entrer le sexe (M for masculin, F for feminin): ");
//	        		        
//char sexe = scanner.next().charAt(0);
//boolean isimposable = false;
//	        		        
//if (sexe == 'M' && age > 20) {
//
//isimposable = true;
// } else if (sexe == 'F' && age >= 18 && age <= 35) {
//	       isimposable = true;
//	        		        }
//
// if (isimposable) {
//	  System.out.println("habitant est imposable.");
//	 } else {
// System.out.println("habitant est non imposable .");
//  }
// }
//}
