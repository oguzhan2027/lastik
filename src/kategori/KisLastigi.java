/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kategori;

/**
 *
 * @author AHMET FARUK
 */
public class KisLastigi implements Kategori{
    
    private String LastikTuru;
    private String AracTipi;

    public KisLastigi(String LastikTuru, String AracTipi) {
        this.LastikTuru = LastikTuru;
        this.AracTipi = AracTipi;
    }
    
    


    @Override
    public String getLastikTuru() {
        return LastikTuru;
    }

    @Override
    public String getAractipi() {
        return AracTipi;
    }

    @Override
    public String toString() {
        return "KisLastigi{" + "LastikTuru=" + LastikTuru + ", AracTipi=" + AracTipi + '}';
    }
    
    
    
    
}
