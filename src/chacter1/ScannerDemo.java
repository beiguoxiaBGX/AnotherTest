package chacter1;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入地名");
        String location = scanner.next();
        System.out.println("请输入公司名称");
        String companyName = scanner.next();
        System.out.println("请输入老板名称");
        String bossName = scanner.next();
        System.out.println("请输入金额");
        String price = scanner.next();
        System.out.println("请输入产品");
        String goods = scanner.next();
        System.out.println("请输入价格计量单位");
        String priceUnit = scanner.next();
        String s = "%s最大皮革厂江南皮革厂倒闭了，王八蛋老板黄鹤吃喝嫖赌，欠下了3.5个亿，带着他的小姨子跑了!我们没有办法，拿着钱包抵工资!原价都是一百多、两百多、三百多的钱包，现在全部只卖二十块，统统只要二十块!黄鹤王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!";
        System.out.printf(s,location);
    }
}
