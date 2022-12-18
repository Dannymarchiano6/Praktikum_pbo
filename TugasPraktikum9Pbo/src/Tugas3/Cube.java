package Tugas3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP F7-VIRUF
 */
public class Cube  extends Bangundatar{
  // tingkat akses private untuk menyimpan sisi kubus
  private double sideLength;

  // konstruktor untuk menentukan sisi kubus
  public Cube(double sideLength) {
    this.sideLength = sideLength;
  }

  // metode tingkat akses public untuk menghitung volume kubus
  public double getVolume() {
    return Math.pow(sideLength, 3);
  }
}
