public class CelanaPendek extends Toko {

    public CelanaPendek(Produk produk) {
        super(produk);
        this.produk.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Harga Celana Pendek : "+produk.getHarga());
    }
}
