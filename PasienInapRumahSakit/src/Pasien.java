/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasieninaprumahsakit;
import java.io.*;
/**
 *
 * @author Elsa AW
 */
public class Pasien extends Orang implements Serializable{
    private String idPasien;
    private String waliPasien;
    private String alamat;
	
    public Pasien(String nama, char jenisKelamin, int umur, String idPasien, String waliPasien,String alamat){
        super(nama,jenisKelamin,umur);
	this.idPasien=idPasien;
	this.waliPasien=waliPasien;
        this.alamat=alamat;
    }

    public Pasien() {
        super();
    }
    
    public void setIdPasien(String idPasien) {
        this.idPasien = idPasien;
    }

    public void setWaliPasien(String waliPasien) {
        this.waliPasien = waliPasien;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getIdPasien() {
        return idPasien;
    }

    public String getWaliPasien() {
        return waliPasien;
    }

    public String getAlamat() {
        return alamat;
    }

    @Override
    public String toString() {
        return (super.toString()+ " \nidPasien= " + idPasien + "\nwaliPasien =" + waliPasien + "\nalamat= " + alamat);
    }
    
}

