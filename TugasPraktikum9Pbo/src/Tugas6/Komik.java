/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author DESKTOP F7-VIRUF
 */
class Komik extends Produk {
    //properti tambahan pada kelas
    
    private int jumlahHalaman;
    
    //Constructor kelas Komik
    public Komik(String judul, String penulis, int jumlahHalaman){
        super(judul,penulis);
        this.jumlahHalaman = jumlahHalaman;
    }
    //Method untuk menampilkan informasi
    @Override
    public void getInfoProduk(){
        super.getInfoProduk();
        
        System.out.println("Jumlah halaman :" + this.jumlahHalaman);
    }
}
