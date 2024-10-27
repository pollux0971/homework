//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int[] randnum(int ft,int bk,int all){
        int[] result = new int[all];
        int ct=0;
        aaa: for(;ct!=all;){
            int tmp = (int)(Math.random()*10000)%(bk-ft+1)+ft;
            for(int i=0;i<ct;i++){
                if(result[i]==tmp){
                    continue aaa;
                }
            }
            result[ct] = tmp;
            ct++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] result = randnum(1,6,3);
        for(int i:result){
            System.out.println(i);
        }

    }
}