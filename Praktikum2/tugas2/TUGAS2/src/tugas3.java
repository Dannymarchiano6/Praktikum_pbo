public class tugas3 {
    public static void main(String[] args) {
        // Nilai a, b, dan c

        double a = 2;
        double b = 10;
        double c = 5;

        // Hitung pk = b^2 - 4ac
        double pk = Math.pow(b, 2) - 4 *a*c;

        //Cetak hasil
        System.out.println("Nilai pk = "+pk);
    }
}
