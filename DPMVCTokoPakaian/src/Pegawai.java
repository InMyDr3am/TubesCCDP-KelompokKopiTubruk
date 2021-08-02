public class Pegawai {

    private String id;
    private String nama;
    private String idRole;
    private String namaRole;

    public Pegawai (String id, String nama,
                    String idRole, String namaRole){
        this.id = id;
        this.nama = nama;
        this.idRole = idRole;
        this.namaRole = namaRole;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setIdRole(String idRole) {
        this.idRole = idRole;
    }

    public String getIdRole() {
        return idRole;
    }

    public void setNamaRole(String namaRole) {
        this.namaRole = namaRole;
    }

    public String getNamaRole() {
        return namaRole;
    }
}
