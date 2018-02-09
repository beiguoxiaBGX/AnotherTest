package chacter1;

public class Boxing {
    public static void main(String args[]){
        byte b = 5;
        /*自动装箱*/
        Byte b1 = b;
        byte bUnboxing = b1;
        System.out.print("byte 最大值"+" "+Byte.MAX_VALUE);
        System.out.print("byte 最小值"+" "+Byte.MIN_VALUE);
    }
}
