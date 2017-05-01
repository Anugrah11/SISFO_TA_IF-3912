/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL_SISFOTA;

import MODEL_SISFOTA.Mahasiswa;

/**
 *
 * @author user
 */
public class Dosen extends Orang {
    private KelompokTA[] topikTA;
    private int status;
    Object getidDosen;

    public Dosen(String name, String id, String noHp, int status) {
        super(name, id, noHp);
        this.status = status;
        topikTA = new KelompokTA[5];
    }
    
    public void tambahAnggotaKelompok(KelompokTA k){
        for(int i = 0; i < topikTA.length ; i++){
            if(topikTA[i] == null){
                topikTA[i] = k;
            }
        }
    }
    
    
    public void deleteAnggotaKelompok(int i){
        topikTA[i] = null;
    }
    
    public KelompokTA getKelompokByIndex(int id){
        return topikTA[id];
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Dosen{" + "topikTA=" + topikTA + ", status=" + status + '}';
    }

    Object getid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
}
