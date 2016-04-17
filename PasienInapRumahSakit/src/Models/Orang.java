/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;

/**
 *
 * @author Elsa AW
 */
public abstract class Orang implements Serializable{
    private String nama;
    private char jenisKelamin;
    private int umur;
    
    public Orang(String nama, char jenisKelamin, int umur){
            this.nama=nama;
            this.jenisKelamin=jenisKelamin;
            this.umur=umur;
    }

    public Orang() {
    }
    
    

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public String getNama() {
        return nama;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public int getUmur() {
        return umur;
    }

    @Override
    public String toString() {
        return ("\nnama= " + nama + "\njenisKelamin= " + jenisKelamin + "\numur= " + umur);
    }
}
