/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lastik;

/**
 *
 * @author AHMET FARUK
 */
public class AtractaLastik implements Lastik{
    
    private String model;
    private int genislik;
    private int yukseklik;
    private int jantcapi;

    public AtractaLastik(String model, int genislik, int yukseklik, int jantcapi) {
        this.model = model;
        this.genislik = genislik;
        this.yukseklik = yukseklik;
        this.jantcapi = jantcapi;
    }
    
    

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getGenislik() {
        return genislik;
    }

    @Override
    public int getYukseklik() {
        return yukseklik;
    }

    @Override
    public int getJantCapi() {
        return jantcapi;
    }

    @Override
    public String toString() {
        return "AtractaLastik{" + "model=" + model + ", genislik=" + genislik + ", yukseklik=" + yukseklik + ", jantcapi=" + jantcapi + '}';
    }
    
    
}
