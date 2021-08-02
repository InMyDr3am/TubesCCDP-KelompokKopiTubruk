public class PenjualanJaket extends AbstractFactory {

    @Override
    Jaket getJaket(String jaket){
        if (jaket.equals(JenisJaket.zipper)){
            return new Zipper();
        }
        else if (jaket.equals(JenisJaket.hoodie)){
            return new Hoodie();
        }
        return null;
    }

    Celana getCelana(String celana){
        return null;
    }

    Baju getBaju(String baju){
        return null;
    }
}
