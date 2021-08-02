public class PenjagaToko {

    private TokoPakaian baju;
    private TokoPakaian celana;
    private TokoPakaian jaket;

    public PenjagaToko() {
        baju = new Baju();
        celana = new Celana();
        jaket = new Jaket();
    }

    public void penjualanBaju(){
        baju.kodePakaian();
        baju.modelPakaian();
        baju.harga();
    }

    public void penjualanCelana(){
        celana.kodePakaian();
        celana.modelPakaian();
        celana.harga();
    }

    public void penjualanJaket(){
        jaket.kodePakaian();
        jaket.modelPakaian();
        jaket.harga();
    }
}
