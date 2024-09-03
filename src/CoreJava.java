public class CoreJava {
    public static void main(String[] args){

        System.out.println("Hello");
        System.out.println("Ke gardai cha yoo");

        int a = 20;

        int b= 5;

        int c;

        c = a;
         a = b;

        System.out.println("Value of a " + a);
        System.out.println("Value of b " + c);

        System.out.println("**********************************");

        CoreJava.SwappingUsingTempVariables(7, 9);

        System.out.println("**********************************");

        CoreJava.SwapThreeNumbersUsingTempVariables(7, 9, 10);

        System.out.println("**********************************");

        CoreJava.SwapThreeNumbersWithoutUsingTempVariables(7, 9, 10);

        System.out.println("**********************************");
        CoreJava.SwapFourNumbersUsingTempVariables(7, 9, 10, 12);

        System.out.println("**********************************");
        CoreJava.SwapFourNumbersWithoutUsingTempVaraibles(7, 9, 10, 12 );




    }
    // swapping two numbers without using Temp variables
    private static void SwappingUsingTempVariables(int e, int f){
        e = e + f;
        f = e- f;
        e = e - f;

        System.out.println( "Value of e " + e);
        System.out.println("Value of f " + f);

    }


    private static void SwapThreeNumbersUsingTempVariables(int e, int f, int g) {

        int i;

        i = e;
        e = g;
        g = f;
        f = i;

        System.out.println("Value of e " + e);
        System.out.println("Value of f " + f);
        System.out.println("Value of g " + g);


    }

    private static void SwapThreeNumbersWithoutUsingTempVariables(int e, int f, int g){

        e = e + f + g;
        f = e - (f + g);
        g = e - (f + g);
        e = e - (f + g);

        System.out.println("Value of e " + e);
        System.out.println("Value of f " + f);
        System.out.println("Value of g " + g);
    }


    private static void SwapFourNumbersUsingTempVariables(int e , int f, int g, int h){

        int temp;
         temp = e;
         e = h;
         h = g;
         g = f;
         f = temp;

        System.out.println("Value of e " + e);
        System.out.println("Value of f " + f);
        System.out.println("Value of g " + g);
        System.out.println("Value of h " + h);

    }

    private static void SwapFourNumbersWithoutUsingTempVaraibles(int e, int f, int g, int h){

        e = e + f + g + h;

        f = e - (f + g+ h);

        g = e - ( f + g + h);

        h = e - ( f + g + h);

        e = e - (f + g+ h);

        System.out.println("Value of e " + e);
        System.out.println("Value of f " + f);
        System.out.println("Value of g " + g);
        System.out.println("Value of h " + h);
    }


}
