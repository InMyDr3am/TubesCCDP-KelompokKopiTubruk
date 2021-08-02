public class PenjualanCelana extends AbstractFactory {

    @Override
    Celana getCelana(String celana){
        if (celana.equals(JenisCelana.celanaPendek)){
            return new CelanaPendek();
        }
        else if (celana.equals(JenisCelana.celanaPanjang)){
            return new CelanaPanjang();
        }
        return null;
    }

    Baju getBaju(String baju){
        return null;
    }

    Jaket getJaket(String jaket){
        return null;
    }
}
