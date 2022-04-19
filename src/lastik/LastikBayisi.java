/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lastik;

/**
 *
 * @author Oguzhan
 */
public class LastikBayisi {
    public static void main(String[] args) {
        AtractaLastikFabrikasi atractaLastikFabrikasi = new AtractaLastikFabrikasi();
        Lastik atractaLastik = atractaLastikFabrikasi.getLastik("atracta", 185, 70, 13);

        DriwaysLastikFabrikasi driwaysLastikFabrikasi = new DriwaysLastikFabrikasi();
        Lastik driwaysLastik = driwaysLastikFabrikasi.getLastik("driways", 195, 60, 15);

        System.out.println(atractaLastik);
        System.out.println(driwaysLastik);
    }
    
}
