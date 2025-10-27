/**
 * Kelas Pet menyimpan informasi tentang hewan yang dititipkan.
 * Termasuk nama pemilik, jenis hewan, lama penitipan, dan harga per hari.
 *
 * @author [Nama Kamu]
 * @version 1.0
 */
public class Pet {
    private String ownerName;
    private String petType;
    private int days;
    private double dailyRate;

    /**
     * Konstruktor untuk membuat objek Pet baru.
     *
     * @param ownerName nama pemilik hewan
     * @param petType jenis hewan
     * @param days lama penitipan dalam hari
     * @param dailyRate biaya penitipan per hari
     */
    public Pet(String ownerName, String petType, int days, double dailyRate) {
        this.ownerName = ownerName;
        this.petType = petType;
        this.days = days;
        this.dailyRate = dailyRate;
    }

    /**
     * Mengambil nama pemilik hewan.
     *
     * @return nama pemilik
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Mengambil jenis hewan.
     *
     * @return jenis hewan
     */
    public String getPetType() {
        return petType;
    }

    /**
     * Mengambil lama penitipan hewan.
     *
     * @return lama penitipan dalam hari
     */
    public int getDays() {
        return days;
    }

    /**
     * Mengambil biaya penitipan per hari.
     *
     * @return harga per hari
     */
    public double getDailyRate() {
        return dailyRate;
    }
}
