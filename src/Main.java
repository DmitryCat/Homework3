public class Main {
    public static void main(String[] args) {
      byte bottle2 = 16;
      byte time2 = 2;
      int bottle = bottle2 / time2; //почему-то в таком случае принимает только инт
        int a = bottle * 20; //правильно ли я делаю, что пишу просто значения времени, либо нужно объявить каждое число?
        int b = bottle*24*60;
        int c = bottle*24*3*60;
        int d = bottle*24*60*30;
System.out.println("За 20 минут машина произвела " + a + " штук бутылок");
        System.out.println("За сутки машина произвела " + b + " штук бутылок"); //разобрался с пробелами
        System.out.println("За 3 дня машина произвела " + c + " штук бутылок");
        System.out.println("За месяц машина произвела " + d + " штук бутылок");

    }
}