/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projek_2_tambahan_aritmatic;

/**
 *
 * @author Fauzy Wahyudi
 */
import java.io.*;//1.file header untuk aktifkan program java
public class Projek_2_tambahan_aritmatic {
private static String berat_paket;
    
    public static  void main (String args []){ //2.buatkan fungsi utama
    //3.kenalkan variabel yang digunakan
     
        //tambahan variabel yang digunakan 
        float berat=0;
        int harga_perkilo=0,
        total_bayar=0;
        
        
     String no_reg = null,
             nama_pengirim = null,
             alamat_pengirim,
             no_telpon_pengirim = null,
             tujuan_paket = null,
             no_telpon_penerima = null;
     
     
     //4.kenalka method proses input dan output 
     DataInputStream in = new DataInputStream( System.in);
     
     //5.buatkan perintah input dan output
     //perintah input
     
     try {
         //posisi sintak untuk proses input
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
         
         System.out.println("input no telpon  penerima :");
         no_telpon_penerima = String.valueOf(in.readLine());
         
         System.out.println("input berat paket :");
            String berat_paket = String.valueOf(in.readLine());
         
          System.out.println("input harga perkilo :");
        harga_perkilo = Integer.valueOf(in.readLine());
          
         
       //tambahkan proses rumus aritmatik setelah adanya proses input
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
     } 
         
     
}
