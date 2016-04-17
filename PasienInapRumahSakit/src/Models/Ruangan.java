/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
/**
 *
 * @author AngkyMusa
 */
public class Ruangan implements Serializable{

    private String noRuang;
    private int nPasien;
    private int nKapasitas;
    private List<PasienInap> daftarPasien = new ArrayList<PasienInap>();

    public Ruangan(String noRuang, int n) {
        this.noRuang = noRuang;
        this.nKapasitas = n;
    }
    
    public Ruangan() {
     
    }
    
    public void tambahPasienInap(Pasien P, Dokter d) {
        if (nPasien < nKapasitas) {
            daftarPasien.add(new PasienInap(P));
            daftarPasien.get(nPasien).setDokter(d);
            nPasien++;
        } else {
            System.out.println("Ruangan penuh");
        }
    }

    public PasienInap getPasienInap(int n) {
        return daftarPasien.get(n);
    }

    public String getNoRuang() {
        return this.noRuang;
    }
    public int getnPasien() {
        return nPasien;
    }
    public int getKapasitas() {
        return daftarPasien.size();
    }
     public int getNKapasitas() {
        return nKapasitas;
    }
    public PasienInap getPasienInapById(String id) {
        PasienInap Pi = null;
        for (int i = 0; i < daftarPasien.size(); i++) {
            if (daftarPasien.get(i).getPasien().getIdPasien().equals(id)) {
                Pi = daftarPasien.get(i);
            }
        }
        return Pi;
    }

    public void setNoRuang(String noRuang) {
        this.noRuang = noRuang;
    }

    public void setDaftarPasien(List<PasienInap> daftarPasien) {
        this.daftarPasien = daftarPasien;
    }
    public void deletePasienInapById(String id) {
        for (int i = 0; i < daftarPasien.size(); i++) {
            if (daftarPasien.get(i).getPasien().getIdPasien().equals(id)) {
                daftarPasien.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        String s="";
        for (int i=0; i<nPasien; i++){
            s=s+("\n"+(i+1)+".")+daftarPasien.get(i).toString()+"\n";
        }
        return "noRuang= " + noRuang + "\nJumlah Pasien= " + nPasien + "\nJumlah Kapasitas= " + nKapasitas + s ;}
       

    public void setnPasien(int nPasien) {
        this.nPasien = nPasien;
    }

    public void setnKapasitas(int nKapasitas) {
        this.nKapasitas = nKapasitas;
    }
} 

