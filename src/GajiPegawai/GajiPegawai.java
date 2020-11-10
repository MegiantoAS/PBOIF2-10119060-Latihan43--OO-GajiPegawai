/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GajiPegawai;

/**
 *
  @author Megianto Adi saputra
 Nama         : Megianto Adi Saputra
 Kelas        : IF-2
 NIM          : 10119060
 Deskripsi    : Program Gaji Pegawai
 */
 
public class GajiPegawai {
    private String nama;
    private String alamat;
    private int uangTransport;
    private int uangTunjangan;
    private int gajiPokok;
    private int totalGaji;
    
    public String getNama(){
            return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String Alamat){
        this.alamat = alamat;
    }
    
    public int getUangTransport(){
        return uangTransport;
    }
    
    public void setuangTransport(int uangTransport){
        this.uangTransport = uangTransport;
    }
    
    public int getuangTunjangan(){
        return uangTunjangan;
    }
    
    public void setuangTunjang(int uangTunjangan){
        this.uangTunjangan = uangTunjangan;
    }
    
    public int getgajiPokok(){
        return gajiPokok;
    }
    
    public void setgajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    
    public int getTotalGaji(){
        return totalGaji;
    }
    
    public void setTotalGaji(int totalGaji){
        this.totalGaji = totalGaji;
    }
    
    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok){
        return uangTunjangan + uangTransport + gajiPokok;
    }
    
    public void tampilData(String nama, String alamat, int uangTunjangan, int uangTransport, int gajiPokok, int totalGaji){
        System.out.println("### Data Gaji Karyawan PT. KAKATU###");
        System.out.println("-------------------------------------");
        System.out.println("Nama Karyawan : "+nama);
        System.out.println("Alamat: "+gajiPokok);
        System.out.println("Uang Transport: "+uangTransport);
        System.out.println("Uang Tunjangan: "+uangTunjangan);
        System.out.println("Gaji Pokok: "+gajiPokok);
        System.out.println("TOTAL GAJI: "+totalGaji);
    }
}
    

