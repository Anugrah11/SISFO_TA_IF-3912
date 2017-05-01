/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL_SISFOTA;

public abstract class Orang {
    private String name;
    private String id;
    private String noHp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Orang(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Orang(String name, String id, String noHp) {
        this.name = name;
        this.id = id;
        this.noHp = noHp;
    }
    
    
}
