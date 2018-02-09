package chacter1;

import java.util.Scanner;

public class SplitDemo {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String s = scanner.next();
        System.out.printf(s);
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
