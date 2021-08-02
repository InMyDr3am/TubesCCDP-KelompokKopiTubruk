public class PegawaiController {

    private Pegawai model;
    private PegawaiView view;

    public PegawaiController(Pegawai model, PegawaiView view){
        this.model = model;
        this.view = view;
    }

    public void setPegawaiId(String id) {
        model.setId(id);
    }

    public String getPegawaiId() {
        return model.getId();
    }

    public void setPegawaiNama(String nama) {
        model.setNama(nama);
    }

    public String getPegawaiNama() {
        return model.getNama();
    }

    public void setPegawaiIdRole(String idRole) {
        model.setIdRole(idRole);
    }

    public String getPegawaiIdRole() {
        return model.getIdRole();
    }

    public void setPegawaiNamaRole(String namaRole) {
        model.setNamaRole(namaRole);
    }

    public String getPegawaiNamaRole() {
        return model.getNamaRole();
    }

    public void updateView(){
        view.printPegawaiDetails(model.getId(), model.getNama(),
                model.getIdRole(), model.getNamaRole());
    }
}
