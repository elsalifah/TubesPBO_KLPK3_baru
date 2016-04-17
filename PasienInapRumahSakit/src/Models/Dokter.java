/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.io.*;
/**
 *
 * @author ASUS PC
 */
public class Dokter extends Orang implements Serializable{

    private String idDokter;
    private String spesialis;
    private int jamKerja;
    /*
    private static int incIdD;
    
    public static String getOtomatisIdD(){
    return "D0"+incIdD;
    }
    public static int getO(){
        return incIdD;
    }
    public static void setO(int i){
        incIdD=i;
    }
    public static void setOtomatisIdD(){
        incIdD++;
    }
    public static void decOtomatisIdD(){
        incIdD--;
    }*/
    public Dokter(String idDokter, String spesialis, int jamKerja, String nama, char jenisKelamin, int umur) {
        super(nama, jenisKelamin, umur);
        this.idDokter = idDokter;
        this.spesialis = spesialis;
        this.jamKerja = jamKerja;
    }

    public Dokter() {
        super();
    }
    public String getIdDokter() {
        return idDokter;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setIdDokter(String idDokter) {
        this.idDokter = idDokter;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    @Override
    public String toString() {
        return (super.toString() + "\nidDokter = " + idDokter + "\nspesialis = " + spesialis + "\njamKerja = " + jamKerja);
    }

}
