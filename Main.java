import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }
    static String nhapChuoi() {
        Scanner a = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String s = a.nextLine();
        return s;
    }
    static void timADau(String s) {
        System.out.println("Vị trí a đầu: " + s.indexOf('a'));
    }
    static void timACuoi(String s) {
        System.out.println("Vị trí a cuối: " + s.lastIndexOf('a'));
    }
    static void thayA(String s) {
        char a[] = s.toCharArray();
        for (int i = s.indexOf('a'); i < a.length; i++) {
            a[i] = 'b';
            String s1 = new String(a);
            System.out.println("Chuỗi sau khi thay: " + s1);
            break;
        }
    }
    static void thayTatCaA(String s) {
        String s1 = s.replace('a', 'b');
        System.out.println("Chuỗi sau khi thay: " + s1);
    }
    static void xacDinhChuoiChuaSo(String s) {
        char b[] = s.toCharArray();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (b[i] >= 48 && b[i] <= 57) {
                count++;
                continue;
            } else {
                System.out.println("Chuỗi có chứa ký tự khác !");
                break;
            }
        }
        if (count == s.length()) {
            System.out.println("Chuỗi chỉ chứa số !");
        }
    }
    static void xacDinhChuoiChuaKyTu(String s) {
        char b[] = s.toCharArray();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (b[i] >= 65 && b[i] <= 90 || b[i] >= 97 && b[i] <= 122) {
                count++;
                continue;
            } else {
                System.out.println("Chuỗi có chứa ký tự khác !");
                break;
            }
        }
        if (count == s.length()) {
            System.out.println("Chuỗi chỉ chứa chữ !");
        }
    }
    static void upPerCase(String s) {
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[0] = Character.toUpperCase(arr[0]);
            if (arr[i] == 32) {
                arr[i + 1] = Character.toUpperCase(arr[i + 1]);
            }
        }
        String s1 = new String(arr);
        System.out.println("Chuỗi sau khi chuẩn hóa: " + s1);
    }
    static void xoaKhoangTrang(String s) {
        String s1 = s.trim();
        while (s1.indexOf("  ") != -1) {
            s1 = s1.replaceAll("  ", " ");
        }
        System.out.println("Chuỗi: " + s1);
    }
    static void chenKyTu(String s) {
        StringBuilder s1 = new StringBuilder(s);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ký tự cần chèn: ");
        String c = sc.nextLine();
        System.out.println("Nhập vị trí cần chèn: ");
        int a = sc.nextInt();
        s1.insert(a, c);
        System.out.println("Chuỗi sau khi chèn: " + s1);
    }
    static void soSanh(String s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi B:");
        String s1 = sc.nextLine();
        int a = s.compareTo(s1);
        if (a < 0) {
            System.out.println("Chuỗi A bé hơn chuỗi B !");
        }
        if (a == 0) {
            System.out.println("Chuỗi A bằng với chuỗi B !");
        }
        if (a > 0) {
            System.out.println("Chuỗi A lớn hơn chuỗi B !");
        }
    }
    static void chuyenChuHoa(String s) {
        String s1 = s.toUpperCase();
        System.out.println("Chuỗi sau khi chuyển: " + s1);
    }
    static void chuyenChuThuong(String s) {
        String s1 = s.toLowerCase();
        System.out.println("Chuỗi sau khi chuyển: " + s1);
    }
    static void chuyenIntSangString(String s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên:");
        int a = sc.nextInt();
        String s1 = String.valueOf(a);
        System.out.println("Chuỗi sau khi chuyển: " + s1);
    }
    static void formatString(String s) {
        StringBuilder s1 = new StringBuilder(s);
        int a = s1.length() - 3;
        while (a > 0) {
            a -= 3;
            s1.insert(a, ',');
        }
        System.out.println("Chuỗi sau khi format: " + s1);
    }
    static void formatThapPhan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String s = sc.nextLine();
        int b = s.lastIndexOf('.');
        while (b != s.length() - 3) {
            System.out.println("Nhập sai giá trị, yêu cầu nhập lại số thập phân có 2 chữ số sau ký tự chấm");
            s = sc.nextLine();
        }
        StringBuilder s1 = new StringBuilder(s);
        int a = s1.length() - 6;
        while (a > 0) {
            s1.insert(a, ',');
            a -= 3;
        }
        System.out.println("Chuỗi sau khi format: " + s1);
    }
    static void tacChuoiCon() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String s = sc.nextLine();
        while (s.indexOf(' ') == -1) {
            System.out.println("Nhập sai kiểu nhập, mời nhập lại: ");
            s = sc.nextLine();
        }
        String s1 = s.replaceAll(" ", "\",\"");
        StringBuilder s2 = new StringBuilder(s1);
        int vtCuoi = s1.length() + 1;
        s2 = s2.insert(0, '[');
        s2 = s2.insert(vtCuoi, ']');
        vtCuoi = s2.length();
        s2 = s2.insert(1, '"');
        s2 = s2.insert(vtCuoi, '"');
        System.out.println("Chuỗi sau khi format: " + s2);


    }
    static void cong2ChuoiSo() {
        BigDecimal a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi số:");
        a = new BigDecimal(sc.next());
        System.out.println("Nhập chuỗi số:");
        b = new BigDecimal((sc.next()));
        c = a.add(b);
        System.out.println("Chuỗi a + b = " + c);
    }
}
