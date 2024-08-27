
import java.util.*;

class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of all subjects out of 100");
        
        System.out.println("Enter the marks of OOP");
        int OOP = sc.nextInt();
        
        System.out.println("Enter the marks of DSA");
        int DSA = sc.nextInt();
        
        System.out.println("Enter the marks of LDCO");
        int LDCO = sc.nextInt();
        
        System.out.println("Enter the marks of DM");
        int DM = sc.nextInt();
        
        System.out.println("Enter the marks of BCN");
        int BCN = sc.nextInt();

        if (OOP > 35 && DSA > 35 && LDCO > 35 && DM > 35 && BCN > 35) {
            int Total = OOP + DSA + LDCO + DM + BCN;
            float Percentage = (float) Total*100 / 500;
            System.out.println("You get " + Percentage + "%");

            if (Percentage >= 90) {
                System.out.println("Grade: A+");
            } 
	    else if (Percentage >= 80) {
                System.out.println("Grade: A");
            } 
	    else if (Percentage >= 70) {
                System.out.println("Grade: B+");
            }
	    else if (Percentage >= 60) {
                System.out.println("Grade: B");
            }
	    else if (Percentage >= 45) {
                System.out.println("Grade: C");
            }
	    else if (Percentage >= 35) {
                System.out.println("Grade: D");
            }
	    else {
                System.out.println("You are Fail");
            }
        }
       	else {
		System.out.println("Percentage: ____");
            System.out.println("You are fail in the following subjects:");

            if (OOP <= 35) {
                System.out.println("OOP");
            }
            if (DSA <= 35) {
                System.out.println("DSA");
            }
            if (LDCO <= 35) {
                System.out.println("LDCO");
            }
            if (DM <= 35) {
                System.out.println("DM");
            }
            if (BCN <= 35) {
                System.out.println("BCN");
            }
        }
    }
}
