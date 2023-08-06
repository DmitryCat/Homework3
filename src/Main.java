public class Main {
    public static void main(String[] args) {
   byte bottleColors = 120;
   byte whiteBottle = 2;
   byte brownBottle = 4;
   int  n = bottleColors / (whiteBottle + brownBottle);
   int nw = n*whiteBottle;
   int nb = n*brownBottle;
   System.out.println("В школе, где " + n + " классов, нужно " + nw +  " банок белой краски и " + nb + " банок коричневой краски");
    }
}