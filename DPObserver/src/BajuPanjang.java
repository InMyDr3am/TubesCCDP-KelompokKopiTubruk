public class BajuPanjang extends Toko {

    public BajuPanjang(Produk produk) {
        super(produk);
        this.produk.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Harga Baju Panjang: "+produk.getHarga());
    }
}
