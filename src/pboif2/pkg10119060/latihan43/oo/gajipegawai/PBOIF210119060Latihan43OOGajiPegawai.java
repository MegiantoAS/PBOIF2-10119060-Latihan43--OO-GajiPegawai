/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan43.oo.gajipegawai;
import GajiPegawai.GajiPegawai;
/**
 *
 @author Megianto Adi saputra
 Nama         : Megianto Adi Saputra
 Kelas        : IF-2
 NIM          : 10119060
 Deskripsi    : Program Gaji Pegawai
 */
 
public class PBOIF210119060Latihan43OOGajiPegawai {

   
    public static void main(String[] args) {
        // TODO code application logic here
         GajiPegawai objGajiPegawai = new GajiPegawai();
         
         objGajiPegawai.setNama("RIZki Adam Kurniawan");
         
         objGajiPegawai.setAlamat("Jalan Semasr dlm 4 No72/66");
         
         objGajiPegawai.setuangTransport(250000);
         
         objGajiPegawai.setuangTunjang(300000);
         
         objGajiPegawai.setgajiPokok(4500000);
         
         objGajiPegawai.tampilData(objGajiPegawai.getNama(), objGajiPegawai.getAlamat(), 
                 objGajiPegawai.getuangTunjangan(), objGajiPegawai.getUangTransport(), 
                 objGajiPegawai.getgajiPokok(), objGajiPegawai.totalGaji(objGajiPegawai.getuangTunjangan(),
                 objGajiPegawai.getUangTransport(), objGajiPegawai.getgajiPokok()));
    }
    
}
