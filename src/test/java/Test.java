/**
 * @author lzx
 * @date 2023/2/21 14:47
 * @description: TODO
 */
public class Test {
    public static void main(String[] args) {

    }

    @org.junit.jupiter.api.Test
    public void agg(){

       int a = -2147483648;
       StringBuilder s1 = new StringBuilder(String.valueOf(a));
       System.out.println(s1.replace(0, 1, "0"));
       System.out.println("Test");
    }

    @org.junit.jupiter.api.Test
    public void IntegerOverFlow(){
        long l = Integer.MAX_VALUE + 1;
        System.out.println(l);
    }
}
