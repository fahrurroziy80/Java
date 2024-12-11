package biodata1;

import java.util.Scanner;

public class biodatamahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama, nim, jenisKelamin, TTL, agama, alamat, nomorTelepon;
        String def = "Masukkan ";
        
        System.out.println("------------------ BIODATA KU ---------------------");
        System.out.println("=====================================================");
        
        System.out.print(def + "Nama \t\t: ");
        nama = input.nextLine();
        System.out.print(def + "NIM \t\t: ");
        nim = input.nextLine();
        System.out.print(def + "Jenis Kelamin \t: ");
        jenisKelamin = input.nextLine();
        System.out.print(def + "Tempat Tanggal Lahir \t: ");
        TTL = input.nextLine();
        System.out.print(def + "Agama \t\t: ");
        agama = input.nextLine();
        System.out.print(def + "Alamat \t\t: ");
        alamat = input.nextLine();
        System.out.print(def + "Nomor Telepon \t: ");
        nomorTelepon = input.nextLine();
        
        System.out.println("");
        
        System.out.println("=====================================================");
        System.out.println("|                 BIODATA KU                       |");
        System.out.println("=====================================================");
        System.out.println("Nama \t\t: " + nama);
        System.out.println("NIM \t\t: " + nim);
        System.out.println("Jenis Kelamin \t: " + jenisKelamin);
        System.out.println("Tempat Tanggal Lahir \t: " + TTL);
        System.out.println("Agama \t\t: " + agama);
        System.out.println("Alamat \t\t: " + alamat);
        System.out.println("Nomor Telepon \t: " + nomorTelepon);
        
        input.close(); // Menutup scanner untuk menghindari kebocoran sumber daya
    }
}
