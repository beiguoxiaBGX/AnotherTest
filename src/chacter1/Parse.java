package chacter1;

public class Parse {
    public static void main(String args[]){
        float pi = 3.14f;
        String s = String.valueOf(pi);
        System.out.print("s:"+s);
        System.out.println();
        float p = Float.parseFloat(s);
        System.out.print(p);
    }
}
