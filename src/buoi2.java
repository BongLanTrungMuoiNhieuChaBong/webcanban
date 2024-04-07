import java.time.LocalDate;
import java.util.Scanner;

public class buoi2 {
    public static void main(String[] args) {
//        //1
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" nhap chieu dai:");
//        int length = sc.nextInt();
//
//        System.out.println( " nhap chieu rong:");
//        int width = sc.nextInt();
//        int tich= length * width;
//        int dienTich= 2*(length + width);
//        System.out.println(" Dien tich hinh chu nhat la:" +tich );
//        System.out.println( " Chu vi hinh chu nhat la: " + dienTich);

        // 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();

        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();

        System.out.println("Nhập tuổi: ");
        int age = sc.nextInt();

        System.out.println("Xin chào, tôi tên là " + name + ", " +
                "năm nay tôi " + age + " tuổi, " +
                "hiện mình đang sinh sống và làm việc tại " + address);
    }
}
