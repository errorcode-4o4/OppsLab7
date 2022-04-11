public class question01 {
    public static void main(String[] args) {
        int x = 100;
        Integer obj1 = Integer.valueOf(x);
        Integer obj2 = x;
        System.out.println("\nPrimitive to Wrapper Object Conversion : \n");
        System.out.println("(i.) int to Integer");
        System.out.println("Initial value : " + x);
        System.out.println("After Conversion : " + obj1);
        System.out.println("At Last : " + obj2);

        System.out.println("\n(ii.) boolean to Boolean");
        boolean b = true;
        Boolean obj3 = Boolean.valueOf(b);
        System.out.println("Initial value : " + b);
        System.out.println("After Conversion : " + obj3);

        System.out.println("\n(ii.) float to Float");
        float c = 1.2345f;
        Float obj4 = Float.valueOf(c);
        System.out.println("Initial value : " + c);
        System.out.println("After Conversion : " + obj4);

        System.out.println("\n(iii.) long to Long");
        long d = 1010101;
        Long obj5 = Long.valueOf(d);
        System.out.println("Initial value : " + d);
        System.out.println("After Conversion : " + obj5);

    }
}