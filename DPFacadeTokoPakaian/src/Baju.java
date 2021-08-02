public class Baju implements TokoPakaian {

    @Override
    public void kodePakaian() {
        System.out.println("B1001");
    }

    @Override
    public void modelPakaian() {
        System.out.println("Baju Lengan Pendek");
    }

    @Override
    public void harga() {
        System.out.println("Rp 99.000");
    }
}
