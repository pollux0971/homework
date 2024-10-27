import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入年份: ");
        int year = scanner.nextInt();
        System.out.print("請輸入月份: ");
        int month = scanner.nextInt();
        System.out.print("請輸入日期: ");
        int day = scanner.nextInt();
        int days = calculateDays(year, month, day);
        int dayOfWeek = days % 7;
        switch (dayOfWeek) {
            case 0:
                System.out.println("星期一");
                break;
            case 1:
                System.out.println("星期二");
                break;
            case 2:
                System.out.println("星期三");
                break;
            case 3:
                System.out.println("星期四");
                break;
            case 4:
                System.out.println("星期五");
                break;
            case 5:
                System.out.println("星期六");
                break;
            case 6:
                System.out.println("星期日");
                break;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int calculateDays(int year, int month, int day) {
        int days = 0;
        days = 365*(year-1)+(year-1)/4-(year-1)/100+(year-1)/400;
        switch ((month - 1)) {
            case 11:
                days += 30;
            case 10:
                days += 31;
            case 9:
                days += 30;
            case 8:
                days += 31;
            case 7:
                days += 31;
            case 6:
                days += 30;
            case 5:
                days += 31;
            case 4:
                days += 30;
            case 3:
                days += 31;
            case 2:
                days += ((year%4==0||year%100!=0)||year%400==0)?29:28;
            case 1:
                days += 31;
                break;
        }
        days += day - 1;
        return days;
    }
}