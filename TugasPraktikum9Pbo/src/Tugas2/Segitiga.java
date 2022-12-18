package Tugas2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP F7-VIRUF
 */// Kelas Segitiga yang mewarisi dari kelas BangunDatar

class Segitiga extends BangunDatar{
  // Atribut
  protected double alas;
  protected double tinggi;

  // Konstruktor
  public Segitiga(double alas, double tinggi) {
    this.alas = alas;
    this.tinggi = tinggi;
  }

  // Method untuk menghitung luas segitiga
  protected double hitungLuas() {
    return (alas * tinggi) / 2;
  }
}
