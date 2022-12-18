/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5;

/**
 *
 * @author DESKTOP F7-VIRUF
 */
public class Main {
    public static void main(String[] args) {
     Komik komik = new Komik("One Piece", "Eiichiro Oda");
     komik.getinfoproduk(); // Output: Judul: One Piece, Penulis: Eiichiro Oda

    Games games = new Games("Minecraft", "Markus Persson");
    games.getinfoproduk(); // Output: Judul: Minecraft, Penulis: Markus Persson
   
    }
}
