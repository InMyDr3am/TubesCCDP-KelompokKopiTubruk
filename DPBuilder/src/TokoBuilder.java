public class TokoBuilder {
    public Toko paket1(){
        Toko toko = new Toko();
        toko.add(new BajuPanjang());
        toko.add(new CelanaPanjang());
        toko.add(new JaketZipper());
        return toko;
    }

    public Toko paket2(){
        Toko toko = new Toko();
        toko.add(new BajuPendek());
        toko.add(new CelanaPendek());
        toko.add(new JaketHoodie());
        return toko;
    }
}
