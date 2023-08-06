public class Main {
    public static void main(String[] args) {
   short weigh = 7*1000;
   short lightWeigh = 250;
   short hardWeigh = 500;
   int a = weigh/lightWeigh;
   int b = weigh/hardWeigh;
   int c = (a+b)/2; //не уверен, что правильно сделал уравнение
   System.out.println("Дней потребуется при дневной потере 250гр - " + a + ", при дневной потере 500гр - " + b + ", а среднее количество дней равно " + c);
    }
}