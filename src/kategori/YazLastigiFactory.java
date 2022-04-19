/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kategori;

/**
 *
 * @author AHMET FARUK
 */
public class YazLastigiFactory implements KategoriFactory {

    @Override
    public Kategori getKategori(String LastikTuru, String AracTipi) {
        return (Kategori) new YazLastigi(LastikTuru,AracTipi);

    }
    
}
