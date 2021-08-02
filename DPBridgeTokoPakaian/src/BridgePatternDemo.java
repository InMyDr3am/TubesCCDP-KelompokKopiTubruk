public class BridgePatternDemo {

    public static void main(String[] args){
        Ukuran baju = new DetailUkuran("M", 67, 48, new Baju());
        Ukuran jaket = new DetailUkuran("L", 69, 50, new Baju());

        baju.view();
        jaket.view();
    }
}
