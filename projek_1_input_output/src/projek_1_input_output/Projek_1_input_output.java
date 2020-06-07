/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projek_1_input_output;

import java.io.*;//1.file header untuk aktifkan program java
/**
 *
 * @author Fauzy Wahyudi
 */
public class Projek_1_input_output {

    public static  void main (String args []){ //2.buatkan fungsi utama
    //3.kenalkan variabel yang digunakan
     
     String no_reg = null,
             nama_pengirim = null,
             alamat_pengirim = null,
             no_telpon_pengirim = null,
             tujuan,
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
         
         System.out.println("input tujuan :");
         tujuan = String.valueOf(in.readLine());
         
         System.out.println("input no telpon  penerima :");
         no_telpon_penerima = String.valueOf(in.readLine());
         
    
         
         //posisi sintak untuk proses input
     System.out.println();
     System.out.println("input no registrasi");
     no_reg = String.valueOf(in.readLine());
    
     System.out.println("input no registrasi");
     no_reg = String.valueOf(in.readLine());
     
     System.out.println("input nama pengirim ");
     nama_pengirim = String.valueOf(in.readLine());
     
     System.out.println("input alamat pengirim ");
     alamat_pengirim = String.valueOf(in.readLine());
     
     System.out.println("input no telpon pengirim ");
     no_telpon_pengirim = String.valueOf(in.readLine());
     
     System.out.println("input no telpon penerima ");
     no_telpon_penerima= String.valueOf(in.readLine());
     
     
     
      } catch (Exception e) {
          
          //untuk output boleh diberika perintah dibawah CATCH 
           System.out.println("================");
           System.out.println("Hasil Output Data");
           System.out.println("================");
           System.out.println("no register : " + no_reg);
           System.out.println(" nama pengirim: " + nama_pengirim);
           System.out.println("alamat pengirim : " + alamat_pengirim );
           System.out.println("No telpon pengirim : " +  no_telpon_pengirim);
           System.out.println("No telpon penerima : " +  no_telpon_penerima);
     } 
         
     }
}
