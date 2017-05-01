/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DRIVER_SISFOTA;

import MODEL_SISFOTA.Aplikasi;
import java.io.IOException;

/**
 *
 *
 */
public class DriverGUI {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Aplikasi apps = new Aplikasi();
        ControllerHome.home = new ControllerHome();
        apps.cekFile();
    }
}
