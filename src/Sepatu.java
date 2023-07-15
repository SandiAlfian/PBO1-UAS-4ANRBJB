/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER PC
 */
public class Sepatu {
   String merk, bahan;
   double harga, ukuran;
   
   void diskon(){
       double diskon = this.harga * 0.10;
       this.harga = this.harga - diskon; 
   }
   
   void cetakInfo(){
        System.out.println("=========================");
        System.out.println("Merk :" + merk);
        System.out.println("Bahan : " + bahan);
        System.out.println("Harga : Rp." + harga);
        System.out.println("Ukuran : " + ukuran);
        System.out.println("=========================");
    }
}
