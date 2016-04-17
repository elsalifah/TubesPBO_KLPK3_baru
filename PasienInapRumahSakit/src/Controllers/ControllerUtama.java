/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Dokter;
import Models.Pasien;
import Models.Ruangan;
import Views.MENU;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AngkyMusa
 */
public class ControllerUtama implements ActionListener {

    Aplikasi App = new Aplikasi();
    MENU M;
    // Aplikasi App = new Aplikasi();
    private static ArrayList<Dokter> daftarDokter = new ArrayList<Dokter>();
    private static ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();
    private static ArrayList<Ruangan> daftarRuangan = new ArrayList<Ruangan>();
    private Dokter d2;
    private Object jTable;

    public ControllerUtama() {
        M = new MENU();
        M.addListener(this);
        M.setVisible(true);
        daftarDokter = App.bacaDokter();
        daftarPasien = App.bacaPasien();
        String ID;
        Dokter d2;
        daftarRuangan = App.bacaRuangan();

    }

    public Dokter getDokterById(String id) {
        Dokter d1 = null;
        for (Dokter daftarDokter1 : daftarDokter) {
            if (daftarDokter1.getIdDokter().equals(id)) {
                d1 = daftarDokter1;
            }
        }
        return d1;
    }

    public void deleteDokterById(String id) {
        for (int i = 0; i < daftarDokter.size(); i++) {
            if (daftarDokter.get(i).getIdDokter().equals(id)) {
                daftarDokter.remove(i);
            }
        }
    }

    public void addDokter(Dokter d) {
        daftarDokter.add(d);
    }

    public void addPasien(Pasien p) {
        daftarPasien.add(p);
    }

    public void addRuangan(Ruangan r) {
        daftarRuangan.add(r);
    }

    public Dokter getDokter(int idD) {
        return daftarDokter.get(idD);
    }

    public Pasien getPasienById(String id) {
        Pasien p1 = null;
        for (Pasien daftarPasien1 : daftarPasien) {
            if (daftarPasien1.getIdPasien().equals(id)) {
                p1 = daftarPasien1;
            }
        }
        return p1;
    }

    public Pasien getPasien(int idP) {
        return daftarPasien.get(idP);
    }

    public Ruangan getRuanganByNoRuang(String id) {
        Ruangan R1 = null;
        for (Ruangan daftarRuangan1 : daftarRuangan) {
            if (daftarRuangan1.getNoRuang().equals(id)) {
                R1 = daftarRuangan1;
            }
        }
        return R1;
    }

    public Ruangan getRuangan(int idR) {
        return daftarRuangan.get(idR);
    }

    public void deleteDokter(int idD) {
        daftarDokter.remove(idD);
    }

    public void deletePasienById(String id) {
        for (int i = 0; i < daftarPasien.size(); i++) {
            if (daftarPasien.get(i).getIdPasien().equals(id)) {
                daftarPasien.remove(i);
            }
        }
    }

    public void deletePasien(int idP) {
        daftarPasien.remove(idP);
    }

    public void deleteRuanganByNoRuang(String id) {
        for (int i = 0; i < daftarRuangan.size(); i++) {
            if (daftarRuangan.get(i).getNoRuang().equals(id)) {
                daftarRuangan.remove(i);
            }
        }
    }

    public void deleteRuangan(int idR) {
        daftarRuangan.remove(idR);
    }

    public void setViewAddD() {

        for (int i = 0; i < daftarDokter.size(); i++) {
            M.getTabelAddD().setValueAt(daftarDokter.get(i).getIdDokter(), i, 0);
            M.getTabelAddD().setValueAt(daftarDokter.get(i).getNama(), i, 1);
            M.getTabelAddD().setValueAt(daftarDokter.get(i).getJenisKelamin(), i, 2);
            M.getTabelAddD().setValueAt(daftarDokter.get(i).getUmur(), i, 3);
            M.getTabelAddD().setValueAt(daftarDokter.get(i).getJamKerja(), i, 4);
            M.getTabelAddD().setValueAt(daftarDokter.get(i).getSpesialis(), i, 5);
        }for (int i = daftarDokter.size(); i < 60; i++) {
            M.getTabelAddD().setValueAt("", i, 0);
            M.getTabelAddD().setValueAt("", i, 1);
            M.getTabelAddD().setValueAt("", i, 2);
            M.getTabelAddD().setValueAt("", i, 3);
            M.getTabelAddD().setValueAt("", i, 4);
            M.getTabelAddD().setValueAt("", i, 5);}
    }
    

