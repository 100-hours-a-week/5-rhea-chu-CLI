package LuckyItemRecommendation;

import java.util.Scanner;

public class LuckyItemMain {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        UserChoice choice = new UserChoice();
        Intro();

        System.out.println(".･ ｡ ⊹ + ஐ ஐ 시 작 하 시 겠 습 니 까? (y / n) ஐ ஐ *+ ⊹ ｡ ･.");

        String str = sc.nextLine();
        if("y".equals(str)){
            choice.TodayWeather();
        }
        else {
            choice.ErrorMsg();
        }
        sc.close();

    }
    private static void Intro() {
        System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
        System.out.println(".･ ｡ ⊹ + *오늘의 행운을 높이고 싶은 당신! + ⊹ ｡ ･.");
        System.out.println(".･ ｡ ⊹ + 당신의 *행운을 높일 수 있는 방법 + ⊹ ｡ ･.");
        System.out.println(".･ ｡ ⊹ + * ஐ ஐ ஐ 알고싶다면?ஐ ஐ ஐ * + ⊹ ｡ ･.");
        System.out.println(".･ ｡ ⊹ + * ஐ지금 바로 문항에 응답하고ஐ * + ⊹ ｡ ･.");
        System.out.println(".･ ｡ ⊹ +‧₊˚⊹ ஐ 행운을 만끽하세요~ ஐ ⊹˚₊‧ + ｡ ･.");
        System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ *+ ⊹ ｡ ･." + "\n");
    }
}
