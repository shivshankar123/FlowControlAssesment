public class FlowControlAssesment {


    public static void main(String[] args) {
        String seperator = "-".repeat(25);
        FlowControlAssesment.maxNum(1, 2);
        System.out.println(seperator);
        FlowControlAssesment.maxNum(20, 40);
        System.out.println(seperator);
        FlowControlAssesment.maxNumAmongThree(10, 20, 30);
        System.out.println(seperator);
        FlowControlAssesment.isNumberDivisible(51, 5);
        System.out.println(seperator);
        FlowControlAssesment.isNumberDivisible(55, 11);
        System.out.println(seperator);
        FlowControlAssesment.isNumberEvenOrOdd(51);
        System.out.println(seperator);
        FlowControlAssesment.isNumberEvenOrOdd(100);
        System.out.println(seperator);



    }

    public static void maxNum(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num2 + " is greater that " + num1);
        }


    }
    //  3. Java Program to check whether a given number is divisible by 3 or not using if-else.
    public static void maxNumAmongThree(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3 ){
            System.out.println(num1 + " is greater than " + num2 + " and " + num3 );
        } else if (num2 > num1 && num2 > num3){
            System.out.println(num2 + " is greater than " + num1 + " and " + num3 );
        } else {
            System.out.println(num3 + " is greater than " + num1 + " and " + num2);
        }

    }
    // Java Program to check whether a given number is divisible by 5 or not using if-else.

    public static void isNumberDivisible(int num, int div){
        if (num%div ==0) {
            System.out.println(num + " is divisible by " + div);
        } else{
            System.out.println(num +  " is not is divisible by " + div);
        }
    }
//    6. Java Program to check whether a given number is even or odd using if-else.
    public static void isNumberEvenOrOdd(int num){
        if (num%2 ==0){
            System.out.println(num + " is even number");
        } else System.out.println(num + " is odd number");
    }

}

