/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ürün;

/**
 *
 * @author AHMET FARUK
 */
public class AtractaLastikFabrikasi implements LastikFactory {

    @Override
    public Lastik getLastik(String model, int genislik, int yukseklik, int jantcapi) {
         return new AtractaLastik(model,genislik,yukseklik,jantcapi);

    }
    
}
