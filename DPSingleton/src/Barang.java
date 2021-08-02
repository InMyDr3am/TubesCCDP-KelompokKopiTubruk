public class Barang {
    private static Barang barang = new Barang();

    private Barang(){
        System.out.println("Baju Panjang Rp. 30000");
    }
    public static Barang getInstance() {
        return barang;
    }
}
