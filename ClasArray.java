//klas pertama
public class ClasArray {
    public static void main(String[] args) {
        
       int[] nilai = new int[5];
       
       //mengisi nilai array
       nilai[0] = 10;
       nilai[1] = 20;
       nilai[2] = 30;
       nilai[3] = 40;
       nilai[4] = 50;
       
       //menampilkan isi array 
       System.out.print("nomer array: ");
       for (int i = 0; i < nilai.length; i++) {
           System.out.print(nilai[i] + " ");
           
       }
       System.out.println();
       
       //menampilkan nilai 
       int valueAtIndex2 = nilai[2];
       System.out.println("nilai pada indeks 2: " + valueAtIndex2);
       
    }
    
    
  }
        
    
