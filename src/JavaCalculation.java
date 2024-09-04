public class JavaCalculation {
    public static void main (String [] args) {

        JavaCalculation.FinalPlanCost(699);
        JavaCalculation.FinalBillAmount(399, 399);
        JavaCalculation.TaxAmount(85000);


    }

    // To calculate Final PlanCost
    public static void FinalPlanCost(double costOfPlan){

        double gst = 0.18d;

       double FinalCost =  costOfPlan + (costOfPlan*gst);

        System.out.println("The Cost of Plan = " + FinalCost);

    }

    public static void FinalBillAmount(double Pizza1, double Pizza2){

       double discount = 0.2d;

       double FinalBill =  (Pizza1+Pizza2) -((Pizza1+Pizza2)*discount);

       System.out.println ("The Final Bill Amount is =  " +             FinalBill);


    }

    public static void TaxAmount(double Salary){

        double tax = 0.2d;

        double TaxAmount = Salary * tax;

        double netPay = Salary - TaxAmount;

        System.out.println("The Tax Amount is " + TaxAmount);
        System.out.println("The Net Amount is " + netPay);

    }


}
