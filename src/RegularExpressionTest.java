import java.sql.SQLOutput;
import java.util.Scanner;

public class RegularExpressionTest {
    public static void main(String[] args) {
        RegularExpression regularExpression=new RegularExpression();
        System.out.println("Nhập số điện thoại:");
        Scanner scanner=new Scanner(System.in);
        String input =scanner.nextLine();
        boolean check = regularExpression.validate(input);
        if(check){
            System.out.println("Số điện thoại hợp lệ");
        }else {
            System.out.println("Số điện thoại không hợp lệ");
        }
    }
}
