/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL_SISFOTA;

import java.util.List;

public class Aplikasi {
    private List<Dosen> listDosen;
    private List<Mahasiswa> listMahasiswa;
    private List<KelompokTA> listKelompokTA;
     
    public void addMahasiswa(Mahasiswa m){
    if(!listMahasiswa.contains(m)){
      listMahasiswa.add(m);
    }
  }
  public Mahasiswa searchMahasiswa(String nim){
    for(int i=0;i<listMahasiswa.size();i++){
      if (listMahasiswa.get(i).getNim().equals(nim)){
        return listMahasiswa.get(i);
      }
    }
    return null;
  }
  public void deleteMahasiswa(String nim){
    for(int i=0;i<listMahasiswa.size();i++){
      if (listMahasiswa.get(i).getNim().equals(nim)){
        listMahasiswa.remove(i);
        return;
      }
    }
  }
  public void addDosen(Dosen d){
    if(!listDosen.contains(d)){
      listDosen.add(d);
    }
  }
  public Dosen searchDosen(String id){
    for(int i=0;i<listDosen.size();i++){
      if (listDosen.get(i).getid().equals(id)){
        return listDosen.get(i);
      }
    }
    return null;
  }
  public void deleteDosen(String id){
    for(int i=0;i<listDosen.size();i++){
      if (listDosen.get(i).getid().equals(id)){
        listDosen.remove(i);
        return;
      }
    }
  }
  
  public void addKelompok(KelompokTA k){
    if(!listKelompokTA.contains(k)){
      listKelompokTA.add(k);
    }
  }
  
  public KelompokTA searcKelompok(String nama){
    for(int i=0;i<listKelompokTA.size();i++){
      if (listKelompokTA.get(i).getNama().equals(nama)){
        return listKelompokTA.get(i);
      }
    }
    return null;
  }

    /**
     *
     * @param nama
     */
    public void deleteKelompok(String nama){
    for(int i=0;i<listKelompokTA.size();i++){
      if (listKelompokTA.get(i).getNama().equals(nama)){
        listKelompokTA.remove(i);
      }
    }
  }

    public void mainMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void cekFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 

