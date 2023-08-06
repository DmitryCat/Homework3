public class Main {
    public static void main(String[] args) {
   int masha = 67760;
   int denis = 83690;
   int kristina = 76230;
   float am = masha+masha*0.1f;
   float ad = denis+denis*0.1f;
   float ak = kristina+kristina*0.1f;
   float bm = am*12-masha*12;
   float bd = ad*12-denis*12;
   float bk = ak*12-kristina*12;
System.out.println("Маша теперь получает " + am + " рублей. Годовой доход вырос на "+ bm + " рублей");
System.out.println("Денис теперь получает " + ad + " рублей. Годовой доход вырос на "+ bd + " рублей");
System.out.println("Кристина теперь получает " + ak + " рублей. Годовой доход вырос на "+ bk + " рублей");
    }
}