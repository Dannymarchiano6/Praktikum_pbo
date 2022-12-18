/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5;



/**
 *
 * @author DESKTOP F7-VIRUF
 */
class Komik extends Produk {

    public Komik(String judul, String penulis) {
        super(judul, penulis);
    }
  public void getinfoproduk() {
    System.out.println("Judul: " + this.judul + ", Penulis: " + this.penulis);
  }
}