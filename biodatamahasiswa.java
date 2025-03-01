package biodata1;
import java.util.Scanner;
public class biodatamahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama, nim, jenisKelamin, TTL, agama, alamat, nomorTelepon, def="masukan ";
        
        System.out.println("------------------BIODATA KU---------------------");
        System.out.println("=================================================");
        
        System.out.println(def + "Nama \t\t: ");
        nama = input.nextLine();
        System.out.println(def + "NIM \t\t: ");
        nim = input.nextLine();
        System.out.println(def + "Jenis Kelamin \t: ");
        jenisKelamin = input.nextLine();
        System.out.println(def + "Tempat Tanggal Lahir \t: ");
        TTL = input.nextLine();d
                d
        System.out.println(def + "Agama \t: ");
        agama = input.nextLine();
        System.out.println(def + "Alamat \t: ");
        alamat = input.nextLine();
        System.out.println(def + "Nomor Telepon: ");
        nomorTelepon = input.nextLine();
        
        System.out.println("");
        
        System.out.println("=================================================");
        System.out.println("|                 BIODATA KU                     ");
        System.out.println("=================================================");
        System.out.println("Nama \t\t: " + nama);
        System.out.println("NIM \t\t: " + nim);
        System.out.println("Jenis Kelamin \t: " + jenisKelamin);
        System.out.println("Tempat Tanggal Lahir \t: " + TTL);
        System.out.println("Agama \t: " + agama);
        System.out.println("Alamat \t: " + alamat);
        System.out.println("Nomor Telepon \t: " + nomorTelepon);
        
        
        
    }
    
}
    
    
    
        
        
        
        
        
        
        
        
        
        
                
        
    
        
    
