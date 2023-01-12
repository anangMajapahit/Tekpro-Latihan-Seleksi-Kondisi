/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.kondisi.pkg2;

/**
 *
 * @author toshiba
 */
public class BelajarKondisi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
        int tahun = 0;
        int bulan = 0;
         System.out.println("tahun : ");
        tahun = a.nextInt();
        System.out.println("bulan : ");
        bulan = a.nextInt();
        if (bulan == 1) {
            System.out.println("Januari,31");
        } else if (bulan == 2) {
            if (tahun % 4 == 0) {
                System.out.println("Februari,29");
            } else {
                System.out.println("Februari,28");
            }
        } else if (bulan == 3) {
            System.out.println("Maret,31");
        } else if (bulan == 4) {
            System.out.println("April,30");
        } else if (bulan == 5) {
            System.out.println("Mei,31");
        } else if (bulan == 6) {
            System.out.println("Juni,30");
        } else if (bulan == 7) {
            System.out.println("Juli,31");
        } else if (bulan == 8) {
            System.out.println("Agustus,31");
        } else if (bulan == 9) {
            System.out.println("September,30");
        } else if (bulan == 10) {
            System.out.println("Oktober,31");
        } else if (bulan == 11) {
            System.out.println("November,30");
        } else if (bulan == 12) {
            System.out.println("Desember,31");
        }
        
    }
}
    }
    
}
