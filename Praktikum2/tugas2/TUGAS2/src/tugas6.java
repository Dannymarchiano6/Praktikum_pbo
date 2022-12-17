public class tugas6 {
    public static void main(String[] args) {
        double a = 6;
        double b = 8;

        //menghitung sisi segitiga dengan Pythagoras
        double c = Math.sqrt(a*a + b*b );
        System.out.println("Sisi miring segitiga adalah : " + c);

        //menghitung keliling segitiga
        double keliling = a + b + c;
        System.out.println("keliling segitiga adalah : " + keliling);
    }
}
