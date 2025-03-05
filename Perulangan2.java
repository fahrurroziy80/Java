
public class Perulangan2 {
    public static void main(String [] agrs) {
       
        double angsPokok = 1000000;
        double bunga = 0.2;
        double jk = 10;
        double angsBunga, angsuran;
        double pinjaman = 0;

        
        int jumlahAngsuran = (int) (jk * 12);

        
        double bungaBulanan = bunga / 12;
        double faktor = (Math.pow(1 + bungaBulanan, jumlahAngsuran) - 1) / (bungaBulanan * Math.pow(1 + bungaBulanan, jumlahAngsuran));

        angsuran = angsPokok / faktor;

        
        System.out.println("Bulan\t\tAngsuran\t\tSisa Pinjaman");

       
        for (int bulan = 1; bulan <= jumlahAngsuran; bulan++) {
            angsBunga = pinjaman * bungaBulanan;
            pinjaman = pinjaman + angsBunga - angsuran;

          
            System.out.printf("%d\t\t%.2f\t\t\t%.2f\n", bulan, angsuran, pinjaman);
        }
    }
}
            
             
            
             
             
        
        
            
        
        
       
     
    
