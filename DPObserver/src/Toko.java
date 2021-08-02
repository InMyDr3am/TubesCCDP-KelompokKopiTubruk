public abstract class Toko {
    protected Produk produk;

    public Toko(Produk produk){
        this.produk = produk;
    }

    public abstract void update();
}
