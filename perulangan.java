
package Output;

public class perulangan {
    public static void main(String [] args) {
        double pinjaman = 1000000;
        double bunga = 0.2;
        int jk = 10;
        double angsPokok, angsBunga, angsuran;
        
        angsPokok = pinjaman / jk;
        angsBunga = pinjaman * bunga / jk;
        angsuran = angsPokok + angsBunga;
        
        for (int i = 0; i < jk; i++) {
            System.out.println("Angsuran pokok ke- :"+(i+1)+" = "+angsPokok);
            System.out.println("Angsuran pokok ke- :"+(i+1)+" = "+angsBunga);
            System.out.println("Angsuran pokok ke- :"+(i+1)+" = "+angsuran);
            
            
        }
    }
    
}
