/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projek_3_tambahan_kondisi_penyeleksian;

/**
 *
 * @author Fauzy Wahyudi
 */
import java.io.*;//1.file header untuk aktifkan program java
public class Projek_3_tambahan_kondisi_penyeleksian {

    
    public static  void main (String args []){ //2.buatkan fungsi utama
    //3.kenalkan variabel yang digunakan
     
     String no_reg = null,
             nama_pengirim = null,
             alamat_pengirim = null,
             no_telpon_pengirim = null,
             tujuan_paket= null,
             berat_paket= null,
             no_telpon_penerima = null;
     
     
     //tambahan variabel yang digunakan 
        float berat=0;
        int harga_perkilo=0,
        total_bayar=0;
        
     //variabel kondisi 
    String jenis_paket =null,
            jenis_barang=null;
            
             
     //4.kenalka method proses input dan output 
     DataInputStream in = new DataInputStream( System.in);
     
     //5.buatkan perintah input dan output
     //perintah input
     
      try {
         //posisi sintak untuk proses input
          
         System.out.println("================");
         System.out.println(" Proses Input Data");
         System.out.println("================");
         System.out.println("input no register :");
         no_reg = String.valueOf(in.readLine());
         
         System.out.println("input nama pengirimi :");
         nama_pengirim = String.valueOf(in.readLine());
         
         System.out.println("input alamat pengirim :");
         alamat_pengirim = String.valueOf(in.readLine());
         
         System.out.println("input no telpon  pengirim :");
         no_telpon_pengirim = String.valueOf(in.readLine());
         
         System.out.println("input tujuan paket :");
         tujuan_paket = String.valueOf(in.readLine());
         
         System.out.println("input berat paket :");
         berat_paket = String.valueOf(in.readLine());
         
         System.out.println("input no telpon  penerima :");
         no_telpon_penerima = String.valueOf(in.readLine());
         
     
          System.out.println("input harga perkilo :");
          harga_perkilo = Integer.valueOf(in.readLine());
       
    
          
          //tambahkan untuk input variabel kondisi
        System.out.println("input jenis barang :");
         jenis_barang = String.valueOf(in.readLine());
        
          System.out.println("input jenis paket :");
         jenis_paket = String.valueOf(in.readLine());
        
         
       //tambahkan perintah kondisi penyeleksian
         if((jenis_barang=="normal")&&(jenis_barang==" documen")){
             harga_perkilo=15000;
             
         }
         
         else if((jenis_paket=="express")&&(jenis_barang==" documen")){
             harga_perkilo=20000;
             
         }
         
         //tambahkan proses rumus aritmatik setelah adanya proses input
            total_bayar = (int) berat * harga_perkilo;
         
      } catch (Exception e) {}
          
          //untuk output boleh diberika perintah dibawah CATCH 
          
           System.out.println("================");
           System.out.println("Hasil Output Data");
           System.out.println("================");
           System.out.println("no register : " + no_reg);
           System.out.println(" nama pengirim: " + nama_pengirim);
           System.out.println("alamat pengirim : " +  no_telpon_pengirim );
           System.out.println("No telpon penerima : " +  no_telpon_penerima);
           System.out.println(" tujuan paket: " + tujuan_paket);
           System.out.println(" berat paket: " + berat_paket);
           System.out.println(" harga perkilo: " + harga_perkilo);
           System.out.println(" total bayar: " + total_bayar);
           System.out.println(" jenis paket: " + jenis_paket);
           System.out.println(" jenis barang: " + jenis_barang);
     } 
         
     }
     
 //tutup fungsi utama           
