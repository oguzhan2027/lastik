/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kategori;

/**
 *
 * @author oguzhan
 */
public class YazLastigi implements Kategori{
    private String LastikTuru;
    private String AracTipi;

    public YazLastigi(String LastikTuru, String AracTipi) {
        this.LastikTuru = LastikTuru;
        this.AracTipi = AracTipi;
    }

    public String getLastikTuru() {
        return LastikTuru;
    }

   @Override
    public String getAractipi() {
        return AracTipi; 
    }
    
    @Override
    public String toString() {
        return "YazLastigi{" + "LastikTuru=" + LastikTuru + ", AracTipi=" + AracTipi + '}';
    }

    
    
    
    
}
