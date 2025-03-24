public class ClassArray {
    private int[] myArray;

    // Inisialisasi array
    public ClassArray() {
        myArray = new int[]{0, 1, 2, 3, 4, 5};
    }

    // Menampilkan isi array
    public void displayArray() {
        System.out.print("Isi array: ");
        for (int value : myArray) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Metodezmelakukan perulangan pada array dan menampilkan nilai
    public void loopThroughArray() {
        System.out.print("Perulangan array: ");
        for (int value : myArray) {
            System.out.print(value * 2 + " "); 
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Membuat objek dari kelas ClassArray
        ClassArray example = new ClassArray();

        // Menampilkan isi array
        example.displayArray();

        // Melakukan perulangan pada array
        example.loopThroughArray();
    }
}