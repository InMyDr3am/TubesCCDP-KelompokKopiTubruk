public class MainClass {
    public static void main(String[] args) {
        System.out.println("Ketika username dan password yang kamu inputkan benar : ");
        PegawaiToko pegawaiToko = new PegawaiToko("kohan","1234","Pegawai Senior");
        PageProxy pageProxy = new PageProxy(pegawaiToko);
        pageProxy.performOperations();

        System.out.println();

        System.out.println("Ketika username atau password yang kamu inputkan salah :");
        PegawaiToko pegawaiToko2 = new PegawaiToko("abcd","abcd","Pembantu");
        PageProxy pageProxy2 = new PageProxy(pegawaiToko2);
        pageProxy2.performOperations();
    }
}
