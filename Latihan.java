
public class Latihan {
     public static void main(String [] args) {
        // Contoh perulangan for
         double angsPokok = 200000;
        double bunga = 0.2;
        double jk = 10;
        double angsBunga, angsuran;
        double pinjaman = 0;
        
        for (double i = 1; i <= jk; i++) {
             pinjaman += angsPokok;
            System.out.println("Angsuran pokok ke- :"+(i+1)+" = "+pinjaman);
        }
        
        System.out.println("--------------------");
        
         // Contoh perulangan while
        int i = 1;
        while (i <= 20) {
            System.out.println("Iterasi ke-" + i);
            i++;
        }
        //
    }
    
}