    public void setViewAddR() {

        for (int i = 0; i < daftarRuangan.size(); i++) {
            M.getTabelVR().setValueAt(daftarRuangan.get(i).getNoRuang(), i, 0);
            M.getTabelVR().setValueAt(daftarRuangan.get(i).getNKapasitas(), i, 1);
        }
        for (int i = daftarRuangan.size(); i < 60; i++) {
            M.getTabelVR().setValueAt("", i, 0);
            M.getTabelVR().setValueAt("", i, 1);
        }
    }

    public void setHasilDelD(Dokter D) {
        M.getTxAreaDelD().setText("");
        M.getTxAreaDelD().append("ID DOKTER : " + D.getIdDokter() + "\n"
                + "NAMA : " + D.getNama() + "\n"
                + "JENIS KELAMIN : " + D.getJenisKelamin()
                + "\nUMUR : " + D.getUmur() + "\n"
                + "JAM KERJA : " + D.getJamKerja() + "\n"
                + "SPESIALIS : " + D.getSpesialis());
    }

    public void setHasilDelP(Pasien P) {
        M.getTxAreaDelP().setText("");
        M.getTxAreaDelP().append("ID Pasien : " + P.getIdPasien() + "\n"
                + "NAMA : " + P.getNama() + "\n"
                + "JENIS KELAMIN : " + P.getJenisKelamin() + "\n"
                + "UMUR : " + P.getUmur() + "\n"
                + "WALI PASIEN : " + P.getWaliPasien() + "\n"
                + "ALAMAT : " + P.getAlamat());
    }

    public void setHasilDelR(Ruangan R) {
        M.getTxAreaDelR().setText("");
        M.getTxAreaDelR().append("NO Ruangan : " + R.getNoRuang() + "\n"
                + "KAPASITAS : " + R.getNKapasitas());
    }

