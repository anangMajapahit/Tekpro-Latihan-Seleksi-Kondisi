/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.kondisi;

/**
 *
 * @author toshiba
 */
public class LatihanKondisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
        int o;
        int q;
        System.out.println("angka  : ");
        o = a.nextInt();
        System.out.println("angka  : ");
        p = a.nextInt();

        if (o < q) {
            System.out.println("<");
        } else if (o > q) {
            System.out.println(">");
        } else if (q > o) {
            System.out.println(">");
        } else {
            System.out.println("=");
        }
    }

}
    }
    
}
