import java.util.Scanner;

/**
 * Kelas utama yang menjalankan program Sistem Pemesanan Penitipan Hewan.
 * Program ini menerima input dari pengguna berupa data pemilik, jenis hewan, lama penitipan,
 * serta harga per hari, kemudian menghitung total biaya dan menampilkan nota pemesanan.
 *
 * @author [Nama Kamu]
 * @version 1.0
 */
public class Main {

    /**
     * Method utama untuk menjalankan program.
     * Mengambil input dari pengguna dan memanggil method dari kelas Pet dan Booking.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sistem Pemesanan Penitipan Hewan ===");
        System.out.print("Nama Pemilik: ");
        String ownerName = input.nextLine();
        System.out.print("Jenis Hewan: ");
        String petType = input.nextLine();
        System.out.print("Lama Penitipan (hari): ");
        int days = input.nextInt();
        System.out.print("Harga per Hari: ");
        double dailyRate = input.nextDouble();

        // Membuat objek Pet dan Booking
        Pet pet = new Pet(ownerName, petType, days, dailyRate);
        Booking booking = new Booking(pet);

        // Menampilkan hasil pemesanan
        booking.displayInfo();
    }
}
//ufyttgyvyvvgyv