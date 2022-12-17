public class tugas8 {
    public static void main(String[] args) {
        double jarakBumiKeBulan = 384.000; // dalam km
        double jarakBumiKeMatahari = 152.1e6; // dalam km
        double kecepatanCahaya = 300.000; // dalam km/s
    
        // Menghitung waktu tempuh dari bumi sampai ke bulan
        double waktuTempuhBulan = jarakBumiKeBulan / kecepatanCahaya;
        System.out.println("Waktu tempuh dari bumi sampai ke bulan adalah: " + waktuTempuhBulan + " detik");
    
        // Menghitung waktu tempuh dari bumi sampai ke matahari
        double waktuTempuhMatahari = jarakBumiKeMatahari / kecepatanCahaya;
        System.out.println("Waktu tempuh dari bumi sampai ke matahari adalah: " + waktuTempuhMatahari + " detik");
    }
}
