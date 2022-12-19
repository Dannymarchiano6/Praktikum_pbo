/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author DESKTOP F7-VIRUF
 */
class Produk {
    //Property yang ada pada kelas produk
    private String judul;
    private String penulis;
    
    //Constructor kelas produk
    public Produk(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }
    //method menampilkan informasi produk
    public void getInfoProduk(){
        System.out.println("judul"+this.judul);
        System.out.println("Penulis"+this.penulis);
    }
}
