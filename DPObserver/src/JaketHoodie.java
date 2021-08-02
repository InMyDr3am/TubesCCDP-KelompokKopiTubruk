public class JaketHoodie extends Toko{

    public JaketHoodie(Produk produk) {
        super(produk);
        this.produk.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Harga Jaket Hoodie : "+produk.getHarga());
    }
}
