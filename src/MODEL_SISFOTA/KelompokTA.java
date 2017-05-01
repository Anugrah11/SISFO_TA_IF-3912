/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL_SISFOTA;

import java.util.List;

/**
 *
 * @author Asus
 */
public class KelompokTA {

    static int length;
    private String topik;
    private List<Mahasiswa> anggota;

    KelompokTA(String topik) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void addAnggota (Mahasiswa m)
    {
        anggota.add(m);
    }

    public String getTopik() {
        return topik;
    }

    public void setTopik(String topik) {
        this.topik = topik;
    }
       
    public boolean getAnggotabyindeks (int indeks)
    {
        anggota.get(indeks);
        return true;
    }
    
    public Mahasiswa getAnggotabyNIM (String NIM)
    {
        int status = 0;
        for (int i = 0; i < anggota.size(); i++) {
            if (anggota.get(i).getNIM.equals(NIM)){
                return anggota.get(i);
            }
            else
            {
                status++;
            }
        }
        if (status == anggota.size())
        {
            return null;
        }
        Mahasiswa Mahasiswa = null;
        return Mahasiswa;
    }
    
    public void removeAnggota (Mahasiswa m)
    {
        anggota.remove(m);
    }

    Object getNama() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
