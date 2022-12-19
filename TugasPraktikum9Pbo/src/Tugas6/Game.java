/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author DESKTOP F7-VIRUF
 */
class Game extends Produk {
    //properti tambahan yang ada pada kelas 
    private int waktuMain;
    
    //Constructor kelas game
    public Game(String judul, String penulis, int waktuMain){
        super(judul, penulis);
        this.waktuMain = waktuMain;
    }
    //method menampilkan informasi produk diperluas dari kelas produk
    public void getInforProduk(){
        super.getInfoProduk();
        
        System.out.println("Waktu main : " + this.waktuMain + " jam");
    }
}
