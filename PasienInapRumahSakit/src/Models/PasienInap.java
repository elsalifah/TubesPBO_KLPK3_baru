/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS PC
 */
public class PasienInap implements Serializable{
    private Pasien pasien;
    private Dokter dokter;
	private List<String> diagnose = new ArrayList<String>();
	private int nDiagnose;
	
	public PasienInap(Pasien p){
		this.pasien = p;
                nDiagnose = 0;
	}
	
    public PasienInap() {
        
    }
    
	public void setDokter(Dokter d){
		this.dokter = d;
	}
	public void setPasien(Pasien p){
		this.pasien = p;
	}
	public Pasien getPasien(){
            return pasien;
        }
        public Dokter getDokter(){
            return this.dokter;
        }
	public void addDiagnosa(String d){
		diagnose.add(d);
		nDiagnose++;
	}
	
	public String getDiagnose(int i){
		return diagnose.get(i);
	}
	
	public void deleteDiagnose(int i){
		diagnose.remove(i);
	}
        public int getNDiagnose(){
            return diagnose.size();
        }

    @Override
    public String toString() {
        String s="";
        for (int i=0; i<nDiagnose; i++){
            s=s+"\n- "+diagnose.get(i);
        }
        return "Data Pasien Inap : " + "\nData Pasien :" + pasien.toString() + 
                "\nData Dokter= " + "\nID Dokter= "+dokter.getIdDokter()+"\n Nama Dokter= "+dokter.getNama()+
                "\nDaftar diagnose = " +s;
    }
        
}
