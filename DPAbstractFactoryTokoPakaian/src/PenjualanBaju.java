public class PenjualanBaju extends AbstractFactory {

    @Override
    Baju getBaju(String baju){
        if (baju.equals(JenisBaju.bajuPendek)){
            return new BajuPendek();
        }
        else if (baju.equals(JenisBaju.bajuPanjang)){
            return new BajuPanjang();
        }
        return null;
    }

    Celana getCelana(String celana){
        return null;
    }

    Jaket getJaket(String jaket){
        return null;
    }
}
