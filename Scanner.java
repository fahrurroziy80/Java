
package scanner;


public class Scanner {

    public static void main(String[] args) {
        // String  ke int
        String angkaStr = "42";
        int angka = Integer.parseInt(angkaStr);
        
        System.out.println("angkaStr = " +angka);
        
        //int ke String
        int nilaiA = 42;
        String nilaiB = String.valueOf(angka);
        
        System.out.println("NilaiA = " +nilaiB);
    }
    
}
