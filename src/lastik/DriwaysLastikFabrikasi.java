/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lastik;

/**
 *
 * @author AHMET FARUK
 */
public class DriwaysLastikFabrikasi implements LastikFactory{

    @Override
    public Lastik getLastik(String model, int genislik, int yukseklik, int jantcapi) {
         return new DriwaysLastik(model,genislik,yukseklik,jantcapi);
    }

   
    
}
