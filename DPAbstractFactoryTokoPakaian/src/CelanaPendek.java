public class CelanaPendek implements Celana {

    private String namaCelana = CelanaPendek.class.getSimpleName();

    @Override
    public void kodeCelana() {
        System.out.println("CPD001 : "+namaCelana);
    }

    @Override
    public void hargaCelana() {
        System.out.println("Rp 120.000 ");
    }
}
