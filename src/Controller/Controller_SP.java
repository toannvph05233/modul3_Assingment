package Controller;

import java.util.ArrayList;

public class Controller_SP {

    public void createSP(ArrayList<SanPham> arrayList, SanPham sanPham) {
        arrayList.add(sanPham);
    }

    public void editSP(ArrayList<SanPham> arrayList, SanPham sanPham, int index) {
        arrayList.set(index, sanPham);
    }

    public void deleteSP(ArrayList<SanPham> arrayList, int index) {
        arrayList.remove(index);
    }

    public NguoiDung findByIdND(ArrayList<NguoiDung> arrayList, String user) {
        for (NguoiDung x : arrayList) {
            if (x.getUser().equals(user)) {
                return x;
            }
        }
        return null;
    }

    public SanPham findByIdSP(ArrayList<SanPham> arrayList, String user) {
        for (SanPham x : arrayList) {
            if (x.getIdSP().equals(user)) {
                return x;
            }
        }
        return null;
    }

    public int findIdSP(ArrayList<SanPham> arrayList, String idSP) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getIdSP().equals(idSP)) {
                return i;
            }
        }
        return -1;
    }
}
