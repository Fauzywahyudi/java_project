/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cbr_malaria.model;

public class Penyakit {
    int id;
    String kode;
    String penyakit;
    String ket;
    String solusi;
    
    public String getKode(){
        return kode;
    }
    
    public String getPenyakit(){
        return penyakit;
    }
    
    public String getKet(){
        return ket;
    }
    
    public String getSolusi(){
        return solusi;
    }
    
    public int getId(){
        return id;
    }
    
    public void setKode(String kode){
       this.kode=kode;
    }
    public void setPenyakit(String penyakit){
       this.penyakit=penyakit;
    }
    public void setKet(String ket){
       this.ket=ket;
    }
    public void setSolusi(String solusi){
       this.solusi=solusi;
    }
    
    public void setId(int id){
        this.id=id;
    }
    
    public String toString(){
        return penyakit;
    }
}
