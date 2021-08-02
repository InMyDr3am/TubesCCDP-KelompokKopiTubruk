public class AbstractFactoryPatternDemo {

    public static void main(String[] args){
        //Memilih Baju
        AbstractFactory penjualanBaju = FactoryProduksi.getFactory(FactoryProduksi.PILIH_BAJU);
        Baju penjualanBaju1 = penjualanBaju.getBaju(JenisBaju.bajuPendek);
        penjualanBaju1.kodeBaju();
        penjualanBaju1.hargaBaju();

        Baju penjualanBaju2 = penjualanBaju.getBaju(JenisBaju.bajuPanjang);
        penjualanBaju2.kodeBaju();
        penjualanBaju2.hargaBaju();

        //Memilih Celana
        AbstractFactory penjualanCelana = FactoryProduksi.getFactory(FactoryProduksi.PILIH_CELANA);
        Celana penjualanCelana1 = penjualanCelana.getCelana(JenisCelana.celanaPendek);
        penjualanCelana1.kodeCelana();
        penjualanCelana1.hargaCelana();

        Celana penjualanCelana2 = penjualanCelana.getCelana(JenisCelana.celanaPanjang);
        penjualanCelana2.kodeCelana();
        penjualanCelana2.hargaCelana();

        //Memilih Jaket
        AbstractFactory penjualanJaket = FactoryProduksi.getFactory(FactoryProduksi.PILIH_JAKET);
        Jaket penjualanJaket1 = penjualanJaket.getJaket(JenisJaket.zipper);
        penjualanJaket1.kodeJaket();
        penjualanJaket1.hargaJaket();

        Jaket penjualanJaket2 = penjualanJaket.getJaket(JenisJaket.hoodie);
        penjualanJaket2.kodeJaket();
        penjualanJaket2.hargaJaket();
    }
}
