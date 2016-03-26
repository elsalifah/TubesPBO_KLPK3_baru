/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasieninaprumahsakit;

import java.util.ArrayList;
import java.util.*;
import java.io.*;

/**
 *
 * @author AngkyMusa
 */
public class Aplikasi {

    private int menu, menu1, menu2, menu3;
    private int pil;
    private static ArrayList<Dokter> daftarDokter = new ArrayList<Dokter>();
    private static ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();
    private static ArrayList<Ruangan> daftarRuangan = new ArrayList<Ruangan>();
    /*private int incIdD;

     public String getOtomatisIdD() {
     return "D0" + incIdD;
     }

     public void setOtomatisIdD() {
     incIdD++;
     }*/

    public void addDokter(Dokter d) {
        daftarDokter.add(d);
    }

    public void addPasien(Pasien p) {
        daftarPasien.add(p);
    }

    public void addRuangan(Ruangan r) {
        daftarRuangan.add(r);
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

    public void deleteDokterById(String id) {
        for (int i = 0; i < daftarDokter.size(); i++) {
            if (daftarDokter.get(i).getIdDokter().equals(id)) {
                daftarDokter.remove(i);
            }
        }
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

    public void simpanDokter(ArrayList<Dokter> daftarDokter) {
        try (FileOutputStream fosd = new FileOutputStream("Dokter.txt");
                ObjectOutputStream oosd = new ObjectOutputStream(fosd);) {
            oosd.writeObject(daftarDokter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void simpanPasien(ArrayList<Pasien> daftarPasien) {
        try (FileOutputStream fosp = new FileOutputStream("Pasien.txt");
                ObjectOutputStream oosd = new ObjectOutputStream(fosp);) {
            oosd.writeObject(daftarPasien);
        } catch (Exception e) {
        }
    }

    public void simpanRuangan(ArrayList<Ruangan> daftarRuangan) {
        try (FileOutputStream fosr = new FileOutputStream("Ruangan.txt");
                ObjectOutputStream oosd = new ObjectOutputStream(fosr);) {
            oosd.writeObject(daftarRuangan);
        } catch (Exception e) {
        }
    }

    public ArrayList<Dokter> bacaDokter() {
        ArrayList<Dokter> resultd = new ArrayList<>();
        File f = new File("Dokter.txt");
        if (f.exists()) {
            try (
                    FileInputStream fisd = new FileInputStream(f);
                    ObjectInputStream oisd = new ObjectInputStream(fisd);) {
                resultd = (ArrayList<Dokter>) oisd.readObject();
            } catch (Exception e) {

            }
        }
        return resultd;
    }

    public ArrayList<Pasien> bacaPasien() {
        ArrayList<Pasien> resultp = new ArrayList<>();
        File f = new File("Pasien.txt");
        if (f.exists()) {
            try (FileInputStream fisp = new FileInputStream(f);
                    ObjectInputStream oisd = new ObjectInputStream(fisp);) {
                resultp = (ArrayList<Pasien>) oisd.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return resultp;
    }

    public ArrayList<Ruangan> bacaRuangan() {
        ArrayList<Ruangan> resultr = new ArrayList<>();
        File f = new File("Ruangan.txt");
        if (f.exists()) {
            try (FileInputStream fisr = new FileInputStream(f);
                    ObjectInputStream oisr = new ObjectInputStream(fisr);) {
                resultr = (ArrayList<Ruangan>) oisr.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return resultr;
    }

    public void menuSatu() {
        //taruh method view
        System.out.println("1. Add Dokter");
        System.out.println("2. Edit Dokter");
        System.out.println("3. Delete Dokter");
        System.out.println("4. View Dokter");
        System.out.println("5. Back ");
        System.out.print("Pilih Menu : ");

    }

    public void menuDua() {
        System.out.println("1. Add Pasien");
        System.out.println("2. Edit Pasien");
        System.out.println("3. Delete Pasien");
        System.out.println("4. View Pasien");
        System.out.println("5. Back ");
        System.out.print("Pilih Menu : ");

    }

    public void menuTiga() {
        System.out.println("1. Add Ruangan");
        System.out.println("2. Edit Ruangan");
        System.out.println("3. Delete Ruangan");
        System.out.println("4. Set Pasien, Dokter, and Dignosa");
        System.out.println("5. Delete Pasien dalam Ruangan");
        System.out.println("6. View Ruangan");
        System.out.println("7. Back ");
        System.out.print("Pilih Menu : ");
    }

    public void menuTigaSatu() {
        System.out.println("1. Tambahkan Diagnose ");
        System.out.println("2. Hapus Diagnose ");
        System.out.println("3. Back");
    }

    public void MenuSatuDua() {
        System.out.println("1. Edit Nama Dokter ");
        System.out.println("2. Edit Spesialis Dokter ");
        System.out.println("3. Edit Jenis Kelamin Dokter ");
        System.out.println("4. Edit Umur Dokter ");
        System.out.println("5. Edit Jam Kerja");
        System.out.println("6. Back ");
    }

    public void mainMenu() {
        daftarDokter = bacaDokter();
        daftarPasien = bacaPasien();
        daftarRuangan = bacaRuangan();
        do {
            try {
                Scanner a = new Scanner(System.in);
                Scanner b = new Scanner(System.in);
                Scanner c = new Scanner(System.in);
                System.out.println("Aplikasi Pasien Inap Rumah Sakit");
                System.out.println();
                System.out.println("1. Menu Dokter ");
                System.out.println("2. Menu Pasien ");
                System.out.println("3. Menu Ruangan ");
                System.out.println("4. Keluar ");
                System.out.print("Pilih Menu : ");
                menu = a.nextInt();
                int pil = 0;
                //Menu Dokter
                if (menu == 1) {
                    try {
                        do {
                            menuSatu();

                            int menu1 = a.nextInt();
                            if (menu1 == 1) {
                                /*Dokter.setOtomatisIdD();
                                 System.out.println("Id Dokter   : " + Dokter.getOtomatisIdD());
                                 String idd = Dokter.getOtomatisIdD();*/
                                try {
                                    System.out.print("Id Dokter   : ");
                                    String idd = b.nextLine();
                                    Dokter d4 = getDokterById(idd);
                                    if (d4 == null) {
                                        System.out.print("Nama Dokter : ");
                                        String nd = b.nextLine();
                                        System.out.print("Spesialias  : ");
                                        String sp = b.nextLine();
                                        char jk;
                                        do {
                                            System.out.println("Jenis Kelamin: ");
                                            System.out.print("P(rempuan),  L(aki-laki) =");
                                            jk = c.next().charAt(0);
                                        } while (jk != 'P' && jk != 'L');
                                        System.out.print("Umur        : ");
                                        int u = a.nextInt();
                                        System.out.print("Jam Kerja : ");
                                        int jam = a.nextInt();
                                        Dokter d1 = new Dokter(idd, sp, jam, nd, jk, u);
                                        addDokter(d1);

                                    } else {
                                        System.out.println("Id Sudah terdaftar");
                                    }
                                    simpanDokter(daftarDokter);
                                } catch (InputMismatchException e) {
                                    System.out.println("Inputan salah");

                                }


                                /*daftarDokter = bacaDokter();
                                 if (daftarDokter != null) {
                                 daftarDokter = bacaDokter();
                        
                                 simpanDokter(daftarDokter);
                                 } else {
                                 daftarDokter = bacaDokter();
                                 d1 = new Dokter(idd, sp, jam, nd, jk, u);
                                 addDokter(d1);
                                 }*/
                            } else if (menu1 == 2) {
                                try {
                                    System.out.println("Daftar Dokter : ");
                                    for (int i = 0; i < daftarDokter.size(); i++) {
                                        System.out.println("Dokter Indeks ke " + (i + 1) + " : ");
                                        System.out.println(getDokter(i).toString());
                                        System.out.println("----");
                                    }
                                    try {
                                        System.out.print("Masukkan Id Dokter : ");
                                        String in1 = b.nextLine();
                                        Dokter d2 = getDokterById(in1);
                                        d2.setNama("wih");
                                        System.out.print("Nama Dokter : ");
                                        String nd = b.nextLine();
                                        d2.setNama(nd);
                                        System.out.print("Spesialias  : ");
                                        String sp = b.nextLine();
                                        d2.setSpesialis(sp);
                                        char jk;
                                        do{
                                        System.out.println("Jenis Kelamin: ");
                                        System.out.print("P(rempuan),  L(aki-laki) =");
                                        jk = c.next().charAt(0);
                                        } while(jk!='P' && jk!='L');
                                        d2.setJenisKelamin(jk);
                                        System.out.print("Umur        : ");
                                        int u = a.nextInt();
                                        d2.setUmur(u);
                                        System.out.print("Jam Kerja : ");
                                        int jam = a.nextInt();
                                        d2.setJamKerja(jam);
                                        simpanDokter(daftarDokter);
                                    } catch (NullPointerException e) {
                                        System.out.println("Data tidak ditemukan");
                                    }
                                } catch (NullPointerException e) {
                                    System.out.println("KOSONG");
                                }
                            } else if (menu1 == 3) {
                                try {
                                    System.out.print("Masukkan Id Dokter : ");
                                    String in1 = b.nextLine();
                                    Dokter d2 = getDokterById(in1);
                                    d2.setIdDokter(in1);
                                    deleteDokterById(in1);
                                    simpanDokter(daftarDokter);
                                    System.out.println("Data dokter dengan id'" + in1 + "'telah dihapus");
                                } catch (NullPointerException e) {
                                    System.out.println("Data tidak ditemukan");
                                }
                            } else if (menu1 == 4) {
                                System.out.println("Daftar Dokter : ");
                                try {
                                    for (int i = 0; i < daftarDokter.size(); i++) {
                                        System.out.println(getDokter(i).toString());
                                        System.out.println("----");
                                    }
                                } catch (NullPointerException e) {
                                    System.out.println("KOSONG");
                                }
                            } else {
                                break;
                            }

                        } while (true);
                    } catch (InputMismatchException e) {
                        System.out.println("Inputan salah");
                    }
                }// Menu Pasien 
                else if (menu == 2) {
                    try {
                        do {
                            menuDua();
                            int menu2 = a.nextInt();
                            if (menu2 == 1) {
                                System.out.print("Id Pasien  : ");
                                String idd = b.nextLine();
                                Pasien p4 = getPasienById(idd);
                                if (p4 == null) {
                                    System.out.print("Nama Pasien : ");
                                    String nd = b.nextLine();
                                    System.out.print("Wali Pasien : ");
                                    String sp = b.nextLine();
                                    char jk;
                                    do {
                                        System.out.println("Jenis Kelamin: ");
                                        System.out.print("P(rempuan),  L(aki-laki) =");
                                        jk = c.next().charAt(0);
                                    } while (jk != 'P' && jk != 'L');
                                    System.out.print("Umur        : ");
                                    int u = a.nextInt();
                                    System.out.print("Alamat : ");
                                    String al = b.nextLine();
                                    Pasien p1 = new Pasien(nd, jk, u, idd, sp, al);
                                    addPasien(p1);
                                } else {
                                    System.out.println("Id sudah terdaftar");
                                }
                                simpanPasien(daftarPasien);

                            } else if (menu2 == 2) {
                                try {
                                    System.out.println("Masukkan Id Pasien : ");
                                    String in1 = b.nextLine();
                                    Pasien p2 = getPasienById(in1);
                                    p2.setIdPasien(in1);
                                    System.out.print("Nama Pasien : ");
                                    String nd = b.nextLine();
                                    p2.setNama(nd);
                                    System.out.print("Wali Pasien : ");
                                    String sp = b.nextLine();
                                    p2.setWaliPasien(sp);
                                    char jk;
                                        do{
                                        System.out.println("Jenis Kelamin: ");
                                        System.out.print("P(rempuan),  L(aki-laki) =");
                                        jk = c.next().charAt(0);
                                        } while(jk!='P' && jk!='L');
                                    p2.setJenisKelamin(jk);
                                    System.out.print("Umur        : ");
                                    int u = a.nextInt();
                                    p2.setUmur(u);
                                    System.out.print("Alamat : ");
                                    String al = a.nextLine();
                                    p2.setAlamat(al);
                                    simpanPasien(daftarPasien);
                                } catch (NullPointerException e) {
                                    System.out.println("Data Pasien tidak ditemukan ");
                                }
                            } else if (menu2 == 3) {
                                try {
                                    System.out.print("Masukkan Id Pasien : ");
                                    String in1 = b.nextLine();
                                    Pasien p2 = getPasienById(in1);
                                    p2.setIdPasien(in1);
                                    deletePasienById(in1);
                                    System.out.print("Data Pasien dengan id '" + in1 + "' telah dihapus");
                                    simpanPasien(daftarPasien);
                                } catch (NullPointerException e) {
                                    System.out.println("Data Pasien tidak ditemukan ");
                                }
                            } else if (menu2 == 4) {
                                System.out.println("Daftar Pasien : ");
                                try {
                                    for (int i = 0; i < daftarPasien.size(); i++) {
                                        System.out.println(daftarPasien.get(i).toString());
                                        System.out.println("-----");
                                    }
                                } catch (NullPointerException e) {
                                    System.out.println("KOSONG");
                                }
                            } else if (menu2 == 5) {
                                break;
                            } else {
                                System.out.println("Tidak ada pilihan menu");
                            }
                        } while (true);
                    } catch (InputMismatchException e) {
                        System.out.println("Inputan salah");
                    }
                } // Menu Ruangan 
                else if (menu == 3) {
                    try {
                        do {
                            menuTiga();
                            int menu3 = a.nextInt();
                            if (menu3 == 1) {
                                try {
                                    System.out.print("No Ruangan : ");
                                    String nr = b.nextLine();
                                    Ruangan r4 = getRuanganByNoRuang(nr);
                                    if (r4 == null) {
                                        System.out.print("Kapasitas Ruangan : ");
                                        int n = a.nextInt();
                                        Ruangan R1 = new Ruangan(nr, n);
                                        addRuangan(R1);
                                        simpanRuangan(daftarRuangan);
                                    } else {
                                        System.out.println("No Ruangan sudah ada");
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Inputan salah");
                                }
                            } else if (menu3 == 2) {
                                try {
                                    System.out.print("Masukkan No Ruangan : ");
                                    String nre = b.nextLine();
                                    Ruangan R2 = getRuanganByNoRuang(nre);
                                    R2.setNoRuang(nre);
                                    System.out.print("Edit No Ruang : ");
                                    String nr = b.nextLine();
                                    R2.setNoRuang(nr);
                                    System.out.print("Edit Kapasitas Ruangan : ");
                                    int ne = a.nextInt();
                                    R2.setnKapasitas(ne);
                                    simpanRuangan(daftarRuangan);
                                } catch (NullPointerException e) {
                                    System.out.print("No Ruang tidak ditemukan");
                                }

                            } else if (menu3 == 3) {
                                try {
                                    System.out.print("Masukkan No Ruangan : ");
                                    String nr = b.nextLine();
                                    Ruangan r3 = getRuanganByNoRuang(nr);
                                    deleteRuanganByNoRuang(nr);
                                    simpanRuangan(daftarRuangan);
                                } catch (NullPointerException e) {
                                    System.out.println("No Ruang tidak ditemukan ");
                                }
                            } else if (menu3 == 4) {
                                try {
                                    System.out.print("Masukkan No Ruang : ");
                                    String nr = b.nextLine();
                                    Ruangan r3 = getRuanganByNoRuang(nr);
                                    r3.setNoRuang(nr);
                                    /*} catch (NullPointerException e) {
                                     System.out.println("NO Ruangan tidak ditemukan");
                                     break;
                                     }*/
                                    //try {
                                    System.out.print("Masukkan ID Pasien : ");
                                    String idp = b.nextLine();
                                    Pasien p3 = getPasienById(idp);
                                    p3.setIdPasien(idp);
                                    String cek=" ";
                                    //try{
                                    for(int i=0; i<daftarRuangan.size();i++){
                                        Ruangan r4=daftarRuangan.get(i);
                                        r4.getPasienInapById(idp);
                                        if(r4.getPasienInapById(idp)!=null){
                                            cek=cek+r4.getPasienInapById(idp).getPasien().getNama();
                                        }
                                    }/*}catch(NullPointerException e){
                                        cek=cek
                                    }*/
                                    
                                    if(cek==" "){
                                    System.out.print("Masukkan ID Dokter : ");
                                    String idd = b.nextLine();
                                    Dokter d3 = getDokterById(idd);
                                    r3.tambahPasienInap(p3, d3);
                                    simpanRuangan(daftarRuangan);
                                    }
                                    else {
                                        System.out.println("Pasien sudah dirawat");
                                        break;
                                    }
                                    
                                    /*  } catch (NullPointerException e) {
                                     System.out.println("Data Pasien tidak ditemukan");
                                     }*/
                                    // try{
                                    
                                    /*PasienInap pi1=new PasienInap(p3);
                                     pi1.setDokter(d3);*/
                                    System.out.println("Menu Diagnose : ");
                                    do {
                                        menuTigaSatu();
                                        System.out.print("Pilih menu : ");
                                        pil = a.nextInt();
                                        if (pil == 1) {
                                            System.out.print("Diagnose : ");
                                            String di = b.nextLine();
                                            r3.getPasienInapById(idp).addDiagnosa(di);

                                        } else if (pil == 2) {
                                            System.out.print("Delete Diagnose Indeks ke ");
                                            int in = a.nextInt();
                                            r3.getPasienInapById(idp).deleteDiagnose(in);

                                        } else {
                                            break;
                                        }
                                    } while (true);

                                    simpanRuangan(daftarRuangan);
                                } catch (NullPointerException e) {
                                    System.out.println("Ada data yang tidak ditemukan");
                                } catch (InputMismatchException e) {
                                    System.out.println("Inputan salah");
                                }
                            } else if (menu3 == 5) {

                                System.out.print("Masukkan No Ruangan : ");
                                String nr = b.nextLine();
                                ArrayList<Ruangan> daftarRuangan = bacaRuangan();
                                Ruangan r3 = getRuanganByNoRuang(nr);
                                try {
                                    r3.toString();
                                    System.out.println();
                                    try {
                                        System.out.print("Masukkan ID Pasien : ");
                                        String idp = b.nextLine();
                                        r3.deletePasienInapById(idp);
                                        deletePasienById(idp);
                                        r3.toString();
                                    } catch (NullPointerException e) {
                                        System.out.println("data pasien tidak ada");
                                    }
                                    simpanRuangan(daftarRuangan);
                                } catch (NullPointerException e) {
                                    System.out.println("Data Ruangan tidak ada");
                                }

                            } else if (menu3 == 6) {
                                System.out.println("Data Ruangan : ");
                                try{
                                    for (int i = 0; i < daftarRuangan.size(); i++) {
                                        System.out.println(daftarRuangan.get(i).toString());
                                        System.out.println("----");
                                    }
                                } catch (NullPointerException e) {
                                    System.out.println("KOSONG");
                                }
                            } else if (menu3 == 7) {
                                break;
                            } else {
                                System.out.println("Salah Input");
                            }
                        } while (true);
                    } catch (InputMismatchException e) {
                        System.out.println("Inputan salah");
                    }
                } else if (menu == 4) {
                    System.out.println("Terima Kasih");
                } else {
                    System.out.println("Tidak ada pilihan menu");
                }
            } catch (InputMismatchException e) {
                System.out.println("Salah input");
            }
        } while (menu
                != 4);
    }

   
}
