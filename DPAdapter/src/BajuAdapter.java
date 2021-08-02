public class BajuAdapter implements Baju{
    @Override
    public void namaBaju() {
        System.out.println("Baju Panjang");
    }

    @Override
    public void hargaBaju() {
        System.out.println("25000");
    }

    @Override
    public void warnaBaju() {
        System.out.println("Merah");
    }
}
