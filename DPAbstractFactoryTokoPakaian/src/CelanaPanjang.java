public class CelanaPanjang implements Celana {

    private String namaCelana = CelanaPanjang.class.getSimpleName();

    @Override
    public void kodeCelana() {
        System.out.println("CPJ002 : "+namaCelana);
    }

    @Override
    public void hargaCelana() {
        System.out.println("Rp 160.000 ");
    }
}
