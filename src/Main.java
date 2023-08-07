public class Main {
   public static void main(String[] args) {
       System.out.println("Задача 1");
  int a1 = 2000000000;
   byte b1 = 127;
   short c1 = 32000;
   long d1 = 922332036854775807L;
   float e1 = 0.8f;
   double f1 = 1.777777;
       System.out.println("Значение переменной b с типом byte равно " + b1);
        System.out.println("Значение переменной c с типом short равно " + c1);
        System.out.println("Значение переменной a с типом short равно " + a1);
        System.out.println("Значение переменной d с типом long равно " + d1);
        System.out.println("Значение переменной e с типом float равно " + e1);
        System.out.println("Значение переменной f с типом double равно " + f1);
       System.out.println("Задача 2");
        int a2 = 27897;
   byte b2 = 67;
   short c2 = 569;
   long d2 = 987678965549L;
   float e2 = 27.12f;
   double f2 = 2.786;
       System.out.println("Задача 3");
   byte l3 = 23;
   byte a3 = 27;
   byte e3 = 30;
   short b3 = 480;
   int an = (b3 / (l3+a3+e3)); //Здесь почему-то попросил меня поставить int, нужно разобраться, я хотел short
System.out.println("На каждого ученика рассчитано" + an + "листов бумаги");
       System.out.println("Задача 4");
        byte bottle2 = 16;
   byte time2 = 2;
   int bottle = bottle2 / time2; //почему-то в таком случае принимает только инт
   int a4 = bottle * 20; //правильно ли я делаю, что пишу просто значения времени, либо нужно объявить каждое число?
   int b4 = bottle*24*60;
   int c4 = bottle*24*3*60;
   int d4 = bottle*24*60*30;
System.out.println("За 20 минут машина произвела " + a4 + " штук бутылок");
        System.out.println("За сутки машина произвела " + b4 + " штук бутылок"); //разобрался с пробелами
        System.out.println("За 3 дня машина произвела " + c4 + " штук бутылок");
        System.out.println("За месяц машина произвела " + d4 + " штук бутылок");
       System.out.println("Задача 5");
        byte bottleColors = 120;
   byte whiteBottle = 2;
   byte brownBottle = 4;
   int  n = bottleColors / (whiteBottle + brownBottle);
   int nw = n*whiteBottle;
   int nb = n*brownBottle;
   System.out.println("В школе, где " + n + " классов, нужно " + nw +  " банок белой краски и " + nb + " банок коричневой краски");
       System.out.println("Задача 6");
   short banana = 5*80;
   short milk = 105*2;
   short iceCream = 2*100;
   short egs = 4*70;
   int n6 = banana + milk + iceCream + egs;
   float c = n6/1000f;
   System.out.println("Вес завтрака в граммах " + n6);
   System.out.println("Вес завтрака в килограммах " + c);
       System.out.println("Задача 7");
   short weigh = 7*1000;
   short lightWeigh = 250;
   short hardWeigh = 500;
   int a7 = weigh/lightWeigh;
   int b7 = weigh/hardWeigh;
   int c7 = (a7+b7)/2; //не уверен, что правильно сделал уравнение
   System.out.println("Дней потребуется при дневной потере 250гр - " + a7 + ", при дневной потере 500гр - " + b7 + ", а среднее количество дней равно " + c7);
       System.out.println("Задача 8");
   int masha = 67760;
   int denis = 83690;
   int kristina = 76230;
   float am = masha+masha*0.1f;
   float ad = denis+denis*0.1f;
   float ak = kristina+kristina*0.1f;
   float bm = am*12-masha*2;
   float bd = ad*12-denis*12;
   float bk = ak*12-kristina*12;
System.out.println("Маша теперь получает " + am + " рублей. Годовой доход вырос на "+ bm + " рублей");
System.out.println("Денис теперь получает " + ad + " рублей. Годовой доход вырос на "+ bd + " рублей");
System.out.println("Кристина теперь получает " + ak + " рублей. Годовой доход вырос на "+ bk + " рублей");
    }
}