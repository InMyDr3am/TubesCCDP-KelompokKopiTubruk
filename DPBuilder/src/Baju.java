public abstract class Baju implements Barang{
    @Override
    public Packing bungkus() {
        return new Bungkusan();
    }
    @Override
    public abstract int harga();
}
