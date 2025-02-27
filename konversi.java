package konveri;

 
public class konversi {
    public static void main(String[] args) {
        //String ke int
        String angkaStr = "42";
        int angka = Integer.parseInt(angkaStr);
        
        System.out.println("angkaStr = " +angka);
        
        //mengubah int ke double
        int integerVar = 42;
        double doubleVar = (double) integerVar;
        
        System.out.println("integerVar = " +doubleVar);
       
    }
    
    
}
