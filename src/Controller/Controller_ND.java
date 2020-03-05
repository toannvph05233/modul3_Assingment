package Controller;

import java.util.ArrayList;

public class Controller_ND {

    public void createND(ArrayList<NguoiDung> arrayList, NguoiDung nguoiDung) {
        arrayList.add(nguoiDung);
    }

    public void editND(ArrayList<NguoiDung> arrayList, NguoiDung nguoiDung, int index) {
        arrayList.set(index, nguoiDung);
    }

    public void deleteND(ArrayList<NguoiDung> arrayList, int index) {
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

    public int findIdND(ArrayList<NguoiDung> arrayList, String user) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getUser().equals(user)) {
                return i;
            }
        }
        return -1;
    }
}
