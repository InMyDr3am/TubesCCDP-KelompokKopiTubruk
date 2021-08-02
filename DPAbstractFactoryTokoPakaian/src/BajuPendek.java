public class BajuPendek implements Baju {

    private String namaBaju = BajuPendek.class.getSimpleName();

    @Override
    public void kodeBaju() {
        System.out.println("BPD001 : "+namaBaju);
    }

    @Override
    public void hargaBaju() {
        System.out.println("Rp 100.000 ");
    }
}
