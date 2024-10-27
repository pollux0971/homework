import java.util.Scanner;

public class Main {
    static int randrange(int from,int to){
        return (int)( Math.random()*(to-from))+from;
    }
    static void SOP(int num,String[] f_list,String[][] f_type){
        int r1 = randrange(1,num);
        int r2 = randrange(1,f_type[r1].length);
        System.out.println("=========================================");
        System.out.println("Today's dinner is ...");
        System.out.println(f_type[r1][r2] + " (" + f_list[r1] + ")");
        System.out.println("Enjoy your meals!!");
        System.out.println("=========================================");
    }
    static void print_menu(int num,String[] f_list,String[][] f_type){
        System.out.println("=========================================");
        System.out.println("-------------Today's menu!!--------------");
        for(int i=0;i<num;i++){
            System.out.print(f_list[i]+": ");
            for(String j:f_type[i]){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("=========================================");
    }
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("please enter the food type");
        String[] foodtype = S.nextLine().split(" ");
        int num = foodtype.length;
        String[][] foodList = new String[num][];

        System.out.println("please enter the same type of food in the same line");
        for (int i = 0; i < num; i++) {
            String[] input = S.nextLine().split(" ");
            foodList[i] = input;
        }
        print_menu(num,foodtype,foodList);
        SOP(num,foodtype,foodList);
        S.close();
    }
}