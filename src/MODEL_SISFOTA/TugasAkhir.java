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
public class TugasAkhir {
    
    private List <Dosen> pembimbing;
    private String judulTA;

    TugasAkhir(String judul) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setPembimbing (Dosen d)
    {
        pembimbing.add(d);
        
    }
    
    public Dosen getPembimbingbyindeks(int i)
    {
        return pembimbing.get(i);
    }
    
    public Dosen getPembimbingbykodedosen(String id, Dosen Dosen)
    {
         int status = 0;
        for (int i = 0; i < pembimbing.size(); i++) {
            if (pembimbing.get(i).getidDosen.equals(id)){
                return pembimbing.get(i);
            }
            else
            {
                status++;
            }
        }
        if (status == pembimbing.size())
        {
            return null;
        }
        return Dosen;
    }
    
    public String getJudulTA()
    {
        return judulTA;
    }
    
    public void setJudulTA (String judulTA)
    {
        this.judulTA = judulTA;
    }

    void setJudul(String judulTA) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
