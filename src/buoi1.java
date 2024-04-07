import com.sun.jdi.Value;
import com.sun.source.doctree.SummaryTree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class buoi1 {

    public static void main(String[] args) {
        //1
       System.out.println("Xin chào các bạn.");
       //2
        Scanner scanner = new Scanner(System.in);
        System.out.println( "nhap ten:");
        String name = scanner.nextLine();
        System.out.println(" Xin chao:" + name);
        //3
        hello("Minh Anh");

        //4
        int a = 1;
        int b = 2;
        int sum = a + b;
        System.out.println(" tong cua a va b la:" +sum );
        //5
        int c = 5;
        int tich = c*c;
        System.out.println(" binh phuong cua c la:" +tich);
    }
    //3
    public static void hello (String d ){
        System.out.println(" xin chao\" "+d+"\"");
    }





}
