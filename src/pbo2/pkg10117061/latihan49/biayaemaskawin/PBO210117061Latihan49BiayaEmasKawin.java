/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan49.biayaemaskawin;

/**
 *
 * @author Notebook
 */
public class PBO210117061Latihan49BiayaEmasKawin {

  /**
 * Nama : Fachrian Harits P
 * NIM : 10117061
 * Kelas : IF-2
 * Deklarisi : Program ini untuk mengitung biaya emas kawin
 */
    public static void main(String[] args) {
        // TODO code application logic here
        Emas em = new Emas(15.7);
        System.out.println("Hitung Mahar Nikah");
        System.out.println("Harga Emas Saat ini Rp. " + em.getHarga() + " per gramnya");
        System.out.println("Emas yang ingin dibeli Hendi : " + em.getBerat() + " gram");
        System.out.println("Total biaya yang harus dikeluarkan Rp. " + em.hitungHargaEmas(em.getBerat(), em.getHarga()));
    }

}