    public void setViewAddP() {
        for (int i = 0; i < daftarPasien.size(); i++) {
            M.getTabelAddP().setValueAt(daftarPasien.get(i).getIdPasien(), i, 0);
            M.getTabelAddP().setValueAt(daftarPasien.get(i).getNama(), i, 1);
            M.getTabelAddP().setValueAt(daftarPasien.get(i).getJenisKelamin(), i, 2);
            M.getTabelAddP().setValueAt(daftarPasien.get(i).getUmur(), i, 3);
            M.getTabelAddP().setValueAt(daftarPasien.get(i).getWaliPasien(), i, 4);
            M.getTabelAddP().setValueAt(daftarPasien.get(i).getAlamat(), i, 5);
        }for (int i = daftarPasien.size(); i < 60; i++) {
            M.getTabelAddP().setValueAt("", i, 0);
            M.getTabelAddP().setValueAt("", i, 1);
            M.getTabelAddP().setValueAt("", i, 2);
            M.getTabelAddP().setValueAt("", i, 3);
            M.getTabelAddP().setValueAt("", i, 4);
            M.getTabelAddP().setValueAt("", i, 5);}
    }

//    public JTable getJTable() {
//        String[] colName = {"ID Dokter", "Nama ", "Umur", "Jenis Kelamin",
//            "Umur", ""};
//        
//        if (M.getTabelAddP() == null) {
//            jTable = new JTable() {
//                public boolean isCellEditable(int nRow, int nCol) {
//                    return false;
//                }
//            };
//        }
//        DefaultTableModel contactTableModel = (DefaultTableModel) M.getTabelAddP().getModel();
//        contactTableModel.setColumnIdentifiers(colName);
//        M.getTabelAddP().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        return (JTable) jTable;
//    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        //BUTTON DOKTER
        if (source.equals(M.getBSaveAddD())) {
            try {
                String idD = M.getTxIdD().getText();
                String nama = M.getTxNameD().getText();
                char jk = ' ';
                if (M.getRBGenderL().isSelected()) {
                    jk = 'L';
                } else if (M.getRBGenderP().isSelected()) {
                    jk = 'P';
                }
                String sp = M.getCBSpesialisD().getSelectedItem().toString();
                int umur = (int) M.getSpinnerUmur().getValue();
                int jam = Integer.parseInt(M.getTxJamD().getText());
                Dokter d = new Dokter(idD, sp, jam, nama, jk, umur);
                addDokter(d);
                App.simpanDokter(daftarDokter);
                System.out.println(daftarDokter.get(0));
                daftarDokter = App.bacaDokter();
                setViewAddD();
                JOptionPane.showMessageDialog(null, "Insert Berhasil");
            } catch (NumberFormatException ae) {
                JOptionPane.showMessageDialog(null, "Inputan Ada Yang Salah");
            }
        } else if (source.equals(M.getbCariDelD())) {
            try {
                String idD = M.getTxDelD().getText();
                Dokter d3 = getDokterById(idD);
                //System.out.println(d3.toString());
                d3.setIdDokter(idD);
                setHasilDelD(d3);
            } catch (NullPointerException ae) {
                JOptionPane.showMessageDialog(null, "ID Dokter Tidak Ditemukan");
            }
        } else if (source.equals(M.getbDelD())) {
            String idD = M.getTxDelD().getText();
            deleteDokterById(idD);
            App.simpanDokter(daftarDokter);
//             M.getTabelAddD().setValueAt("", daftarDokter.size()-1, 0);
//                M.getTabelAddD().setValueAt("", daftarDokter.size()-1, 1);
//                M.getTabelAddD().setValueAt("", daftarDokter.size()-1, 2);
//                M.getTabelAddD().setValueAt("", daftarDokter.size()-1, 3);
//                M.getTabelAddD().setValueAt("", daftarDokter.size()-1, 4);
//                M.getTabelAddD().setValueAt("", daftarDokter.size()-1, 5);
//            setViewAddD();
            JOptionPane.showMessageDialog(null, "DATA DENGAN ID '" + idD + "' Telah DiHapus");
        } else if (source.equals(M.getbCariEdD())) {
            try {
                String idD = M.getIdEditTxtF().getText();
                Dokter d3 = getDokterById(idD);
                M.getTxIdD1().setText(d3.getIdDokter());
                M.getTxJamD1().setText(d3.getJamKerja() + "");
                M.getTxNameD1().setText(d3.getNama());
                if (d3.getJenisKelamin() == 'L') {
                    M.getRBGenderL1().setSelected(true);
                } else if (d3.getJenisKelamin() == 'P') {
                    M.getRBGenderP1().setSelected(true);
                }
                M.getSpinnerUmur1().setValue(d3.getUmur());
                M.getCBSpesialisD1().setSelectedItem(d3.getSpesialis());
                //M.getTxIdD1().setText(d3.getIdDokter());
            } catch (NullPointerException ae) {
                JOptionPane.showMessageDialog(null, "ID Dokter Tidak Ditemukan");
            }
        } else if (source.equals(M.getbEdD())) {
            try {
                String idD = M.getIdEditTxtF().getText();
                Dokter d3 = getDokterById(idD);
                d3.setIdDokter(M.getTxIdD1().getText());
                d3.setNama(M.getTxNameD1().getText());
                if (M.getRBGenderL1().isSelected()) {
                    d3.setJenisKelamin('L');
                } else if (M.getRBGenderP1().isSelected()) {
                    d3.setJenisKelamin('P');
                }
                d3.setSpesialis(M.getCBSpesialisD1().getSelectedItem().toString());
                d3.setUmur((int) M.getSpinnerUmur1().getValue());
                d3.setJamKerja(Integer.parseInt(M.getTxJamD1().getText()));
//            Dokter d = new Dokter(idD, sp, jam, nama, jk, umur);
//            addDokter(d);
//            daftarDokter.add(d);
                //getDokterById(idD)=d3;
                App.simpanDokter(daftarDokter);
                JOptionPane.showMessageDialog(null, "DATA TELAH DI UPDATE");
            } catch (NumberFormatException ae) {
                JOptionPane.showMessageDialog(null, "Salah Masukan");
            }
        } else if (source.equals(M.getBReFD1())) {
            daftarDokter = App.bacaDokter();
            setViewAddD();
        } else if (source.equals(M.getBResetAddD())) {
            M.getTxIdD().setText("");
            M.getTxNameD().setText("");
            M.getTxJamD().setText("");
            M.getSpinnerUmur().setValue(1);
            M.getCBSpesialisD().setSelectedIndex(0);

        } //BUTTON MENU PASIEN
        else if (source.equals(M.getBSaveAddP())) {
            try {
                String idp = M.getTxAddP().getText();
                String nama = M.getTxNamaP().getText();
                char jk = ' ';
                if (M.getRBGenderL2().isSelected()) {
                    jk = 'L';
                } else if (M.getRBGenderP2().isSelected()) {
                    jk = 'P';
                }
                String wp = M.getTxWP().getText();
                int umur = (int) M.getSpinnerUmurP().getValue();
                String alamat = M.getTxAlamatP().getText();
                Pasien P = new Pasien(nama, jk, umur, idp, wp, alamat);
                daftarPasien.add(P);
                App.simpanPasien(daftarPasien);
                System.out.println(daftarPasien.get(0));
                setViewAddP();
                JOptionPane.showMessageDialog(null, "Insert Berhasil");
            } catch (NumberFormatException ae) {
                JOptionPane.showMessageDialog(null, "SALAH MASUKAN");
            } catch (InputMismatchException ae) {
                JOptionPane.showMessageDialog(null, "SALAH MASUKAN");
            }
        } else if (source.equals(M.getBReFP())) {
            daftarPasien = App.bacaPasien();
            // System.out.println(daftarPasien.get(0));
            setViewAddP();
        } else if (source.equals(M.getBCariDelP())) {
            try {
                String idD = M.getTxIdDelP().getText();
                Pasien p3 = getPasienById(idD);
                //System.out.println(d3.toString());
                p3.setIdPasien(idD);
                setHasilDelP(p3);
            } catch (NullPointerException ae) {
                JOptionPane.showMessageDialog(null, "ID Pasien Tidak Ditemukan");
            }
        } else if (source.equals(M.getBDelP())) {
            String idD = M.getTxIdDelP().getText();
            deletePasienById(idD);
            App.simpanPasien(daftarPasien);
            JOptionPane.showMessageDialog(null, "DATA DENGAN ID '" + idD + "' Telah DiHapus");
        } else if (source.equals(M.getBResetAddP())) {
            M.getTxAddP().setText("");
            M.getTxNamaP().setText("");
            M.getTxWP().setText("");
            M.getSpinnerUmurP().setValue(1);
            M.getTxAlamatP().setText("");
        } else if (source.equals(M.getBCariEdP())) {
            try {
                String idD = M.getTxEdP().getText();
                Pasien d3 = getPasienById(idD);
                M.getTxAddP1().setText(d3.getIdPasien());
                M.getTxNamaP1().setText(d3.getNama());
                if (d3.getJenisKelamin() == 'L') {
                    M.getRBGenderL3().setSelected(true);
                } else if (d3.getJenisKelamin() == 'P') {
                    M.getRBGenderP3().setSelected(true);
                }
                M.getSpinnerUmurP1().setValue(d3.getUmur());
                M.getTxWP1().setText(d3.getWaliPasien());
                M.getTxAlamatP1().setText(d3.getAlamat());
                //M.getTxIdD1().setText(d3.getIdDokter());
            } catch (NullPointerException ae) {
                JOptionPane.showMessageDialog(null, "ID Pasien Tidak Ditemukan");
            }
        } else if (source.equals(M.getBEdP())) {
            try {
                String idD = M.getTxEdP().getText();
                Pasien d3 = getPasienById(idD);

                d3.setNama(M.getTxNamaP1().getText());
                if (M.getRBGenderL3().isSelected()) {
                    d3.setJenisKelamin('L');
                } else if (M.getRBGenderP3().isSelected()) {
                    d3.setJenisKelamin('P');
                }
                d3.setUmur((int) M.getSpinnerUmur1().getValue());
                d3.setWaliPasien(M.getTxWP1().getText());
                d3.setAlamat(M.getTxAlamatP1().getText());
                App.simpanPasien(daftarPasien);
                JOptionPane.showMessageDialog(null, "DATA TELAH DI UPDATE");
            } catch (NumberFormatException ae) {
                JOptionPane.showMessageDialog(null, "Salah Masukan");
            }
        } //BUTTON RUANGAN 
        else if (source.equals(M.getBAddR())) {
            try {

                String nr = M.getTxAddR().getText();
                int k = Integer.parseInt(M.getTxKapAddR().getText());
                Ruangan r = new Ruangan(nr, k);
                daftarRuangan.add(r);
                App.simpanRuangan(daftarRuangan);
                setViewAddR();
                System.out.println(getRuangan(0));
            } catch (NumberFormatException ae) {
                JOptionPane.showMessageDialog(null, "SALAH MASUKAN");
            }
        } else if (source.equals(M.getBCariDelR())) {
            try {
                String nr = M.getTxDelR().getText();
                Ruangan r3 = getRuanganByNoRuang(nr);
                r3.setNoRuang(nr);
                setHasilDelR(r3);
            } catch (NullPointerException ae) {
                JOptionPane.showMessageDialog(null, "No Ruangan tidak Ditemukan");
            }
        } else if (source.equals(M.getBDelR())) {

        } //BUTTON KELUAR
        else if (source.equals(M.getBKeluar())) {
            System.exit(0);
        }

    }
    // else if (source.equals(M.get))
}
