/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;

/**
 *
 * @author DESKTOP F7-VIRUF
 */
public class Kucing extends Hewan {
  public Kucing(String name) {
    super(name);
  }

  // method display yang mengembalikan nama hewan
  public String display() {
    return "Nama kucing: " + getName();
  }
}
