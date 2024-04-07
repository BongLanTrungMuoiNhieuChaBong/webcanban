public class buoi3 {
    public static void main(String[] args) {
        //1
        String chuoi = "a";
        String ketQua = repeatString(chuoi);
        System.out.println(ketQua);
        //2
//        String chuoi = "a-";
//        String ketQua = respeatString(chuoi);
//        System.out.println(ketQua);
//        //4
        int tong = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0) {
                tong += i;
            }
        }
        System.out.println(" Rong cac so chia het cho 5:" + tong);
        //6
        printFizzBuzz();
    }
    public static void printFizzBuzz(){
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println( " khong ket qua");
            }
        }
    }
    public static String repeatString(String chuoi) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            builder.append(chuoi);
        }
        return builder.toString();
    }
}
