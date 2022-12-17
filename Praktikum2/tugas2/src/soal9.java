public class soal9 {
    public static void main(String[] args) {
        System.out.println("Program Java Konversi suhu");
        System.out.println("===========================");
        System.out.println();
        
        double celc, fahr, ream;
        
        System.out.println("Hasil konversi  : ");
        
        
        fahr = (9.0/5.0 * 10) + 32;
        ream = (4.0/5.0 * 10);
        celc = 5.0/9.0 * (15 - 32);
        ream = 4.0/9.0 * (15 - 32);
        fahr = (9.0/4.0 * 5) + 32;
        celc = 5.0/4.0 * 5;
        
        System.out.println( celc + "derajat celcius = " + fahr +"derajat Fahrenheit");
        System.out.println( celc + "derajat celcius = " + ream +"derajat Reamur");
        System.out.println( fahr + "derajat Fahrenheit = " + celc +"derajat Celcius");
        System.out.println( fahr + "derajat Fahreinheit = " + ream +"derajat Reamur");
        System.out.println( ream + "derajat Reamur = " + fahr +"derajat Fahrenheit");
        System.out.println( ream + "derajat Reamur = " + celc +"derajat Celcius");
    }
}
