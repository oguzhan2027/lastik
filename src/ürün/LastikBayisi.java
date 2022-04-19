/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ürün;

import kategori.Kategori;
import kategori.KisLastigiFactory;
import kategori.YazLastigiFactory;

/**
 *
 * @author Oguzhan
 */
public class LastikBayisi {
    public static void main(String[] args) {
        KisLastigiFactory kisLastigiFactory = new KisLastigiFactory();
        Kategori kisLastigi = kisLastigiFactory.getKategori("Kış lastiği", "Suv");
        
        YazLastigiFactory yazLastigiFactory = new YazLastigiFactory(); 
        Kategori yazLastigi = yazLastigiFactory.getKategori("yaz lastiği", "binek");
        
        System.out.println(kisLastigi);
        System.out.println(yazLastigi);
        
        AtractaLastikFabrikasi atractaLastikFabrikasi = new AtractaLastikFabrikasi();
        Lastik atractaLastik = atractaLastikFabrikasi.getLastik("atracta", 185, 70, 13);

        DriwaysLastikFabrikasi driwaysLastikFabrikasi = new DriwaysLastikFabrikasi();
        Lastik driwaysLastik = driwaysLastikFabrikasi.getLastik("driways", 195, 60, 15);

        System.out.println(atractaLastik);
        System.out.println(driwaysLastik);

        
        
    }
    
}
