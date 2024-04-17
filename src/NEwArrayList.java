import java.util.ArrayList;
import java.util.ArrayList;


public class NEwArrayList {

   private ArrayList<Student> mangdanhsachsinhvien;
   public NEwArrayList() {
       mangdanhsachsinhvien = new ArrayList<>();
   }

    public void hienthisinhvien() {
        System.out.println("Danh sách sinh viên: ");
        for (Student sv : mangdanhsachsinhvien) {
                    System.out.println(mangdanhsachsinhvien);
        }

    }
    public void themSinhvien(Student sv) {
       mangdanhsachsinhvien.add(sv);
       System.out.println("Thêm sinh viên thành công!");
    }

    public void xoaSinhVien(int id) {
        int vitrisinhvientrongmang = -1;
        for (int i = 0; i < mangdanhsachsinhvien.size(); i++) {
            if (mangdanhsachsinhvien.get(i).getId() == id) {
                vitrisinhvientrongmang = i;
                break;
            }
        }
        if (vitrisinhvientrongmang != -1) {
            mangdanhsachsinhvien.remove(vitrisinhvientrongmang);
            System.out.println("Xoá sinh viên thành công!");
        } else {
            System.out.println("Không tìm thấy sinh viên có ID: " + id);
        }
    }


    public void hienthidanhsachsinhvienGPA() {
        System.out.println("Danh sách sinh viên GPA > 8:");
        for (Student student : mangdanhsachsinhvien) {
            if (student.getGPA() > 8) {
                System.out.println(student);
            }
        }
    }
}