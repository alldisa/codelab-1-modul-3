/**
 * Kelas Booking bertanggung jawab menghitung total biaya penitipan,
 * diskon, dan pembayaran akhir. Kelas ini menggunakan objek Pet
 * untuk mendapatkan data lama penitipan dan harga per hari.
 *
 * @author [Nama Kamu]
 * @version 1.0
 */
public class Booking {
    private static final double DISCOUNT_RATE = 0.1; // 10% diskon
    private Pet pet;

    /**
     * Konstruktor untuk membuat objek Booking baru.
     *
     * @param pet objek Pet yang berisi data hewan dan pemilik
     */
    public Booking(Pet pet) {
        this.pet = pet;
    }

    /**
     * Menghitung total biaya penitipan hewan berdasarkan jumlah hari dan harga per hari.
     *
     * @return total biaya penitipan
     */
    public double calculateTotal() {
        return pet.getDays() * pet.getDailyRate();
    }

    /**
     * Menghitung diskon jika total biaya lebih dari Rp200.000.
     *
     * @return jumlah diskon
     */
    public double calculateDiscount() {
        double total = calculateTotal();
        return total > 200000 ? total * DISCOUNT_RATE : 0;
    }

    /**
     * Menghitung total akhir pembayaran setelah dikurangi diskon.
     *
     * @return jumlah pembayaran akhir
     */
    public double calculateFinalPayment() {
        return calculateTotal() - calculateDiscount();
    }

    /**
     * Menampilkan informasi hasil pemesanan penitipan hewan.
     * Termasuk nama pemilik, jenis hewan, dan total biaya setelah diskon.
     */
    public void displayInfo() {
        System.out.println("\n=== Detail Pemesanan ===");
        System.out.println("Pemilik : " + pet.getOwnerName());
        System.out.println("Hewan   : " + pet.getPetType());
        System.out.println("Total Biaya: Rp " + calculateFinalPayment());
    }
}
