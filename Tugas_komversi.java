
package Output;


public class Tugas_komversi {
     public static void main(String[] args) {
         
         // String ke int//
         
         String strpanjang = "10";
         int panjang = Integer.valueOf(strpanjang);
         int lebar = 5;
         int hasil1, hasil2;
         hasil1 = panjang *lebar;
         hasil2 = panjang *lebar;
         
         System.out.println("panjang = " +lebar);
         
         
         //rumus luas segitiga String ke Double
         
         String stralas = "8.4";
         double alas = Double.valueOf(stralas);
         double tinggi = 5.5;
         double luas_segitiga;
         luas_segitiga = 0.5 * alas * tinggi;
         
         System.out.println("luas segitiga = " + luas_segitiga);
       
         //rumus luas lingkaran double ke int
         
         double panjang1 = 13.4;
         double lebar1 = 7.2;
        
         int luas1;
         luas1 = (int)panjang1 * (int)lebar1;
         System.out.println("luas" + luas1);
         
         
         //int ke String
         
         int a = 10;
         String b = Integer.toString(a);
         System.out.println("Using Integer.toString : " +b);
         
         //double ke String
         
         double ff = 6.4;
         Double bb = Double.valueOf(ff);
         System.out.println("ff : " + bb);
         
         
         
         
         
         
         
         
         
     
    }
    
    
}

