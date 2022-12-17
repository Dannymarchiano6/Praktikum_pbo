public class tugas9 {
    public static void main(String[] args) {
        double c = 10;
    double f = 15;
    double r = 5;

    // Konversi celcius ke fahrenheit
    double fahrenheit = (9.0/5.0 * c) + 32;
    System.out.println(c + " celcius = " + fahrenheit + " fahrenheit");

    // Konversi celcius ke reamur
    double reamur = 4.0/5.0 * c;
    System.out.println(c + " celcius = " + reamur + " reamur");

    // Konversi fahrenheit ke celcius
    c = (5.0/9.0 * (f - 32));
    System.out.println(f + " fahrenheit = " + c + " celcius");

    // Konversi fahrenheit ke reamur
    reamur = 4.0/9.0 * (f - 32);
    System.out.println(f + " fahrenheit = " + reamur + " reamur");

    // Konversi reamur ke fahrenheit
    f = (9.0/4.0 * r) + 32;
    System.out.println(r + " reamur = " + f + " fahrenheit");

    // Konversi reamur ke celcius
    c = 5.0/4.0 * r;
    System.out.println(r + " reamur = " + c + " celcius");
    }
}
