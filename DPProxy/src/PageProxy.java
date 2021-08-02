public class PageProxy implements PageToko{

    private PegawaiToko pegawaiToko;
    private Page page;

    public PageProxy(PegawaiToko pegawaiToko){
        this.pegawaiToko = pegawaiToko;
    }

    @Override
    public void performOperations() {
        if(pegawaiToko.getUserName().equalsIgnoreCase("kohan") &&
                pegawaiToko.getPassword().equals("1234") && pegawaiToko.jabatan.equals("Pegawai Senior")){
            page = new Page();
            page.performOperations();
        }else{
            System.out.println("Kamu tidak diberi akses untuk mengakses halaman produk ....");
        }
    }
}
