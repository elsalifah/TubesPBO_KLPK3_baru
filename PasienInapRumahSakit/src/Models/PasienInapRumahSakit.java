/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


import Controllers.ControllerUtama;
//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import;

/**
 *
 * @author AngkyMusa
 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

        
public class PasienInapRumahSakit {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*PasienInapRumahSakit pasienirs= new PasienInapRumahSakit();
        pasienirs.pasienirsAddress("");*/
//        Aplikasi apps= new Aplikasi();
//        apps.mainMenu();
       ControllerUtama Cu = new ControllerUtama();
//        Aplikasi app= new Aplikasi();
//        app.mainMenu();
        /*
        Dokter d1 = new Dokter("D001", "Bedah Digestif", 8, "dr. Ratna", 'P', 34);
        Pasien P1 = new Pasien("Miranda", 'P', 18, "P001", "Nani W","Bandung");
        Pasien P2 = new Pasien("Julia", 'P', 20, "P002", "Mirnawati","Jakarta");
        Ruangan[] daftarRuang = new Ruangan[10];
        Ruangan R1 = new Ruangan("VIP 1", 2);
        R1.tambahPasienInap(P1, d1);
        R1.tambahPasienInap(P2, d1);
        R1.getPasienInap(1).addDiagnosa("Sering sakit kepala");
        R1.getPasienInap(1).addDiagnosa("Nafsu makan berkurang");
        daftarRuang[0] = R1;
        System.out.println(d1.toString());
        System.out.println("----------");
        System.out.println(R1.toString());
        
        for (int i = 0; i < daftarRuang.length; i++) {
            if (daftarRuang[i] != null) {
                System.out.println("RUMAH SAKIT HIKMAH \nJumlah Ruangan : 10 \nDaftar ruang");
                System.out.println("No Ruang : " + daftarRuang[i].getNoRuang());
                System.out.println("Kapasitas : " + daftarRuang[i].getNKapasitas());
                for (int j = 0; j < daftarRuang[i].getKapasitas(); j++) {
                    System.out.println("Nama Pasien " + (j + 1) + ":  " + daftarRuang[i].getPasienInap(j).getPasien().getNama());
                    System.out.println("Nama Dokter : " + daftarRuang[i].getPasienInap(j).getDokter().getNama());
                    if (daftarRuang[i].getPasienInap(j).getNDiagnose() != 0) {
                        for (int k = 0; k < daftarRuang[i].getPasienInap(j).getNDiagnose(); k++) {
                            System.out.println("Diagnose " + (k + 1) + " : " + daftarRuang[i].getPasienInap(j).getDiagnose(k));
                        }
                    } else {
                        System.out.println("Belum ada Diagnosa");
                    }
                }
            }
        }
        //skenario testing 
        System.out.println("----------------------------------------");
        System.out.println("Nama Pasien : " + R1.getPasienInapById("P002").getPasien().getNama());
        System.out.println("Diagnose dgn index 1 : " + R1.getPasienInapById("P002").getDiagnose(1));
        R1.getPasienInapById("P002").deleteDiagnose(0);
        R1.deletePasienInapById("P001");
        System.out.println("----------------------------------------");
        for (int i = 0; i < daftarRuang.length; i++) {
            if (daftarRuang[i] != null) {
                System.out.println("RUMAH SAKIT HIKMAH \nJumlah Ruangan : 10 \nDaftar ruang");
                System.out.println("No Ruang : " + daftarRuang[i].getNoRuang());
                System.out.println("Kapasitas : " + daftarRuang[i].getNKapasitas());
                for (int j = 0; j < daftarRuang[i].getKapasitas(); j++) {
                    System.out.println("Nama Pasien " + (j + 1) + ":  " + daftarRuang[i].getPasienInap(j).getPasien().getNama());
                    System.out.println("Nama Dokter : " + daftarRuang[i].getPasienInap(j).getDokter().getNama());
                    if (daftarRuang[i].getPasienInap(j).getNDiagnose() != 0) {
                        for (int k = 0; k < daftarRuang[i].getPasienInap(j).getNDiagnose(); k++) {
                            System.out.println("Diagnose " + (k + 1) + " : " + daftarRuang[i].getPasienInap(j).getDiagnose(k));
                        }
                    } else {
                        System.out.println("Belum ada Diagnosa");
                    }
                }
            }
        }
        */
        
    }
}
