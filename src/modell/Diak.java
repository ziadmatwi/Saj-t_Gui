/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;
import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 *
 * @author MatwiZiad(Szf_N_2024
 */
public class Diak {
    
    private int id;
    private String targy;
    private int jegy;
    private boolean bukas;

    public Diak(String sor) {
        String [] adatok = sor.split(";");
        this.id = Integer.parseInt(adatok[0]);
        this.targy = adatok[1];
        this.jegy = Integer.parseInt(adatok[2]);
        this.bukas = Boolean.parseBoolean(adatok[3]);
    }

    public int getId() {
        return id;
    }

    public String getTargy() {
        return targy;
    }

    public int getJegy() {
        return jegy;
    }

    public boolean isBukas() {
        return bukas;
    }
    
    public String getBukasSzoveg(){
        if(bukas){
            return "Megbukott";
        }
        else{
            return "Átment";
        }
    }
    
   @Override
    public String toString() {
        return "Versenyzo{" + "id=" + id + ", targy=" + targy + ", jegy=" + jegy + ", bukas=" + bukas + '}';
    }
    
    
}
