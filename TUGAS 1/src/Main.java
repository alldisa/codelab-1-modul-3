import java.util.Scanner;

/**
 * Aplikasi Pemesanan Restoran "RasaNusantara"
 * - Menghitung total harga + diskon otomatis
 */
class RasaNusantara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Daftar Menu Restoran
        String[] menu = {"Nasi Goreng Spesial", "Ayam Bakar Madu", "Sate Ayam", "Mie Goreng Jawa", "Es Teh Manis"};
        double[] harga = {18000, 20000, 15000, 17000, 5000};

        System.out.println("==================================");
        System.out.println(" SELAMAT DATANG DI RASA NUSANTARA ");
        System.out.println("==================================");
        System.out.println("Daftar Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
        }

        System.out.print("\nBerapa jenis menu yang ingin Anda pesan? ");
        int jumlahMenu = input.nextInt();

        // Array,perulangan for menyimpan pesanan,menampilka daftar menu dan membaca pesanan
        int[] pilihan = new int[jumlahMenu];
        int[] jumlah = new int[jumlahMenu];

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("\nMasukkan nomor menu ke-" + (i + 1) + ": ");
            pilihan[i] = input.nextInt();
            System.out.print("Masukkan jumlah pesanan untuk " + menu[pilihan[i] - 1] + ": ");
            jumlah[i] = input.nextInt();
        }

        // Hitung total keseluruhan
        double total = 0;
        for (int i = 0; i < jumlahMenu; i++) {
            total += hitungTotal(harga[pilihan[i] - 1], jumlah[i]);
        }

        double diskon = hitungDiskon(total);
        double bayar = total - diskon;

        // Output Nota Pemesanan
        System.out.println("\n========= NOTA PEMESANAN =========");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println(menu[pilihan[i] - 1] + " x" + jumlah[i] + " = Rp" + (harga[pilihan[i] - 1] * jumlah[i]));
        }
        System.out.println("----------------------------------");
        System.out.println("Total    : Rp" + total);
        System.out.println("Diskon   : Rp" + diskon);
        System.out.println("Bayar    : Rp" + bayar);
        System.out.println("==================================");
        System.out.println("Terima kasih telah memesan di Rasa Nusantara!");
    }
//method
    // Custom Live Template untuk menghitung total
    public static double hitungTotal(double harga, int jumlah) {
        double total = harga * jumlah;
        return total;





    }

    // Custom Live Template untuk menghitung diskon
    public static double hitungDiskon(double total) {
        // Dapat diskon 10% jika total lebih dari Rp50.000
        if (total > 50000) {
            return total * 0.1;
        } else {
            return 0;
        }
    }
}
