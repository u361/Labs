public class Ex9 {
    public static void main (String[] Args) {
        final double PRECISION = 0.001;
        double a=-10, b=10, c=0;

        while (b-a > PRECISION) {
            c = (a+b)/2;
            if(y(a)*y(c) > 0)
                a = c;
            if(y(b)*y(c) > 0)
                b = c;

            System.out.println(c);
        }
    }

    public static double y (double x) {
        return Math.pow((x-5), 3)+100*Math.sin(x);
    }
}