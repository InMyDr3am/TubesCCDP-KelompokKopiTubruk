public class JaketZipper extends Toko{

    public JaketZipper(Produk produk) {
        super(produk);
        this.produk.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Harga Jaket Zipper : "+produk.getHarga());
    }
}
