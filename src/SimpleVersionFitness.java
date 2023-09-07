import java.util.Scanner;

public class SimpleVersionFitness {
    public static void main(String[] args) {
        new SimpleVersionFitness().run();
    }

    public void run() {

        Scanner keyboard = new Scanner(System.in);

        int originalFitnessprice = 300;
        double newDiscountPrice;
        double newStudentDiscountPrice = 0;

        System.out.println("Please answer the following statements to calculate your discounts: ");

        System.out.println("Are you a passive member of our gym? ");
        String passiveMember = keyboard.nextLine();
        if (passiveMember.equals("yes")){
            System.out.println("Your price is " + calculatePassiveMember(originalFitnessprice) + " DKK per month");
        }

        System.out.println("Are you currently a student? ");
        String currentlyStudent = keyboard.nextLine();
        if (currentlyStudent.equals("yes")) {
            newStudentDiscountPrice = (calculateStudentDiscount(originalFitnessprice));
            System.out.println(newStudentDiscountPrice + " DKK");
        }
        newDiscountPrice = (calculateStudentDiscount(originalFitnessprice));


        System.out.println("Are you currently a senior citizen? ");
        String currentlySenior = keyboard.nextLine();
        if (currentlySenior.equals("yes")) {
            newDiscountPrice = (calculateSeniorDiscount(originalFitnessprice));
                    System.out.println(newDiscountPrice + " DKK");
        }
        newDiscountPrice = (calculateSeniorDiscount(originalFitnessprice));

        System.out.println("How many months have you been subscribed to our gym? ");
        int monthsSubbed = keyboard.nextInt();
        if (monthsSubbed==3 && currentlySenior.equals("yes")){
            System.out.println(calculateMonthsSubbed(newDiscountPrice,monthsSubbed));
        } else if (monthsSubbed==3 && currentlyStudent.equals("yes")) {
            System.out.println(calculateMonthsSubbed(newStudentDiscountPrice,monthsSubbed));
        } else if (monthsSubbed==6 && currentlySenior.equals("yes")) {
            System.out.println(calculateMonthsSubbed(newDiscountPrice,monthsSubbed));
        } else if (monthsSubbed==6 && currentlyStudent.equals("yes")) {
            System.out.println(calculateMonthsSubbed(newDiscountPrice,monthsSubbed));
        }

        /*
        Mangler stadig årsdag rabat og hvert 12.måneds rabat
         */

    }

    public double calculateStudentDiscount(double originalFitnessPrice) {
        return (originalFitnessPrice * 0.6);
    }

    public double calculateSeniorDiscount(double originalFitnessPrice) {
        return (originalFitnessPrice * 0.80);
    }

    public double calculateMonthsSubbed(double originalFitnessPrice, double monthsSubbed) {
        if (monthsSubbed == 3) {
            originalFitnessPrice =originalFitnessPrice * 0.95;
        }
        if (monthsSubbed == 6) {
            originalFitnessPrice = originalFitnessPrice * 0.9;
        }
        return originalFitnessPrice;
    }

    public int calculatePassiveMember(int passivePrice){
        return passivePrice = 25;
    }


}
