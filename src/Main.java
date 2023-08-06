public class Main {
    public static void main(String[] args) {
   short banana = 5*80;
   short milk = 105*2;
   short iceCream = 2*100;
   short egs = 4*70;
   int n = banana + milk + iceCream + egs;
   float c = n/1000f;
   System.out.println("Вес завтрака в граммах " + n);
   System.out.println("Вес завтрака в килограммах " + c);
    }
}