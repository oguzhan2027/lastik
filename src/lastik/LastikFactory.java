/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lastik;

/**
 *
 * @author Oguzhan
 */
public interface LastikFactory {
    Lastik getLastik(String model,int genislik,int yukseklik,int jantcapi);
    
}
