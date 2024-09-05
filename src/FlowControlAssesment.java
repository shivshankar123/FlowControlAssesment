public class FlowControlAssesment {


    public static void main(String [] args){
        FlowControlAssesment.maxNum(1, 2);
        FlowControlAssesment.maxNum(20, 40);

    }

    public static void maxNum(int num1, int num2){
        if( num1>num2){
            System.out.println(num1 +" is greater than " +num2);
        } else {
            System.out.println(num2 + " is greater that " + num1);
        }

    }

