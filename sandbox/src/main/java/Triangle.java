public class Triangle
{
    public static void main(String[] args) {
        
        printTriangleArea(5.0, 4.2,2.4);




        

    }

    private static void printTriangleArea(double a, double b, double c) {
        System.out.println("S Triangle = " + TriangleArea(a, b, c ));
    }

    private static double TriangleArea(double a, double b, double c) {
        return a + b + c;
    }


}

