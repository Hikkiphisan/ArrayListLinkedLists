import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NEwArrayList quanLy = new NEwArrayList();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("*********** Quản lý sinh viên **********");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Xoá sinh viên");
            System.out.println("4. Hiển thị danh sách sinh viên có GPA > 8");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    quanLy.hienthisinhvien();
                    break;
                case 2:
                    System.out.print("Nhập ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập email: ");
                    String email = scanner.nextLine();
                    System.out.print("Nhập GPA: ");
                    double GPA = scanner.nextDouble();
                    Student sv = new Student(id, name, email, GPA);
                    quanLy.themSinhvien(sv);
                    break;
                case 3:
                    System.out.print("Nhập ID của sinh viên cần xoá: ");
                    int idXoa = scanner.nextInt();
                    quanLy.xoaSinhVien(idXoa);
                    break;
                case 4:
                    quanLy.hienthidanhsachsinhvienGPA();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Chức năng không hợp lệ!");
            }
        } while (true);
    }
}
