package homework1;

public class ZadanieNetto {
    
    public static double obliczCeneNetto(double cenaBrutto, double stawkaPodatku) {
        double cenaNetto = cenaBrutto / (1 + stawkaPodatku);
        return cenaNetto;
    }

    public static void main(String[] args) {

    double cenaBrutto = 123.45;
    double stawkaPodatku = 0.23;
    double cenaNetto = obliczCeneNetto(cenaBrutto, stawkaPodatku);
    System.out.println("Cena netto: " + cenaNetto);
    }
    
}