public class BajuPendek extends Toko{
    public BajuPendek(Produk produk) {
        super(produk);
        this.produk.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Harga Baju Pendek : "+produk.getHarga());
    }
}
