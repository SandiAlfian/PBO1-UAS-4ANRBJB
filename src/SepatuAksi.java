/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER PC
 */
public class SepatuAksi {
    public static void main(String[] args) {
        
        Sepatu sepatu1 = new Sepatu();
        sepatu1.merk = "Patrobas Hawk";
        sepatu1.bahan = "Canvas";
        sepatu1.harga = 373000;
        sepatu1.ukuran = 40;
        
        sepatu1.diskon();
        sepatu1.cetakInfo();
        
        
        Sepatu sepatu2 = new Sepatu();
        sepatu2.merk = "Converse 70s Chuck Taylor";
        sepatu2.bahan = "Canvas";
        sepatu2.harga = 500000;
        sepatu2.ukuran = 40;
        
        sepatu2.diskon();
        sepatu2.cetakInfo();
    }
}
