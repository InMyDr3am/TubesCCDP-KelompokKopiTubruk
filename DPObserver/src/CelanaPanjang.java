public class CelanaPanjang extends Toko{
    public CelanaPanjang(Produk produk) {
        super(produk);
        this.produk.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Harga Celana Panjang: "+produk.getHarga());
    }
}
