package Tugas1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP F7-VIRUF
 */
public class Main {
    public static void main(String[] args) {
        HewanBerkakiDua kanguru = new HewanBerkakiDua();
    System.out.println("Jumlah kaki kanguru: " + kanguru.getNumLegs());

        HewanBerkakiEmpat kucing = new HewanBerkakiEmpat();
    System.out.println("Jumlah kaki kucing: " + kucing.getNumLegs());

        HewanBerkakiEnam capung = new HewanBerkakiEnam();
    System.out.println("Jumlah kaki capung: " + capung.getNumLegs());

        HewanBerkakiDelapan kepiting = new HewanBerkakiDelapan();
    System.out.println("Jumlah kaki kepiting: " + kepiting.getNumLegs());

    }
}
