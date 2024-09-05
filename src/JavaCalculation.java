public class JavaCalculation {
    public static void main (String [] args) {

        JavaCalculation.FinalPlanCost(700);
        JavaCalculation.FinalBillAmount(399, 2);
        JavaCalculation.TaxAmount(85000);
        JavaCalculation.InterestAmount(65000,0.068, 5);


    }

    // To calculate Final PlanCost
    public static void FinalPlanCost(double costOfPlan){

        double gst = 0.18d;

       double FinalCost =  costOfPlan + (costOfPlan*gst);

        System.out.println("The Cost of Plan = " + FinalCost);

    }

    public static void FinalBillAmount(double Pizza, double numberofPiizza){

       double discount = 0.2d;

       double FinalBill =  numberofPiizza*((Pizza) -((Pizza)*discount));

       System.out.println ("The Final Bill Amount is =  " +             FinalBill);


    }

    public static void TaxAmount(double Salary){

        double tax = 0.2d;

        double TaxAmount = Salary * tax;

        double netPay = Salary - TaxAmount;

        System.out.println("The Tax Amount is " + TaxAmount);
        System.out.println("The Net Amount is " + netPay);

    }

    public static void InterestAmount(double Deposit, double Rate, double time){


        double InterestofAmount =  (Deposit + Rate + time)/100;

        double FinalAmount = InterestofAmount + Deposit;

        System.out.println(" The Interest Amount " + InterestofAmount );
        System.out.println ("The Final Amount " + FinalAmount);
    }


}
