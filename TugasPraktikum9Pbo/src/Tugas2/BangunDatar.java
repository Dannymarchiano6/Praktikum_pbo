package Tugas2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP F7-VIRUF
 */
public class BangunDatar {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga(4, 5);
        double luas = segitiga.hitungLuas();
        System.out.println("Luas segitiga: " + luas);

    }
}
