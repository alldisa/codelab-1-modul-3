public class LongestName {
    public static void main(String[] args) {
        String[] names = {"Andi", "Budi", "Christopher", "Ani"};
        String longest = "";
        for (int i = 0; i <= names.length; i++) { //
            if (names[i].length() > longest.length()) {
                longest = names[i];
            }
        }
        System.out.println("Nama terpanjang: " + longest);
    }
}
