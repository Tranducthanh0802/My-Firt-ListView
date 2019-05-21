package tranthanh.dmt.listviewcauthu;

public class cauthu {
    private String HoTen;
    private String Tuoi;
    private String ViTri;
    private String QuocTich;
    private int Hinh;

    public cauthu(String hoTen, String tuoi, String viTri, String quocTich, int hinh) {
        HoTen = hoTen;
        Tuoi = tuoi;
        ViTri = viTri;
        QuocTich = quocTich;
        Hinh = hinh;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }


    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getTuoi() {
        return Tuoi;
    }

    public void setTuoi(String tuoi) {
        Tuoi = tuoi;
    }

    public String getViTri() {
        return ViTri;
    }

    public void setViTri(String viTri) {
        ViTri = viTri;
    }

    public String getQuocTich() {
        return QuocTich;
    }

    public void setQuocTich(String quocTich) {
       QuocTich = quocTich;
    }
}
