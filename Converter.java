import java.util.*;

public class Converter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inch: ");
        double inch = input.nextDouble();

        double meter = inch * 0.0254;

        System.out.printf("%.1f inch is %.1f meters", inch, meter);
    }
}
