public class FactoryProduksi {

    public static final String PILIH_BAJU = "Memilih Baju";
    public static final String PILIH_CELANA = "Memilih Celana";
    public static final String PILIH_JAKET = "Memilih Jaket";

    public static AbstractFactory getFactory(String pilihan){
        if (pilihan.equals(PILIH_BAJU)){
            return new PenjualanBaju();
        }
        else if (pilihan.equals(PILIH_CELANA)){
            return new PenjualanCelana();
        }
        else if (pilihan.equals(PILIH_JAKET)){
            return new PenjualanJaket();
        }
        return null;
    }
}
