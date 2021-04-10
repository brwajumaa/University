
public class even_number {
    public static void main(String[]args){
        int num =0;
        for(int i=0; i<=20; i++) {
            if(i%2==0) {
                num+=i;
            }
        }
        System.out.println(num);
    }
}
