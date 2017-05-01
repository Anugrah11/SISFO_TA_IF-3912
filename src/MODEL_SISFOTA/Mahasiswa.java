/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL_SISFOTA;

import java.util.Objects;

/**
 *
 * @author user
 */
public class Mahasiswa extends Orang{
    private TugasAkhir tugasAkhir;
    private String nim;
    private String nama;
    private boolean status;
    Object getNIM;
    
    public Mahasiswa (String nim, String nama, String alamat, String noHp, boolean status) {
        super(nama, alamat, noHp);
        this.nim = nim;
        this.status = true;
    }     
    
    public void createTA(String judul){
        this.tugasAkhir = new TugasAkhir(judul);
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void revisiJudulTA( String judulTA) {
        if (tugasAkhir == null) {
            tugasAkhir.setJudul(judulTA);
        } else {
        }
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (this.status ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mahasiswa other = (Mahasiswa) obj;

        return this.status == other.status;
    }
    
}