public class BajuPanjang implements Baju {

    private String namaBaju = BajuPanjang.class.getSimpleName();

    @Override
    public void kodeBaju() {
        System.out.println("BPJ002 : "+namaBaju);
    }

    @Override
    public void hargaBaju() {
        System.out.println("Rp 120.000 ");
    }
}
