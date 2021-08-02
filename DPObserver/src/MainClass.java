public class MainClass {
    public static void main(String[] args) {
        Produk BajuPanjang = new Produk();
        Produk BajuPendek = new Produk();
        Produk CelanaPanjang = new Produk();
        Produk CelanaPendek = new Produk();
        Produk JaketHoodie = new Produk();
        Produk JaketZipper = new Produk();

        new BajuPanjang(BajuPanjang);
        new BajuPendek(BajuPendek);
        new CelanaPanjang(CelanaPanjang);
        new CelanaPendek(CelanaPendek);
        new JaketHoodie(JaketHoodie);
        new JaketZipper(JaketZipper);

        BajuPanjang.setHarga(15000);
        BajuPendek.setHarga(10000);
        CelanaPanjang.setHarga(25000);
        CelanaPendek.setHarga(20000);
        JaketHoodie.setHarga(38500);
        JaketZipper.setHarga(40000);
    }
}
